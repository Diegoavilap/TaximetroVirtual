package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionDatoYaRegistrado;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioCrearCliente {
	
	private RepositorioCliente repositorio;
	private static String MSG_CEDULA_YA_REGISTRADA = "La cedula proporcionada ya se encuentra registrada";
	
	public ServicioCrearCliente(RepositorioCliente repositorio) {
		this.repositorio = repositorio;
	}
	
	public Cliente crearCliente(Cliente cliente) {
		if (repositorio.existePorCedula(cliente.getCedula())) {
			throw new ExcepcionDatoYaRegistrado(MSG_CEDULA_YA_REGISTRADA);
		}
		return repositorio.crear(cliente);
	}
}
