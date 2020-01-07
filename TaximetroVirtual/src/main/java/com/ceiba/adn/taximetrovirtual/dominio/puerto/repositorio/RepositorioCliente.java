package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import java.util.List;
import java.util.Optional;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;

public interface RepositorioCliente {

	/**
	 * Metodo encargado de la persistencia de un Cliente
	 * 
	 * @param Cliente
	 * @return Cliente
	 */
	public Cliente crear(Cliente cliente);

	/**
	 * Metodo encargado de la busqueda de un Cliente por la cedula proporcionada
	 * 
	 * @param cedula
	 * @return Optional<Cliente> que representa los datos que se encuentran
	 *         registrados para el cliente que tiene la cedula que fue proporcionada
	 * 
	 */
	public Optional<Cliente> buscarClientePorCedula(String cedula);

	/**
	 * Metodo que valida la existencia de un Cliente con la cedula proporcionada
	 * 
	 * @param cedula
	 * @return true si encuentra un Cliente registrado que tenga esa cedula, false
	 *         en caso contrario.
	 */
	public boolean existePorCedula(String cedula);

	/**
	 * Metodo que permite traer el listado de Clientes que se encuentran persistidos
	 * @return
	 */
	public List<Cliente> listar();
}
