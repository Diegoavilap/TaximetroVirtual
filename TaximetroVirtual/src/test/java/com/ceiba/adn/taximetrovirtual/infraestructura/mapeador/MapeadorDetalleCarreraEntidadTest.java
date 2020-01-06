package com.ceiba.adn.taximetrovirtual.infraestructura.mapeador;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.DetalleCarreraEntidad;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.DetalleCarreraEntidadTestDataBuilder;

public class MapeadorDetalleCarreraEntidadTest {

	@Test
	public void cuandoEntidadDetalleCarreraEsNullEntoncesRetornaNull() {
		// arrange
		DetalleCarreraEntidad detalleCarreraEntidad = null;

		// act
		DetalleCarrera modelo = MapeadorDetalleCarreraEntidad.mapearAModelo(detalleCarreraEntidad);

		// assert
		assertNull(modelo);
	}

	@Test
	public void cuandoEntidadDetalleCarreraEsOkEntoncesRetornaDetalleCarrera() {
		// arrange
		DetalleCarreraEntidad detalleCarreraEntidad = new DetalleCarreraEntidadTestDataBuilder().build();
		// act
		DetalleCarrera modelo = MapeadorDetalleCarreraEntidad.mapearAModelo(detalleCarreraEntidad);

		// assert
		assertNotNull(modelo);
		assertEquals(modelo.getId(), detalleCarreraEntidad.getId());
		assertEquals(modelo.getCarreraId(), detalleCarreraEntidad.getCarrera().getId());
		assertEquals(modelo.getFechaFin(), detalleCarreraEntidad.getFechaFin());
		assertEquals(modelo.getCosto(), detalleCarreraEntidad.getCosto());
	}
}
