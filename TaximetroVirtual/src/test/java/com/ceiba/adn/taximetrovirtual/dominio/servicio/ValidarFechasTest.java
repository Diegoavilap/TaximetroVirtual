package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;

import org.junit.Test;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionFechaFinalAnteriorAFechaInicial;

public class ValidarFechasTest {

	@Test
	public void fechaFinalInferiorAFechaInicial() {
		// arrange
		LocalDateTime fechaInicial = LocalDateTime.of(2019, 12, 31, 6, 0);
		LocalDateTime fechaFinal = LocalDateTime.of(2019, 12, 01, 6, 0);
		

		// act / assert
		assertThrows(ExcepcionFechaFinalAnteriorAFechaInicial.class, 
						() ->  ValidarFechas.validarFechaFinalPosteriorAFechaInicial(fechaFinal, fechaInicial), 
						"La Fecha Final no puede ser anterior a la Fecha Inicial");	    
	}

}
