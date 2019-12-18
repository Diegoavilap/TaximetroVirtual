package com.ceiba.adn.taximetrovirtual.dominio.modelo;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

public class DetalleCarrera {
	
	private Long id;
	private Carrera carrera;
	private String estado;
	private LocalDateTime fechaFin;
	private BigDecimal costo;
	
	public DetalleCarrera(Long id, Carrera carrera, String estado, LocalDateTime fechaFin, BigDecimal costo) {
		this.id = id;
		this.carrera = carrera;
		this.estado = estado;
		this.fechaFin = fechaFin;
		this.costo = costo;
	}

	public Long getId() {
		return id;
	}
	
	public Carrera getCarrera() {
		return carrera;
	}

	public String getEstado() {
		return estado;
	}
	
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public BigDecimal getCosto() {
		return costo;
	}
	
	public BigDecimal calcularCosto() {
		BigDecimal costoTotal = new BigDecimal(0);
		BigDecimal tarifaPorMinuto = calcularTarifaPorMinuto();
		Long tiempoDuracionCarrera = Duration.between(carrera.getFechaInicio(), fechaFin).toMinutes(); 
				
		costoTotal = tarifaPorMinuto.multiply(new BigDecimal(tiempoDuracionCarrera));
		return costoTotal;
	}

	private BigDecimal calcularTarifaPorMinuto() {
		BigDecimal tarifaPorMinuto;
		// Si el horario es entre las 18 y 20, la tarifa por minuto es 600
		if(carrera.getFechaInicio().getHour() >= 18 && carrera.getFechaInicio().getHour() < 20) {
			tarifaPorMinuto = new BigDecimal(600);
		// Si el horario es entre las 20 y las 5, la tarifa por minuto es 700
		}else if (carrera.getFechaInicio().getHour() >= 20 && carrera.getFechaInicio().getHour() < 5) {
			tarifaPorMinuto = new BigDecimal(700);
		// Si el día es entre semana la tarifa por minuto es 400
		}else if(!esFinDeSemana()) {
			tarifaPorMinuto = new BigDecimal(400);
		}else {
		// Si el día es fin de semana la tarifa  es de 500
			tarifaPorMinuto = new BigDecimal(500);
		}
		return tarifaPorMinuto;
	}

	private boolean esFinDeSemana() {
		return carrera.getFechaInicio().getDayOfWeek().equals(DayOfWeek.SATURDAY) || carrera.getFechaInicio().getDayOfWeek().equals(DayOfWeek.SUNDAY);
	}
	
	
	

}
