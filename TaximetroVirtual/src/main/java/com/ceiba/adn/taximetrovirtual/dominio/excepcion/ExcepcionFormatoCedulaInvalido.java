package com.ceiba.adn.taximetrovirtual.dominio.excepcion;

public class ExcepcionFormatoCedulaInvalido extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ExcepcionFormatoCedulaInvalido(String mensaje) {
		super(mensaje);
	}
}
