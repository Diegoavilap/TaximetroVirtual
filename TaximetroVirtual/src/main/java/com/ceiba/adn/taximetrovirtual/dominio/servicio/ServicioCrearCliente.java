package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionCedulaYaRegistrada;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioCrearCliente {
	private static final Logger LOG = LogManager.getLogger(ServicioCrearCliente.class);
	private RepositorioCliente repositorio;
	private static String msgCedulaYaRegistrada  = "La cedula proporcionada ya se encuentra registrada";
	
	public ServicioCrearCliente(RepositorioCliente repositorio) {
		this.repositorio = repositorio;
	}
	
	public Cliente crearCliente(Cliente cliente) {
		if (repositorio.existePorCedula(cliente.getCedula())) {
			ExcepcionCedulaYaRegistrada excepcion = new ExcepcionCedulaYaRegistrada(
					msgCedulaYaRegistrada);
				LOG.warn(excepcion);
				throw excepcion;
		}
			return repositorio.crear(cliente);
	}
}
 