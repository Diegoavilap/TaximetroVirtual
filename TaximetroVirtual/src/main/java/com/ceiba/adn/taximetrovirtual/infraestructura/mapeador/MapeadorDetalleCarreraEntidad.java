package com.ceiba.adn.taximetrovirtual.infraestructura.mapeador;

import java.util.Objects;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.DetalleCarreraEntidad;

public final class MapeadorDetalleCarreraEntidad {
	private MapeadorDetalleCarreraEntidad() {
	}

	public static DetalleCarrera mapearAModelo(DetalleCarreraEntidad detalleCarreraEntidad) {
		if (Objects.isNull(detalleCarreraEntidad)) {
			return null;
		}
		return new DetalleCarrera(detalleCarreraEntidad.getId(),
				// Esta vuelta toca cambiarla
				detalleCarreraEntidad.getCarrera().getId(), detalleCarreraEntidad.getFechaFin(),
				detalleCarreraEntidad.getCosto());
	}

	public static DetalleCarreraEntidad mapearAEntidad(DetalleCarrera detalleCarrera) {
		if (Objects.isNull(detalleCarrera)) {
			return null;
		}
		CarreraEntidad carrera = new CarreraEntidad();
		carrera.setId(detalleCarrera.getCarreraId());
		
		return new DetalleCarreraEntidad(detalleCarrera.getId(), carrera,
				detalleCarrera.getFechaFin(), detalleCarrera.getCosto());
	}
}
