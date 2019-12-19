package com.ceiba.adn.taximetrovirtual.testdatabuilder;

import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;

public class CarreraTestDataBuilder {
	private Long id;
	private Long idCliente;
	private LocalDateTime fechaInicio;
	
	public CarreraTestDataBuilder() {
		this.id = 2L;
		this.idCliente = 1105676543L;
		this.fechaInicio = LocalDateTime.of(2019, 12, 16, 6, 0);;
	}

	public void conId(Long id) {
		this.id = id;
	}

	public void conIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public void conFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Carrera build() {
		return new Carrera(id, idCliente, fechaInicio);
	}
}
