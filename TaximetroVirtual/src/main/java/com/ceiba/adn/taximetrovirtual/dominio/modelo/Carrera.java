package com.ceiba.adn.taximetrovirtual.dominio.modelo;

import java.time.LocalDateTime;

public class Carrera {
	private Long id;
	private Long idCliente;
	private LocalDateTime fechaInicio;
	
	public Carrera( Long id, Long idCliente, LocalDateTime fechaInicio) {
		this.id = id;
		this.idCliente = idCliente;
		this.fechaInicio = fechaInicio;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getidCliente() {
		return idCliente;
	}
	
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}
	
	
	
}
