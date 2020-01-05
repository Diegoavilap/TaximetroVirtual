package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionFormatoCedulaInvalido;

/**
 * @author diego.avila
 *
 */
public final class ValidarDatos {
	
	private ValidarDatos() {
		throw new AssertionError("Esta clase no debe ser instanciada");
	}
	
	private static final String MSG_CEDULA_TIENE_CARACTERES_NO_NUMERICOS = "La cedula debe contener solo caracteres numericos";

	/**
	 * Funcion encargada de validar las precondiciones de las cedulas
	 * @param cedula
	 */
	public static void validarCedula(String cedula) {
		if (!esNumerico(cedula)) {
			throw new ExcepcionFormatoCedulaInvalido(MSG_CEDULA_TIENE_CARACTERES_NO_NUMERICOS);
		}
	}

	/**
	 * Funcion encargada de validar si un texto esta compuesto por solo caracteres numericos
	 * @param texto
	 * @return boolean true si solo tiene caracteres numericos 
	 * false si en cambio tambien tiene otro tipo de caracteres aparte de los numericos
	 */
	
	private static boolean esNumerico(String texto) {
		return texto.chars().allMatch(Character::isDigit);
	}
}
