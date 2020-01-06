package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;


import java.util.Optional;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;

public interface RepositorioCliente{
	
	public Cliente crear (Cliente cliente);
	
	public Optional<Cliente> buscarClientePorCedula(String cedula);
	
	public boolean existePorCedula(String cedula);
}
