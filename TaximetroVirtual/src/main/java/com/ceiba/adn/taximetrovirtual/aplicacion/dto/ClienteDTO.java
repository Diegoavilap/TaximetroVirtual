package com.ceiba.adn.taximetrovirtual.aplicacion.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteDTO {

	private Long id;

	private String cedula;

	private String nombre;

	private String apellido;

	@JsonCreator
	public ClienteDTO(@JsonProperty("id") Long id, @JsonProperty("cedula") String cedula,
			@JsonProperty("nombre") String nombre, @JsonProperty("apellido") String apellido) {
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
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
