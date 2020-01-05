package com.ceiba.adn.taximetrovirtual.dominio.excepcion;

public class ExcepcionClienteNoEncontrado  extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ExcepcionClienteNoEncontrado(String mensaje) {
		super(mensaje);
	}
}
