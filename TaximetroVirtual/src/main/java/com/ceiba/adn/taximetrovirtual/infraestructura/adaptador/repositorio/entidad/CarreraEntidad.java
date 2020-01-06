package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARRERA")
public class CarreraEntidad {

	public CarreraEntidad() {}

	public CarreraEntidad(Long id, ClienteEntidad clienteId, LocalDateTime fechaInicio) {
		this.id = id;
		this.clienteId = clienteId;
		this.fechaInicio = fechaInicio;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "CLIENTE_ID")
	private ClienteEntidad clienteId;

	@Column(name = "fechaInicio")
	private LocalDateTime fechaInicio;

	@OneToOne(mappedBy = "carrera")
	private DetalleCarreraEntidad detalleCarrera;

	public Long getId() {
		return id;
	}

	public ClienteEntidad getClienteId() {
		return clienteId;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public DetalleCarreraEntidad getDetalleCarrera() {
		return detalleCarrera;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
