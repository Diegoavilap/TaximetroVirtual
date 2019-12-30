package com.ceiba.adn.taximetrovirtual.testdatabuilder;

import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;

public class ClienteEntidadTestDataBuilder {
	private Long id;
	private String cedula;
	private String nombre;
	private String apellido;

	public ClienteEntidadTestDataBuilder(Long id, String cedula, String nombre, String apellido){
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public ClienteEntidadTestDataBuilder() {
		this.id = 1L;
		this.cedula = "1105234678";
		this.nombre = "Bernarda";
		this.apellido = "Bejarano";
	}
	
	public ClienteEntidad build() {
		return new ClienteEntidad(id, cedula, nombre, apellido);
	}

	public ClienteEntidadTestDataBuilder conId(Long id) {
		this.id = id;
		return this;
	}

	public ClienteEntidadTestDataBuilder conCedula(String cedula) {
		this.cedula = cedula;
		return this;
	}

	public ClienteEntidadTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public ClienteEntidadTestDataBuilder conApellido(String apellido) {
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
}
