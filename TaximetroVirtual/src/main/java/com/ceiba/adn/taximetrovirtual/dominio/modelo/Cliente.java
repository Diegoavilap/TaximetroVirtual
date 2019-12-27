package com.ceiba.adn.taximetrovirtual.dominio.modelo;

import com.ceiba.adn.taximetrovirtual.dominio.servicio.ValidarDatos;

public class Cliente {
	private Long id;
	private String cedula;
	private String nombre;
	private String apellido;
	
	
	public Cliente (Long id, String cedula, String nombre, String apellido) {
		this.id = id;
		
		ValidarDatos.validarCedula(cedula);
		
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
