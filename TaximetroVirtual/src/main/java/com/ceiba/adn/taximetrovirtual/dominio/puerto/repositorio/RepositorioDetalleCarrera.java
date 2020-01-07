package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;

public interface RepositorioDetalleCarrera {

	/**
	 * Metodo que permite la persistencia de un DetalleCarrera
	 * 
	 * @param detalleCarrera
	 * @return
	 */
	public DetalleCarrera crear(DetalleCarrera detalleCarrera);

}
