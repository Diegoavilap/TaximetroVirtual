package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class ClienteEntidad {

	public ClienteEntidad() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "CEDULA")
	private String cedula;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;

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

	public void setId(Long id) {
		this.id = id;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
