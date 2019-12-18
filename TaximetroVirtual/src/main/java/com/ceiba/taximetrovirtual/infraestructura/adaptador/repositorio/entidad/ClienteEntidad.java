package com.ceiba.taximetrovirtual.infraestructura.adaptador.repositorio.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ClienteEntidad")
@Table(name = "CLIENTE")
public class ClienteEntidad implements Serializable  {

	private static final long serialVersionUID = 6045856970103249278L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;

	@Column(name = "cedula")
	private String cedula;

	@Column(name = "nombre")
	private String nombre;

	public ClienteEntidad() {
	}

	public ClienteEntidad(Long id, String cedula, String nombre) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}


	public String getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	
	

}
