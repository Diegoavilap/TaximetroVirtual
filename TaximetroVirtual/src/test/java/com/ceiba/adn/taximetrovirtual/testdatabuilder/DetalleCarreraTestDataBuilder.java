package com.ceiba.adn.taximetrovirtual.testdatabuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;

public class DetalleCarreraTestDataBuilder {

	private Long id;
	private Carrera carrera;
	private LocalDateTime fechaFin;
	private BigDecimal costo;
	
	
	public DetalleCarreraTestDataBuilder() {
		
		this.id = 1L;
		this.carrera = new Carrera(1L, 1104675876L, LocalDateTime.of(2019, 12, 16, 6, 0));
		this.fechaFin = LocalDateTime.of(2019, 12, 16, 6, 25);
		this.costo = new BigDecimal(0);
		
	}


	public DetalleCarreraTestDataBuilder conId(Long id) {
		this.id = id;
		return this;
	}


	public DetalleCarreraTestDataBuilder conCarrera(Carrera carrera) {
		this.carrera = carrera;
		return this;
	}

	public DetalleCarreraTestDataBuilder conFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
		return this;
	}


	public DetalleCarreraTestDataBuilder conCosto(BigDecimal costo) {
		this.costo = costo;
		return this;
	}
	
	public DetalleCarrera build() {
		return new DetalleCarrera(id, carrera, fechaFin, costo);
	}

	
}
