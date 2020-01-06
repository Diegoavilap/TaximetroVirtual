package com.ceiba.adn.taximetrovirtual.aplicacion.mapeador;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.CarreraDTO;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.CarreraDTOTestDataBuilder;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.CarreraTestDataBuilder;

public class MapeadorCarreraTest {

	/**
	 * Prueba encargada de verificar que al recibir una CarreraDTO nulo el mapeador devuelva nulo
	 */
	@Test
	public void cuandoCarreraDTOEsNuloEntoncesRetornaNulo() {
		// arrange
		CarreraDTO carreraDTO = null;

		// act
		Carrera carrera = MapeadorCarrera.mapearAModelo(carreraDTO);

		// assert
		assertNull(carrera);
	}
	
	/**
	 * Test que valida que al recibir una CarreraDTO Ok regrese un Carrera
	 */
	@Test
	public void cuandoCarreraDTOesOkEntoncesRetornaCarrera() {
		// arrange
		CarreraDTO carreraDTO = new CarreraDTOTestDataBuilder().build();

		// act
		Carrera carrera = MapeadorCarrera.mapearAModelo(carreraDTO);

		// assert
		assertNotNull(carrera);
		assertEquals(carrera.getId(), carreraDTO.getId());
		assertEquals(carrera.getClienteId(), carreraDTO.getClienteId());
		assertEquals(carrera.getFechaInicio(), carreraDTO.getFechaInicio());
	}
	
	/**
	 * Test que valida que al recibir un objeto Carrera nulo retornar nulo
	 */
	@Test
	public void cuandoCarreraEsNuloEntoncesRetornaNulo() {
		// arrange
		Carrera carrera = null;

		// act
		CarreraDTO carreraDTO = MapeadorCarrera.mapearADTO(carrera);

		// assert
		assertNull(carreraDTO);
	}
	
	/**
	 * Test encargado de valida que al rcibir un objeti Cliente OK se retorn un ClienteDTO 
	 */
	@Test
	public void cuandoCarreraOkEntoncesRetornaCarreraDTO() {
		// arrange
		Carrera carrera = new CarreraTestDataBuilder().build();

		// act
		CarreraDTO carreraDTO = MapeadorCarrera.mapearADTO(carrera);

		// assert
		assertNotNull(carreraDTO);
		assertEquals(carreraDTO.getId(), carrera.getId());
		assertEquals(carreraDTO.getClienteId(), carrera.getClienteId());
		assertEquals(carreraDTO.getFechaInicio(), carrera.getFechaInicio());
	}
}
