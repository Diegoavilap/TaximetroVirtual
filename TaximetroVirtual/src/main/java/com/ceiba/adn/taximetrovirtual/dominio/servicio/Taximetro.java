package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;

public final class Taximetro {

	private static final int CERO = 0;
	private static final int TARIFA_HORARIO_DIURNO_FIN_DE_SEMANA = 500;
	private static final int TARIFA_HORARIO_DIRUNO_ENTRE_SEMANA = 400;
	private static final int TARIFA_HORARIO_DE_20_PM_A_5_AM = 700;
	private static final int TARIFA_HORARIO_DE_18_A_20_PM = 600;

	private Taximetro() {
		throw new AssertionError("Esta clase no debe ser instanciada");
	}

	/**
	 * Funcion encargada de calcular el costo de un carrera, dada la carrera y la fecha de finalizacion
	 * @param carrera
	 * @param fechaFin
	 * @return BigDecimal correspondiente al costo de la carrera de acuerdo a las reglas de negocio
	 */
	public static BigDecimal calcularCosto(Carrera carrera, LocalDateTime fechaFin) {
		BigDecimal tarifaPorMinuto = calcularTarifaPorMinuto(carrera);
		Long tiempoDuracionCarrera = Duration.between(carrera.getFechaInicio(), fechaFin).toMinutes();
		BigDecimal costoCarrera;
		if(tiempoDuracionCarrera == CERO) {
			costoCarrera = tarifaPorMinuto;
		}else {
			costoCarrera = tarifaPorMinuto.multiply(new BigDecimal(tiempoDuracionCarrera));
		}
		return costoCarrera;
	}

	/**
	 * Funcion encargada de calcular la tarifa por minuto de acuerdo a la hora de inicio de la carrera 
	 * @param carrera 
	 * @return BigDecimal correspondiente a la tarifa de acuerdo a la hora de inicio establecidas 
	 * como reglas del negocio
	 */
	private static BigDecimal calcularTarifaPorMinuto(Carrera carrera) {
		BigDecimal tarifaPorMinuto;
		
		if(esHorarioDe18a20Horas(carrera)) {

			tarifaPorMinuto = new BigDecimal(TARIFA_HORARIO_DE_18_A_20_PM);
			
		}else if (esHorario20a5Horas(carrera)) {
			
			tarifaPorMinuto = new BigDecimal(TARIFA_HORARIO_DE_20_PM_A_5_AM);
			
		}else if(!esFinDeSemana(carrera.getFechaInicio())) {
			 
			tarifaPorMinuto = new BigDecimal(TARIFA_HORARIO_DIRUNO_ENTRE_SEMANA);
			
		}else {
			
			tarifaPorMinuto = new BigDecimal(TARIFA_HORARIO_DIURNO_FIN_DE_SEMANA);
			
		}
		return tarifaPorMinuto;
	}


	/**
	 * Funcion encargada de validar si el horario de una carrera es entre las 18:00 pm y las 20:00 pm
	 * @param carrera
	 * @return boolean true si la carrera tiene hora de inicio entre las 18:00 pm y 20:00 pm 
	 * false si la carrera no corresponde al rango horario anteriormente descrito
	 */
	private static boolean esHorarioDe18a20Horas(Carrera carrera) {
		return carrera.getFechaInicio().getHour() >= 18 && carrera.getFechaInicio().getHour() < 20;
	}
	
	/**
	 * Funcion encargada de validar si el horario de una carrera es entre las 20:00 pm y las 5:00 am
	 * @param carrera
	 * @return boolean true si la carrera tiene hora de inicio entre las 20:00 pm y 5:00 am 
	 * false si la carrera no corresponde al rango horario anteriormente descrito
	 */
	private static boolean esHorario20a5Horas(Carrera carrera) {
		return carrera.getFechaInicio().getHour() >= 20 || carrera.getFechaInicio().getHour() < 5;
	}
	
	/**
	 * Funcion que se encarga de validar si la fecha dada corresponde a un fin de semana (Sabado o Domingo)
	 * @param fecha
	 * @return boolean true si el dia de la fecha dada corresponde a un sabado o domingo 
	 * false si no corresponde a uno de estos dias anteriormente descrita
	 */

	private static boolean esFinDeSemana(LocalDateTime fecha) {
		return fecha.getDayOfWeek().equals(DayOfWeek.SATURDAY) || fecha.getDayOfWeek().equals(DayOfWeek.SUNDAY);
	}
}
