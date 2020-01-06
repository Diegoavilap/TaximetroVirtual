package com.ceiba.adn.taximetrovirtual.aplicacion.mapeador;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.DetalleCarreraDTO;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.DetalleCarreraDTOTestDataBuilder;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.DetalleCarreraTestDataBuilder;

public class MapeadorDetalleCarreraTest {

	
	@Test
	public void cuandoDetalleCarreraDTOEsNuloEntoncesRetornaNulo() {
		// arrange
		DetalleCarreraDTO detalleCarreraDTO = null;

		// act
		DetalleCarrera detalleCarrera = MapeadorDetalleCarrera.mapearAModelo(detalleCarreraDTO);

		// assert
		assertNull(detalleCarrera);
	}
	
	@Test
	public void cuandoDetalleCarreraDTOesOkEntoncesRetornaDetalleCarrera() {
		// arrange
		DetalleCarreraDTO detalleCarreraDTO = new DetalleCarreraDTOTestDataBuilder().build();

		// act
		DetalleCarrera detallecarrera = MapeadorDetalleCarrera.mapearAModelo(detalleCarreraDTO);

		// assert
		assertNotNull(detallecarrera);
		assertEquals(detallecarrera.getId(), detalleCarreraDTO.getId());
		assertEquals(detallecarrera.getCarreraId(), detalleCarreraDTO.getCarreraId());
		assertEquals(detallecarrera.getFechaFin(), detalleCarreraDTO.getFechaFin());
		assertEquals(detallecarrera.getCosto(), detalleCarreraDTO.getCosto());
	}
	
	@Test
	public void cuandoDetalleCarreraEsNuloEntoncesRetornaNulo() {
		// arrange
		DetalleCarrera detalleCarrera = null;

		// act
		DetalleCarreraDTO detalleCarreraDTO = MapeadorDetalleCarrera.mapearADTO(detalleCarrera);

		// assert
		assertNull(detalleCarreraDTO);
	}
	
	@Test
	public void cuandoDetalleCarreraOkEntoncesRetornaDetalleCarreraDTO() {
		// arrange
		DetalleCarrera detalleCarrera = new DetalleCarreraTestDataBuilder().build();

		// act
		DetalleCarreraDTO detalleCarreraDTO = MapeadorDetalleCarrera.mapearADTO(detalleCarrera);

		// assert
		assertNotNull(detalleCarreraDTO);
		assertEquals(detalleCarreraDTO.getId(), detalleCarrera.getId());
		assertEquals(detalleCarreraDTO.getCarreraId(), detalleCarrera.getCarreraId());
		assertEquals(detalleCarreraDTO.getFechaFin(), detalleCarrera.getFechaFin());
		assertEquals(detalleCarreraDTO.getCosto(), detalleCarrera.getCosto());
	}
}
