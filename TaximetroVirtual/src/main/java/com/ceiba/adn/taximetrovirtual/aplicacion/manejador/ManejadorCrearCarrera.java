package com.ceiba.adn.taximetrovirtual.aplicacion.manejador;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.CarreraDTO;
import com.ceiba.adn.taximetrovirtual.aplicacion.mapeador.MapeadorCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.dominio.servicio.ServicioCrearCarrera;

/**
 * Clase para definir el servicio de creacion de carrera
 * 
 * @author diego.avila
 *
 */
public class ManejadorCrearCarrera {
	private final ServicioCrearCarrera servicioCrearCarrera;

	public ManejadorCrearCarrera(ServicioCrearCarrera servicioCrearCarrera) {
		this.servicioCrearCarrera = servicioCrearCarrera;
	}

	/**
	 * Metodo encargado de realizar la operacion de creacion de una carrera
	 * 
	 * @param carreraEntidad
	 * @return
	 */

	public Carrera ejecutar(CarreraDTO carreraDTO) {
		Carrera carrera = MapeadorCarrera.mapearAModelo(carreraDTO);
		return this.servicioCrearCarrera.crearCarrera(carrera);
	}

}
