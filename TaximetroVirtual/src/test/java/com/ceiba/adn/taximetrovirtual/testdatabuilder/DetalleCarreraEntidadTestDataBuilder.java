package com.ceiba.adn.taximetrovirtual.testdatabuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.DetalleCarreraEntidad;

public class DetalleCarreraEntidadTestDataBuilder {

	private Long id;
	private CarreraEntidad carrera;
	private LocalDateTime fechaFin;
	private BigDecimal costo;

	public DetalleCarreraEntidadTestDataBuilder(Long id, CarreraEntidad carrera, LocalDateTime fechaFin,
			BigDecimal costo) {
		this.id = id;
		this.carrera = carrera;
		this.fechaFin = fechaFin;
		this.costo = costo;
	}

	public DetalleCarreraEntidadTestDataBuilder() {
		this.id = 1L;
		this.carrera = new CarreraEntidadTestDataBuilder().build();
		this.fechaFin = LocalDateTime.of(2020, 01, 2, 9, 45);
		this.costo = new BigDecimal(10000);
		;
	}

	public Long getId() {
		return id;
	}

	public CarreraEntidad getCarrera() {
		return carrera;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public DetalleCarreraEntidadTestDataBuilder conId(Long id) {
		this.id = id;
		return this;
	}

	public DetalleCarreraEntidadTestDataBuilder conCarrera(CarreraEntidad carrera) {
		this.carrera = carrera;
		return this;
	}

	public DetalleCarreraEntidadTestDataBuilder conFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
		return this;
	}

	public DetalleCarreraEntidadTestDataBuilder conCosto(BigDecimal costo) {
		this.costo = costo;
		return this;
	}

	public DetalleCarreraEntidad build() {
		return new DetalleCarreraEntidad(id, carrera, fechaFin, costo);
	}
}
