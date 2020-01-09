package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;

public interface RepositorioDetalleCarrera {

	/**
	 * Metodo que permite la persistencia de un DetalleCarrera
	 * 
	 * @param detalleCarrera
	 * @return
	 */
	public DetalleCarrera crear(DetalleCarrera detalleCarrera);

	/**
	 * Método que se encarga de traer los DetalleCarrera que se encuentran
	 * persitidos
	 * 
	 * @return
	 */
	public List<DetalleCarrera> listar();
}
