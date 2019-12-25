package com.ceiba.adn.taximetrovirtual.dominio.modelo;

import java.util.Objects;

public class Cliente {
	private Long id;
	private String cedula;
	private String nombre;
	private String apellido;
	
	
	public Cliente (Long id, String cedula, String nombre, String apellido) {
		this.id = id;
		this.cedula = Objects.requireNonNull(cedula);
		this.nombre = Objects.requireNonNull(nombre);
		this.apellido = Objects.requireNonNull(apellido);
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
