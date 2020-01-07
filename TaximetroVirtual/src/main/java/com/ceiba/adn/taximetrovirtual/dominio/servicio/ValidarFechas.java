package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionFechaFinalAnteriorAFechaInicial;

public final class ValidarFechas {
	private static final Logger LOG = LogManager.getLogger(ValidarFechas.class);
	private static final String MSG_LA_FECHA_FINAL_NO_PUEDE_SER_ANTERIOR_A_LA_FECHA_INICIAL = "La Fecha Final no puede ser anterior a la Fecha Inicial";

	private ValidarFechas() {
		throw new AssertionError("Esta clase no debe ser instanciada");
	}
	
	/**
	 * Funcion encargada de validar que la fecha final sea posterior a la fecha inicial
	 * @param fechaFin
	 * @param fechaInicio
	 * Lanza una excepcion IllegalArgumenException si la fecha final no es posterior a la inicial.
	 */
	public static void validarFechaFinalPosteriorAFechaInicial(LocalDateTime fechaFin, LocalDateTime fechaInicio){	
		if (!fechaFin.isAfter(fechaInicio)) {
			ExcepcionFechaFinalAnteriorAFechaInicial excepcion = new ExcepcionFechaFinalAnteriorAFechaInicial(MSG_LA_FECHA_FINAL_NO_PUEDE_SER_ANTERIOR_A_LA_FECHA_INICIAL);
			LOG.warn(excepcion);
			throw excepcion;
		}
	}
}
