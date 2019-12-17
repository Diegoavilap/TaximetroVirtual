package com.ceiba.adn.taximetrovirtual.dominio.modelo;

import java.time.LocalDateTime;

public class Carrera {
	private Long id;
	private String cedulaCliente;
	private LocalDateTime fechaInicio;
	
	public Carrera( Long id, String cedulaCliente, LocalDateTime fechaInicio) {
		this.id = id;
		this.cedulaCliente = cedulaCliente;
		this.fechaInicio = fechaInicio;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}
	
	
	
}
