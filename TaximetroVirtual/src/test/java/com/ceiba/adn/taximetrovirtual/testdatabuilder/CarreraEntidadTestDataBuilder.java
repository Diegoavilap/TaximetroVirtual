package com.ceiba.adn.taximetrovirtual.testdatabuilder;

import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;

public class CarreraEntidadTestDataBuilder {
	private Long id;
	private ClienteEntidad clienteId;
	private LocalDateTime fechaInicio;
	
	
	public CarreraEntidadTestDataBuilder(Long id, ClienteEntidad clienteId, LocalDateTime fechaInicio) {
		this.id = id;
		this.clienteId = clienteId;
		this.fechaInicio = fechaInicio;
	}
	
	public CarreraEntidadTestDataBuilder() {
		this.id = 1L;
		this.clienteId = new ClienteEntidadTestDataBuilder().build();
		this.fechaInicio = LocalDateTime.of(2020, 01, 2, 9, 0);
	}
	
	public CarreraEntidad build() {
		return new CarreraEntidad(id, clienteId, fechaInicio);
	}
	
	public CarreraEntidadTestDataBuilder conId(Long id) {
		this.id = id;
		return this;
	}

	public CarreraEntidadTestDataBuilder conClienteId(Long clienteId) {
		ClienteEntidad cliente =  new ClienteEntidadTestDataBuilder().conId(clienteId).build();
		this.clienteId = cliente;
		return this;
	}

	public CarreraEntidadTestDataBuilder conApellido(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
		return this;
	}

}
