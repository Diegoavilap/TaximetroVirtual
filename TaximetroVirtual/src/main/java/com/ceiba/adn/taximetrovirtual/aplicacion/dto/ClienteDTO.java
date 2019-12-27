package com.ceiba.adn.taximetrovirtual.aplicacion.dto;

/**
 * Clase que representa un Cliente para la transferencia de datos
 * @author diego.avila
 *
 */
public class ClienteDTO {
	private Long id;
	private String cedula;
	private String nombre;
	private String apellido;
	
	
	public ClienteDTO (Long id, String cedula, String nombre, String apellido) {
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
