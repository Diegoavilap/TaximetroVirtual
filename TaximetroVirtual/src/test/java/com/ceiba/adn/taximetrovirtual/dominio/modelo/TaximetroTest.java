package com.ceiba.adn.taximetrovirtual.dominio.modelo;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.Test;

import com.ceiba.adn.taximetrovirtual.testdatabuilder.CarreraTestDataBuilder;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.DetalleCarreraTestDataBuilder;


public class TaximetroTest {
	
	@Test
	public void calcularCostoTestDiaEntreSemanaYHorarioNomal() {
		// arrange
		Taximetro taximetro = new Taximetro();
		Carrera carreraTestBuilder = new CarreraTestDataBuilder().build();
		LocalDateTime fechaFinalCarrera = LocalDateTime.of(2019, 12, 16, 6, 25);

		// act
		BigDecimal costoCarrera  = taximetro.calcularCosto(carreraTestBuilder, fechaFinalCarrera);
		
		// assert
		assertEquals(costoCarrera, new BigDecimal(10000));
	}
	
}
