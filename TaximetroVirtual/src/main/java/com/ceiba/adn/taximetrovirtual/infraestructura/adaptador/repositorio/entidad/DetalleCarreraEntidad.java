package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLE_CARRERA")
public class DetalleCarreraEntidad {

	public DetalleCarreraEntidad() {}

	
	public DetalleCarreraEntidad(Long id, CarreraEntidad carrera, LocalDateTime fechaFin, BigDecimal costo) {
		this.id = id;
		this.carrera = carrera;
		this.fechaFin = fechaFin;
		this.costo = costo;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "CARRERA_ID", referencedColumnName = "id")
	private CarreraEntidad carrera;

	@Column(name = "FECHA_FIN")
	private LocalDateTime fechaFin;

	@Column(name = "COSTO")
	private BigDecimal costo;

	public Long getId() {
		return id;
	}

	public CarreraEntidad getCarrera() {
		return carrera;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public BigDecimal getCosto() {
		return costo;
	}

}
