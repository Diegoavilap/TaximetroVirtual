package com.ceiba.adn.taximetrovirtual.dominio.excepcion;

public class ExcepcionCedulaYaRegistrada extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ExcepcionCedulaYaRegistrada(String mensaje) {
		super(mensaje);
	}

}
