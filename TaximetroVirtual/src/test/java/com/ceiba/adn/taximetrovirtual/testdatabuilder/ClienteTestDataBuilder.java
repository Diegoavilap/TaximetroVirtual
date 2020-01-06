package com.ceiba.adn.taximetrovirtual.testdatabuilder;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;

public class ClienteTestDataBuilder {
	public Long id;
	public String cedula;
	public String nombre;
	public String apellido;

	public ClienteTestDataBuilder(Long id, String cedula, String nombre, String apellido) {

		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public ClienteTestDataBuilder() {

		this.cedula = "1106765987";
		this.nombre = "Pepe";
		this.apellido = "Sierra";
	}

	public Cliente build() {
		return new Cliente(id, cedula, nombre, apellido);
	}
	public ClienteTestDataBuilder conId(Long id) {
		this.id = id;
		return this;
	}

	public ClienteTestDataBuilder conCedula(String cedula) {
		this.cedula = cedula;
		return this;
	}

	public ClienteTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public ClienteTestDataBuilder conApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

}
