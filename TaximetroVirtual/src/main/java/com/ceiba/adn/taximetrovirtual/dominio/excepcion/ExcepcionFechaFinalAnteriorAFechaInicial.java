package com.ceiba.adn.taximetrovirtual.dominio.excepcion;

public class ExcepcionFechaFinalAnteriorAFechaInicial extends RuntimeException{
private static final long serialVersionUID = 1L;
	
	public ExcepcionFechaFinalAnteriorAFechaInicial(String mensaje) {
		super(mensaje);
	}
}
