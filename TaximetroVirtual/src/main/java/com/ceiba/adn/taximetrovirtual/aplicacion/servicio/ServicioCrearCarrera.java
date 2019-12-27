package com.ceiba.adn.taximetrovirtual.aplicacion.servicio;

import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCarrera;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;

/**
 * Clase para definir el servicio de creación de carrera
 * 
 * @author diego.avila
 *
 */
public class ServicioCrearCarrera {
	private final RepositorioCarrera repositorioCarrera;

	public ServicioCrearCarrera(RepositorioCarrera repositorioCarrera) {
		this.repositorioCarrera = repositorioCarrera;
	}
	
	/**
	 * Método encargado de realizar la operación de creacion de una carrera
	 * @param carreraEntidad
	 * @return
	 */
	
	public CarreraEntidad ejecutar(CarreraEntidad carrera) {
		//CarreraEntidad carrera = MapeadorCliente.mapearAModelo(clienteDTO);
		return this.repositorioCarrera.save(carrera);
	}
	
}
