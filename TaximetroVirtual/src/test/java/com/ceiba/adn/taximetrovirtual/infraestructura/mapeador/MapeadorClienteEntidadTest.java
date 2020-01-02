package com.ceiba.adn.taximetrovirtual.infraestructura.mapeador;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.ClienteEntidadTestDataBuilder;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.ClienteTestDataBuilder;

public class MapeadorClienteEntidadTest {

	private MapeadorClienteEntidad mapeador;
	@Disabled
	@Test
	public void cuandoEntidadClienteEsNullEntoncesRetornaNull() {
		// arrange
		mapeador = new MapeadorClienteEntidad();
		ClienteEntidad clienteEntidad = null;

		// act
		Cliente modelo = mapeador.mapearAModelo(clienteEntidad);

		// assert
		assertNull(modelo);
	}
	@Disabled
	@Test
	public void cuandoEntidadClienteEsOkEntoncesRetornaCliente() {
		// arrange
		mapeador = new MapeadorClienteEntidad();
		ClienteEntidad clienteEntidad = new ClienteEntidadTestDataBuilder().build();

		// act
		Cliente modelo = mapeador.mapearAModelo(clienteEntidad);

		// assert
		assertNotNull(modelo);
		assertEquals(modelo.getId(), clienteEntidad.getId());
		assertEquals(modelo.getCedula(), clienteEntidad.getCedula());
		assertEquals(modelo.getNombre(), clienteEntidad.getNombre());
		assertEquals(modelo.getApellido(), clienteEntidad.getApellido());
	}

	@Disabled
	@Test
	public void cuandoClienteEsNullEntoncesRetornaNull() {
		// arrange
		mapeador = new MapeadorClienteEntidad();
		Cliente modelo = null;

		// act
		ClienteEntidad clienteEntidad = mapeador.mapearAEntidad(modelo);

		// assert
		assertNull(clienteEntidad);
	}
	
	@Test
	public void cuandoClienteOkEntoncesRetornaClienteEntidad() {
		// arrange
		mapeador = new MapeadorClienteEntidad();
		Cliente modelo = new ClienteTestDataBuilder().build();

		// act
		ClienteEntidad clienteEntidad = mapeador.mapearAEntidad(modelo);

		// assert
		assertNotNull(clienteEntidad);
		assertEquals(clienteEntidad.getId(), modelo.getId());
		assertEquals(clienteEntidad.getCedula(), modelo.getCedula());
		assertEquals(clienteEntidad.getNombre(), modelo.getNombre());
		assertEquals(clienteEntidad.getApellido(), modelo.getApellido());
	}
}
