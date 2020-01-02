package com.ceiba.adn.taximetrovirtual.aplicacion.mapeador;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.ClienteDTOTestDataBuilder;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.ClienteTestDataBuilder;

public class MapeadorClienteTest {

	@Test
	public void cuandoClienteDTOEsNuloEntoncesRetornaNulo() {
		// arrange
		ClienteDTO clienteDTO = null;

		// act
		Cliente cliente = MapeadorCliente.mapearAModelo(clienteDTO);

		// assert
		assertNull(cliente);
	}

	@Test
	public void cuandoClienteDTOesOkEntoncesRetornaCliente() {
		// arrange
		ClienteDTO clienteDTO = new ClienteDTOTestDataBuilder().build();

		// act
		Cliente cliente = MapeadorCliente.mapearAModelo(clienteDTO);

		// assert
		assertNotNull(cliente);
		assertEquals(cliente.getId(), clienteDTO.getId());
		assertEquals(cliente.getCedula(), clienteDTO.getCedula());
		assertEquals(cliente.getNombre(), clienteDTO.getNombre());
		assertEquals(cliente.getApellido(), clienteDTO.getApellido());
	}

	@Test
	public void cuandoClienteEsNuloEntoncesRetornaNulo() {
		// arrange
		Cliente cliente = null;

		// act
		ClienteDTO clienteDTO = MapeadorCliente.mapearADTO(cliente);

		// assert
		assertNull(clienteDTO);
	}

	@Test
	public void cuandoClienteOkEntoncesRetornaClienteDTO() {
		// arrange
		Cliente cliente = new ClienteTestDataBuilder().build();

		// act
		ClienteDTO clienteDTO = MapeadorCliente.mapearADTO(cliente);

		// assert
		assertNotNull(clienteDTO);
		assertEquals(clienteDTO.getId(), cliente.getId());
		assertEquals(clienteDTO.getCedula(), cliente.getCedula());
		assertEquals(clienteDTO.getNombre(), cliente.getNombre());
		assertEquals(clienteDTO.getApellido(), cliente.getApellido());
	}
}
