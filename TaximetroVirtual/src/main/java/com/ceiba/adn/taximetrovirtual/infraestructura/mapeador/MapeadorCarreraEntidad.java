package com.ceiba.adn.taximetrovirtual.infraestructura.mapeador;

import java.util.Objects;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;

public final class MapeadorCarreraEntidad {
	private MapeadorCarreraEntidad() {
	}

	/**
	 * Metodo encargado de convertir una entidad carrera a un objeto carrera del
	 * dominio
	 * 
	 * @param carreraEntidad
	 * @return
	 */
	public static Carrera mapearAModelo(CarreraEntidad carreraEntidad) {
		if (Objects.isNull(carreraEntidad)) {
			return null;
		}
		return new Carrera(carreraEntidad.getId(), carreraEntidad.getClienteId().getId(),
				carreraEntidad.getFechaInicio());
	}

	/**
	 * Metodo que se encarga de convertir un objeto Carrera a una Entidad Carrera
	 * 
	 * @param carrera
	 * @return
	 */
	public static CarreraEntidad mapearAEntidad(Carrera carrera) {
		if (Objects.isNull(carrera)) {
			return null;
		}

		// Ese Cliente a medias no me gusta
		ClienteEntidad clienteEntidad = new ClienteEntidad();
		clienteEntidad.setId(carrera.getClienteId());

		return new CarreraEntidad(carrera.getId(), clienteEntidad, carrera.getFechaInicio());
	}

}
