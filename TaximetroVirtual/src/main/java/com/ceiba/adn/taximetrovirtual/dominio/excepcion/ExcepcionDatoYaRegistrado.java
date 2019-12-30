package com.ceiba.adn.taximetrovirtual.dominio.excepcion;

public class ExcepcionDatoYaRegistrado extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ExcepcionDatoYaRegistrado(String mensaje) {
		super(mensaje);
	}

}
