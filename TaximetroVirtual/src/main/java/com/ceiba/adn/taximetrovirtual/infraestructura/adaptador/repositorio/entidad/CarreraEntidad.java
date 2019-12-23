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
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID")
	private ClienteEntidad cliente;

	@Column(name = "fechaInicio")
	private LocalDateTime fechaInicio;

	@OneToOne(mappedBy = "carrera")
	private DetalleCarreraEntidad detalleCarrera;	
	
}
