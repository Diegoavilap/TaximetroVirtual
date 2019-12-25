package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;

public final class Taximetro {

	private Taximetro() {
		throw new AssertionError("Esta clase no debe ser instanciada");
	}

	public static BigDecimal calcularCosto(Carrera carrera, LocalDateTime fechaFin) {
		BigDecimal tarifaPorMinuto = calcularTarifaPorMinuto(carrera);
		Long tiempoDuracionCarrera = Duration.between(carrera.getFechaInicio(), fechaFin).toMinutes(); 
				
		return tarifaPorMinuto.multiply(new BigDecimal(tiempoDuracionCarrera));
	}

	private static BigDecimal calcularTarifaPorMinuto(Carrera carrera) {
		BigDecimal tarifaPorMinuto;
		
		if(esHorarioDe18a20Horas(carrera)) {

			tarifaPorMinuto = new BigDecimal(600);
			
		}else if (esHorario20a5Horas(carrera)) {
			
			tarifaPorMinuto = new BigDecimal(700);
			
		}else if(!esFinDeSemana(carrera.getFechaInicio())) {
			 
			tarifaPorMinuto = new BigDecimal(400);
			
		}else {
			
			tarifaPorMinuto = new BigDecimal(500);
			
		}
		return tarifaPorMinuto;
	}

	private static boolean esHorario20a5Horas(Carrera carrera) {
		return carrera.getFechaInicio().getHour() >= 20 || carrera.getFechaInicio().getHour() < 5;
	}

	private static boolean esHorarioDe18a20Horas(Carrera carrera) {
		return carrera.getFechaInicio().getHour() >= 18 && carrera.getFechaInicio().getHour() < 20;
	}

	private static boolean esFinDeSemana(LocalDateTime fecha) {
		return fecha.getDayOfWeek().equals(DayOfWeek.SATURDAY) || fecha.getDayOfWeek().equals(DayOfWeek.SUNDAY);
	}
}
