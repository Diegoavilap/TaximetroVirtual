package com.ceiba.adn.taximetrovirtual.dominio.excepcion;

public class ExcepcionCarreraNoEncontrada extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ExcepcionCarreraNoEncontrada(String mensaje) {
		super(mensaje);
	}

}
