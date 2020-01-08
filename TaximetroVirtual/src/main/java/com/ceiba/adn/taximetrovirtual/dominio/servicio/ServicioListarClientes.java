package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import java.util.List;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioListarClientes {

	private RepositorioCliente repositorio;

	public ServicioListarClientes(RepositorioCliente repositorio) {
		this.repositorio = repositorio;
	}
	public List<Cliente> listarClientes() {
		return repositorio.listar();
	}
}
