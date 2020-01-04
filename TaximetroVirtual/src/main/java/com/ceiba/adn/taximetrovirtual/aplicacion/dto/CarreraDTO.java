package com.ceiba.adn.taximetrovirtual.aplicacion.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CarreraDTO {
	private Long id;
	private Long clienteId;
	private LocalDateTime fechaInicio;

	@JsonCreator
	public CarreraDTO(@JsonProperty("id") Long id, @JsonProperty("idCliente") Long clienteId,
			@JsonProperty("fechaInicio") LocalDateTime fechaInicio) {
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
