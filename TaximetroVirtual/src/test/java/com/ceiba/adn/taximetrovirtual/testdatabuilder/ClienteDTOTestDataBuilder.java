package com.ceiba.adn.taximetrovirtual.testdatabuilder;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;

public class ClienteDTOTestDataBuilder {
	public Long id;
	public String cedula;
	public String nombre;
	public String apellido;
	
	public ClienteDTOTestDataBuilder(Long id, String cedula, String nombre, String apellido) {
	
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public ClienteDTOTestDataBuilder() {
	
		this.id = 1L;
		this.cedula = "1106765987";
		this.nombre = "Pepe";
		this.apellido = "Sierra";
	}
	
	public ClienteDTO build() {
		return new ClienteDTO(id, cedula, nombre, apellido);
	}

	public ClienteDTOTestDataBuilder setCedula(String cedula) {
		this.cedula = cedula;
		return this;
	}

	public ClienteDTOTestDataBuilder setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public ClienteDTOTestDataBuilder setApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}
	

	public Long getId() {
		return id;
	}

	public String getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public ClienteDTOTestDataBuilder setId(Long id) {
		this.id = id;
		return this;
	}
	


}
