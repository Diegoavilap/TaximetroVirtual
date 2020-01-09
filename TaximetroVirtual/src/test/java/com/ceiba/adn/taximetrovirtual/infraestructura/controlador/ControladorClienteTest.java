package com.ceiba.adn.taximetrovirtual.infraestructura.controlador;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ceiba.adn.taximetrovirtual.TaximetroVirtualApplication;
import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.ClienteDTOTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TaximetroVirtualApplication.class)
@WebAppConfiguration
@TestPropertySource(locations = "classpath:application-test.properties")
public class ControladorClienteTest {

	private static final String URL_BASE = "http://localhost:8080/api/cliente";

	@Autowired
	private ObjectMapper objectMapperTest;

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	
	@Test
	@Sql(executionPhase = ExecutionPhase.AFTER_TEST_METHOD, scripts = "/scripts/cliente-data.sql")
	public void cuandoPeticionCrearClienteCedulaNuevaEntoncesDeberiaCrear() throws Exception {
		// arrange
		ClienteDTO clienteDTO = new ClienteDTOTestDataBuilder().build();

		// act - assert
		mockMvc.perform(post(URL_BASE)
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapperTest.writeValueAsString(clienteDTO)))
				.andDo(print())
				.andExpect(status().isCreated());
	}
	
	@Test
	@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = "/scripts/crear-cliente.sql")
	@Sql(executionPhase = ExecutionPhase.AFTER_TEST_METHOD, scripts = "/scripts/cliente-data.sql")
	public void cuandoPeticionCrearClienteCedulaExistenteEntoncesDeberiaLanzarExcepcion() throws Exception {
		// arrange
		ClienteDTO clienteDTO = new ClienteDTOTestDataBuilder().conCedula("1109542654").build();
		
		// act - assert
		mockMvc.perform(post(URL_BASE)
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapperTest.writeValueAsString(clienteDTO)))
				.andDo(print())
				.andExpect(status().isPreconditionFailed());
	}
	
	
}
