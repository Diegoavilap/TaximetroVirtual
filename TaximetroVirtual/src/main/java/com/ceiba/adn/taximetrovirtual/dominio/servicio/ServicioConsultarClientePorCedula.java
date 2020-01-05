package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import java.util.Optional;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioConsultarClientePorCedula {
	private RepositorioCliente repositorio;
	
	public ServicioConsultarClientePorCedula(RepositorioCliente repositorio) {
		this.repositorio = repositorio;
	}
	
	public Optional<Cliente> consultar(String cedula) {
		return repositorio.buscarClientePorCedula(cedula);
	}
}
