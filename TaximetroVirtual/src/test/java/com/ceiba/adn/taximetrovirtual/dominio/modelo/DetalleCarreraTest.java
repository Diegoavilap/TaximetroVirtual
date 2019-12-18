package com.ceiba.adn.taximetrovirtual.dominio.modelo;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.ceiba.adn.taximetrovirtual.testdatabuilder.DetalleCarreraTestDataBuilder;


public class DetalleCarreraTest {
	
	@Test
	public void calcularCostoTestDiaEntreSemanaYHorarioNomal() {
		// arrange
		DetalleCarreraTestDataBuilder detalleCarreraTestDataBuilder = new DetalleCarreraTestDataBuilder();

		// act
		BigDecimal costoCarrera  = detalleCarreraTestDataBuilder.build().calcularCosto();
		
		// assert
		assertEquals(costoCarrera, new BigDecimal(10000));
	}
}
