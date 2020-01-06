package com.ceiba.adn.taximetrovirtual.aplicacion.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CarreraDTO {
	private Long id;
	private Long clienteId;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	
	

}
