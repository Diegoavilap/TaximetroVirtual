package com.ceiba.adn.taximetrovirtual.aplicacion.mapeador;

import java.util.Objects;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.CarreraDTO;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;


public final class MapeadorCarrera {

	private MapeadorCarrera() {
	}

	/**
	 * Funcion encargada de convertir una clase CarreraEntidad a CarreraDTO
	 * 
	 * @param CarreraEntidad
	 * @return CarreraDTO
	 */
	public static CarreraDTO mapearADTO(Carrera carrera) {
		if (Objects.isNull(carrera)) {
			return null;
		}
		return new CarreraDTO(carrera.getId(), carrera.getClienteId(), carrera.getFechaInicio());

	}

	/**
	 * Funcion encargada de convertir una clase CarreraDTO a Carrera
	 * 
	 * @param CarreraDTO
	 * @return Carrera
	 */
	public static Carrera mapearAModelo(CarreraDTO carreraDTO) {
		if (Objects.isNull(carreraDTO)) {
			return null;
		}
		return new Carrera(carreraDTO.getId(), carreraDTO.getClienteId(), carreraDTO.getFechaInicio());

	}
}
