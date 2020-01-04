package com.ceiba.adn.taximetrovirtual.infraestructura.controlador;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
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
@TestPropertySource(locations = "classpath:application.properties")
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

	@After
	//@Sql(scripts = "/scripts/cliente-data.sql")
//	public void tearDown() throws Exception{
//		final Statement statement = dataSource.getConnection().createStatement();
//		statement.execute("DROP ALL objects DELETE files");
//	}

	@Test
	@Ignore
	@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = "/scripts/cliente-data.sql")
	@Sql(executionPhase = ExecutionPhase.AFTER_TEST_METHOD, scripts = "/scripts/cliente-data.sql")
	public void cuandoPeticionCrearClienteYIdNoNuloYNoDuplicadoCorrectaEntoncesDeberiaCrear() throws Exception {
		// arrange
		ClienteDTO clienteDTO = new ClienteDTOTestDataBuilder().build();

		// act - assert
		mockMvc.perform(post(URL_BASE)
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapperTest.writeValueAsString(clienteDTO)))
				.andDo(print())
				.andExpect(status().isCreated());
	}
	
	
}
