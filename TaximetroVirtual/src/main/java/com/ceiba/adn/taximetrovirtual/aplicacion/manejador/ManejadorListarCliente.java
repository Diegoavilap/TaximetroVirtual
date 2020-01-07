package com.ceiba.adn.taximetrovirtual.aplicacion.manejador;

import java.util.List;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.dominio.servicio.ServicioListarClientes;


public class ManejadorListarCliente {

	private final ServicioListarClientes listarClientes;

	public ManejadorListarCliente(ServicioListarClientes consultaClientes) {
			
		this.listarClientes = consultaClientes;
	}

	public List<Cliente> ejecutar() {
		return this.listarClientes.listarClientes();
	}
}
