package com.ceiba.adn.taximetrovirtual.testdatabuilder;

import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.CarreraDTO;

public class CarreraDTOTestDataBuilder {
	public Long id;
	public Long clienteId;
	public LocalDateTime fechaInicio;
	
	
	public CarreraDTOTestDataBuilder(Long id, Long clienteId, LocalDateTime fechaInicio) {
		this.id = id;
		this.clienteId = clienteId;
		this.fechaInicio = fechaInicio;
	}
	
	public CarreraDTOTestDataBuilder() {
		this.id = 1L;
		this.clienteId = 1L;
		this.fechaInicio = LocalDateTime.of(2020, 01, 2, 9, 0);
	}
	
	public CarreraDTO build() {
		return new CarreraDTO(id, clienteId, fechaInicio);
	}

	public CarreraDTOTestDataBuilder conId(Long id) {
		this.id = id;
		return this;
	}

	public CarreraDTOTestDataBuilder conClienteId(Long clienteId) {
		this.clienteId = clienteId;
		return this;
	}
	
	public CarreraDTOTestDataBuilder conFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
		return this;
	}


}
