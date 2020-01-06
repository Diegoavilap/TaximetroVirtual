package com.ceiba.adn.taximetrovirtual.aplicacion.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalleCarreraDTO {

	private Long id;
	private Long carreraId;
	private LocalDateTime fechaFin;
	private BigDecimal costo;

	@JsonCreator
	public DetalleCarreraDTO(@JsonProperty("id") Long id, @JsonProperty("carreraId") Long carreraId,
			@JsonProperty("fechaFin") LocalDateTime fechaFin, @JsonProperty("costo") BigDecimal costo) {
		
		this.id = id;
		this.carreraId = carreraId;
		this.fechaFin = fechaFin;
		this.costo = costo;
	}

	public Long getId() {
		return id;
	}

	public Long getCarreraId() {
		return carreraId;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCarrera(Long carreraId) {
		this.carreraId = carreraId;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	
}
