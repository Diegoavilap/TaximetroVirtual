package com.ceiba.adn.taximetrovirtual.aplicacion.manejador;

import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCarrera;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;

/**
 * Clase para definir el servicio de creaci�n de carrera
 * 
 * @author diego.avila
 *
 */
public class ManejadorCrearCarrera {
	private final RepositorioCarrera repositorioCarrera;

	public ManejadorCrearCarrera(RepositorioCarrera repositorioCarrera) {
		this.repositorioCarrera = repositorioCarrera;
	}
	
	/**
	 * M�todo encargado de realizar la operaci�n de creacion de una carrera
	 * @param carreraEntidad
	 * @return
	 */
	
	public CarreraEntidad ejecutar(CarreraEntidad carrera) {
		//CarreraEntidad carrera = MapeadorCliente.mapearAModelo(clienteDTO);
		return this.repositorioCarrera.save(carrera);
	}
	
}
