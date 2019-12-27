package com.ceiba.adn.taximetrovirtual.dominio.modelo;

import java.time.LocalDateTime;

public class Carrera {
	private Long id;
	private Long clienteId;
	private LocalDateTime fechaInicio;

	public Carrera(Long id, Long clienteId, LocalDateTime fechaInicio) {
		this.id = id;
		this.clienteId = clienteId;
		this.fechaInicio = fechaInicio;
	}

	public Long getId() {
		return id;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

}
