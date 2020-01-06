package com.ceiba.adn.taximetrovirtual.aplicacion.mapeador;

import java.util.Objects;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.DetalleCarreraDTO;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;

public final class MapeadorDetalleCarrera {

	private MapeadorDetalleCarrera() {
	}

	public static DetalleCarreraDTO mapearADTO(DetalleCarrera detalleCarrera) {
		if (Objects.isNull(detalleCarrera)) {
			return null;
		}
		return new DetalleCarreraDTO(detalleCarrera.getId(), detalleCarrera.getCarreraId(), detalleCarrera.getFechaFin(),
				detalleCarrera.getCosto());
	}

	public static DetalleCarrera mapearAModelo(DetalleCarreraDTO detalleCarreraDTO) {
		if (Objects.isNull(detalleCarreraDTO)) {
			return null;
		}
		return new DetalleCarrera(detalleCarreraDTO.getId(), detalleCarreraDTO.getCarreraId(),
				detalleCarreraDTO.getFechaFin(), detalleCarreraDTO.getCosto());
	}
}
