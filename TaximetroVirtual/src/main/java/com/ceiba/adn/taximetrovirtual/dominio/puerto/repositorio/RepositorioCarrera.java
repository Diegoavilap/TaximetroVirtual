package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import java.util.List;
import java.util.Optional;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;

public interface RepositorioCarrera {
	/**
	 * Metodo encargado de la persistencia de una Carrera
	 * 
	 * @param Carrera
	 * @return Carrera
	 */
	public Carrera crear(Carrera carrera);

	/**
	 * Metodo encargado de la busqueda de una Carrera dado el ID proporcionado
	 * 
	 * @param id
	 * @return Optional<Carrera> que representa los datos que se encuentran
	 *         persitidos para la carrera que tiene el id que fue proporcionado o un
	 *         Optional vacio si no encuentra una Carrera con ese id
	 */
	public Optional<Carrera> buscarPorId(Long id);

	/**
	 * Metodo que permite traer el listado de carreras que se encuentra persitido
	 * 
	 * @return List<Carrera> Listado de carreras registrado
	 */
	public List<Carrera> listar();

}
