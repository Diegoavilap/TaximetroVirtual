package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.Test;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.dominio.servicio.Taximetro;
import com.ceiba.adn.taximetrovirtual.testdatabuilder.CarreraTestDataBuilder;


public class TaximetroTest {
	
	@Test
	public void calcularCostoTestDiaEntreSemanaYHorarioDiurno() {
		// arrange
		Carrera carreraTestBuilder = new CarreraTestDataBuilder().build();
		LocalDateTime fechaFinalCarrera = LocalDateTime.of(2019, 12, 16, 6, 25);

		// act
		BigDecimal costoCarrera  = Taximetro.calcularCosto(carreraTestBuilder, fechaFinalCarrera);
		
		// assert
		assertEquals(costoCarrera, new BigDecimal(10000));
	}
	
	@Test
	public void calcularCostoTestDiaEntreSemanaYHorarioDe18a20() {
		// arrange
		LocalDateTime fechaInicioCarreraEntre18y20Horas = LocalDateTime.of(2019, 12, 16, 19, 0);
		Carrera carreraTestBuilder = new CarreraTestDataBuilder()
											.conFechaInicio( fechaInicioCarreraEntre18y20Horas).build();
		LocalDateTime fechaFinalCarrera = fechaInicioCarreraEntre18y20Horas.plusMinutes(59);

		// act
		BigDecimal costoCarrera  = Taximetro.calcularCosto(carreraTestBuilder, fechaFinalCarrera);
		
		// assert
		assertEquals(costoCarrera, new BigDecimal(35400));
	}
	
	@Test
	public void calcularCostoDiaTestEntreSemanaYHorarioDe21a5() {
		// arrange
		LocalDateTime fechaInicioCarreraEntre21y5Horas = LocalDateTime.of(2019, 12, 16, 21, 0);
		Carrera carreraTestBuilder = new CarreraTestDataBuilder()
											.conFechaInicio(fechaInicioCarreraEntre21y5Horas)
											.build();
		LocalDateTime fechaFinalCarrera = fechaInicioCarreraEntre21y5Horas.plusMinutes(120);
		// act
		BigDecimal costoCarrera = Taximetro.calcularCosto(carreraTestBuilder, fechaFinalCarrera);
		
		// assert
		assertEquals(costoCarrera, new BigDecimal(84000));
		
	}
	
	@Test
	public void calcularCostoDiaTestFinDeSemanaYHorarioDiurno() {
		// arrange
		LocalDateTime fechaInicioFinDeSemanaHorarioDiurno = LocalDateTime.of(2019, 12, 21, 16, 0);
		Carrera carreraTestBuilder = new CarreraTestDataBuilder()
											.conFechaInicio(fechaInicioFinDeSemanaHorarioDiurno)
											.build();
		LocalDateTime fechaFinalCarrera = fechaInicioFinDeSemanaHorarioDiurno.plusMinutes(72);
		
		// act
		BigDecimal costoCarrera = Taximetro.calcularCosto(carreraTestBuilder, fechaFinalCarrera);
		
		// assert
		assertEquals(costoCarrera, new BigDecimal(36000));		
	}
	
	@Test
	public void calcularCostoDiaTestFinDeSemanaYHorario20a5() {
		// arrange
		LocalDateTime fechaInicioFinDeSemanaHorarioDiurno = LocalDateTime.of(2019, 12, 21, 3, 0);
		Carrera carreraTestBuilder = new CarreraTestDataBuilder()
											.conFechaInicio(fechaInicioFinDeSemanaHorarioDiurno)
											.build();
		LocalDateTime fechaFinalCarrera = fechaInicioFinDeSemanaHorarioDiurno.plusMinutes(85);
		
		// act
		BigDecimal costoCarrera = Taximetro.calcularCosto(carreraTestBuilder, fechaFinalCarrera);
		
		// assert
		assertEquals(costoCarrera, new BigDecimal(59500));		
	}
	
	@Test
	public void calcularCostoDiaTestDomingoYHorarioDiurno() {
		// arrange
		LocalDateTime fechaInicioFinDeSemanaHorarioDiurno = LocalDateTime.of(2019, 12, 22,11, 0);
		Carrera carreraTestBuilder = new CarreraTestDataBuilder()
											.conFechaInicio(fechaInicioFinDeSemanaHorarioDiurno)
											.build();
		LocalDateTime fechaFinalCarrera = fechaInicioFinDeSemanaHorarioDiurno.plusMinutes(240);
		
		// act
		BigDecimal costoCarrera = Taximetro.calcularCosto(carreraTestBuilder, fechaFinalCarrera);
		
		// assert
		assertEquals(costoCarrera, new BigDecimal(120000));		
	}
}
