package com.ceiba.adn.taximetrovirtual.aplicacion.manejador;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.DetalleCarreraDTO;
import com.ceiba.adn.taximetrovirtual.aplicacion.mapeador.MapeadorDetalleCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.servicio.ServicioCrearDetalleCarrera;

public class ManejadorCrearDetalleCarrera {
	private final ServicioCrearDetalleCarrera servicioCrearDetalleCarrera;

	public ManejadorCrearDetalleCarrera(ServicioCrearDetalleCarrera servicioCrearDetalleCarrera) {
		this.servicioCrearDetalleCarrera = servicioCrearDetalleCarrera;
	}
	
	public DetalleCarrera ejecutar(DetalleCarreraDTO detalleCarreraDTO) {
		DetalleCarrera detalleCarrera = MapeadorDetalleCarrera.mapearAModelo(detalleCarreraDTO);
		return this.servicioCrearDetalleCarrera.crearDetalleCarrera(detalleCarrera); 
	}

}
