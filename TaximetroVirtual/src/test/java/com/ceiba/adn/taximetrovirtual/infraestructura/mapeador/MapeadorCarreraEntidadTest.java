package com.ceiba.adn.taximetrovirtual.infraestructura.mapeador;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.CarreraEntidadTestDataBuilder;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.CarreraTestDataBuilder;

public class MapeadorCarreraEntidadTest {

	/**
	 * Test encargado de validar que al recibir un objeto Carrera nulo el mapeador
	 * retorne nulo
	 */
	@Test
	public void cuandoEntidadCarreraEsNullEntoncesRetornaNull() {
		// arrange
		CarreraEntidad carreraEntidad = null;

		// act
		Carrera modelo = MapeadorCarreraEntidad.mapearAModelo(carreraEntidad);

		// assert
		assertNull(modelo);
	}

	/**
	 * Test encargado de validar si al recibir un objeto Entidad Carrera el metodo
	 * mapearAModelo retorna una Carrera
	 */
	@Test
	public void cuandoEntidadCarreraEsOkEntoncesRetornaCarrera() {
		// arrange
		CarreraEntidad carreraEntidad = new CarreraEntidadTestDataBuilder().build();
		// act
		Carrera modelo = MapeadorCarreraEntidad.mapearAModelo(carreraEntidad);

		// assert
		assertNotNull(modelo);
		assertEquals(modelo.getId(), carreraEntidad.getId());
		assertEquals(modelo.getClienteId(), carreraEntidad.getClienteId().getId());
		assertEquals(modelo.getFechaInicio(), carreraEntidad.getFechaInicio());
	}
	
	@Test
	public void cuandoCarreraEsNullEntoncesRetornaNull() {
		// arrange
		Carrera modelo = null;

		// act
		CarreraEntidad carreraEntidad = MapeadorCarreraEntidad.mapearAEntidad(modelo);

		// assert
		assertNull(carreraEntidad);
	}
	
	@Test
	public void cuandoCarreraOkEntoncesRetornaCarreraEntidad() {
		// arrange
		Carrera modelo = new CarreraTestDataBuilder().build();

		// act
		CarreraEntidad carreraEntidad = MapeadorCarreraEntidad.mapearAEntidad(modelo);

		// assert
		assertNotNull(carreraEntidad);
		assertEquals(carreraEntidad.getId(), modelo.getId());
		assertEquals(carreraEntidad.getClienteId().getId(), modelo.getClienteId());
		assertEquals(carreraEntidad.getFechaInicio(), modelo.getFechaInicio());
	}
}
