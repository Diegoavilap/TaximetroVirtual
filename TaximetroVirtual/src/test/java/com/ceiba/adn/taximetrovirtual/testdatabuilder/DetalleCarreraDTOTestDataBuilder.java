package com.ceiba.adn.taximetrovirtual.testdatabuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.DetalleCarreraDTO;

public class DetalleCarreraDTOTestDataBuilder {

	public Long id;
	public Long carreraId;
	public LocalDateTime fechaFin;
	public BigDecimal costo;
	
	public DetalleCarreraDTOTestDataBuilder(Long id, Long carreraId, LocalDateTime fechaFin, BigDecimal costo) {
		
		this.id = id;
		this.carreraId = carreraId;
		this.fechaFin = fechaFin;
		this.costo = costo;
	}
	
	public DetalleCarreraDTOTestDataBuilder() {
		
		this.id = 1L;
		this.carreraId = 1L;
		this.fechaFin = LocalDateTime.of(2019, 12, 16, 6, 45);
		this.costo = new BigDecimal(10000);
	}

	public DetalleCarreraDTOTestDataBuilder conId(Long id) {
		this.id = id;
		return this;
	}

	public DetalleCarreraDTOTestDataBuilder conCarrera(Long carreraId) {
		this.carreraId = carreraId;
		return this;
	}

	public DetalleCarreraDTOTestDataBuilder conFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
		return this;
	}

	public DetalleCarreraDTOTestDataBuilder conCosto(BigDecimal costo) {
		this.costo = costo;
		return this;
	}
	
	public DetalleCarreraDTO build() {
		return new DetalleCarreraDTO(id, carreraId, fechaFin, costo);
	}
	
}
