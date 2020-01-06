package com.ceiba.adn.taximetrovirtual.testdatabuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;

public class DetalleCarreraTestDataBuilder {

	private Long id;
	private Long carreraId;
	private LocalDateTime fechaFin;
	private BigDecimal costo;
	
	
	public DetalleCarreraTestDataBuilder() {
		
		this.id = 1L;
		this.carreraId = 1L;
		this.fechaFin = LocalDateTime.of(2019, 12, 16, 6, 25);
		this.costo = new BigDecimal(0);
		
	}


	public DetalleCarreraTestDataBuilder conId(Long id) {
		this.id = id;
		return this;
	}


	public DetalleCarreraTestDataBuilder conCarrera(Long carreraId) {
		this.carreraId = carreraId;
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
		return new DetalleCarrera(id, carreraId, fechaFin, costo);
	}

	
}
