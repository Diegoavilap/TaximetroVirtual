package com.ceiba.adn.taximetrovirtual.dominio.modelo;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

public class DetalleCarrera {
	
	private Long id;
	private Carrera carrera;
	private LocalDateTime fechaFin;
	private BigDecimal costo;
	
	public DetalleCarrera(Long id, Carrera carrera, LocalDateTime fechaFin, BigDecimal costo) {
		this.id = id;
		this.carrera = carrera;
		this.fechaFin = fechaFin;
		this.costo = costo;
	}

	public Long getId() {
		return id;
	}
	
	public Carrera getCarrera() {
		return carrera;
	}
	
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	
	
	

}
