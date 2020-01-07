package com.ceiba.adn.taximetrovirtual.dominio.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DetalleCarrera {
	
	private Long id;
	private Long carreraId;
	private LocalDateTime fechaFin;
	private BigDecimal costo;
	
	public DetalleCarrera(Long id, Long carreraId, LocalDateTime fechaFin, BigDecimal costo) {
		
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

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public void setCarreraId(Long carreraId) {
		this.carreraId = carreraId;
	}
	

}
