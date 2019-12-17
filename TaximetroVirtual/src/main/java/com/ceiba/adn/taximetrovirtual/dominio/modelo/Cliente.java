package com.ceiba.adn.taximetrovirtual.dominio.modelo;

public class Cliente {
	private Long id;
	private String cedula;
	private String nombre;
	private String apellido;
	
	
	public Cliente (Long id, String cedula, String nombre, String apellido) {
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
