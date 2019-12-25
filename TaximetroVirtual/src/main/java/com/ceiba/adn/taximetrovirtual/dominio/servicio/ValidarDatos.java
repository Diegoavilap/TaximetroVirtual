package com.ceiba.adn.taximetrovirtual.dominio.servicio;

/**
 * @author diego.avila
 *
 */
public final class ValidarDatos {
	/** The Constant MSG_CEDULA_TIENE_CARACTERES_NO_NUMERICOS */
	private static final String MSG_CEDULA_TIENE_CARACTERES_NO_NUMERICOS = "La cédula debe contener solo carácteres númericos";

	
	public static void validarCedula(String cedula) {
		if (!esNumerico(cedula)) {
			throw new IllegalArgumentException(MSG_CEDULA_TIENE_CARACTERES_NO_NUMERICOS);
		}
	}

	private static boolean esNumerico(String texto) {
		return texto.chars().allMatch(Character::isDigit);
	}
}
