package com.ceiba.adn.taximetrovirtual.infraestructura.mapeador;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.ClienteEntidadTestDataBuilder;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.ClienteTestDataBuilder;

public class MapeadorClienteEntidadTest {

	@Test
	public void cuandoEntidadClienteEsNullEntoncesRetornaNull() {
		// arrange
		ClienteEntidad clienteEntidad = null;

		// act
		Cliente modelo = MapeadorClienteEntidad.mapearAModelo(clienteEntidad);

		// assert
		assertNull(modelo);
	}

	@Test
	public void cuandoEntidadClienteEsOkEntoncesRetornaCliente() {
		// arrange
		ClienteEntidad clienteEntidad = new ClienteEntidadTestDataBuilder().build();

		// act
		Cliente modelo = MapeadorClienteEntidad.mapearAModelo(clienteEntidad);

		// assert
		assertNotNull(modelo);
		assertEquals(modelo.getId(), clienteEntidad.getId());
		assertEquals(modelo.getCedula(), clienteEntidad.getCedula());
		assertEquals(modelo.getNombre(), clienteEntidad.getNombre());
		assertEquals(modelo.getApellido(), clienteEntidad.getApellido());
	}

	@Test
	public void cuandoClienteEsNullEntoncesRetornaNull() {
		// arrange
		Cliente modelo = null;

		// act
		ClienteEntidad clienteEntidad = MapeadorClienteEntidad.mapearAEntidad(modelo);

		// assert
		assertNull(clienteEntidad);
	}
	
	@Test
	public void cuandoClienteOkEntoncesRetornaClienteEntidad() {
		// arrange
		Cliente modelo = new ClienteTestDataBuilder().build();

		// act
		ClienteEntidad clienteEntidad = MapeadorClienteEntidad.mapearAEntidad(modelo);

		// assert
		assertNotNull(clienteEntidad);
		assertEquals(clienteEntidad.getId(), modelo.getId());
		assertEquals(clienteEntidad.getCedula(), modelo.getCedula());
		assertEquals(clienteEntidad.getNombre(), modelo.getNombre());
		assertEquals(clienteEntidad.getApellido(), modelo.getApellido());
	}
}
