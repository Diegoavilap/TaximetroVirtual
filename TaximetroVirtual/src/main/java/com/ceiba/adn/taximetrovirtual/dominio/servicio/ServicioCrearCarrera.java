package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionClienteNoEncontrado;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioCrearCarrera {
	private static final Logger LOG = LogManager.getLogger(ServicioCrearCarrera.class);
	private RepositorioCarrera repositorioCarrera;
	private RepositorioCliente repositorioCliente;

	public ServicioCrearCarrera(RepositorioCarrera repositorioCarrera, RepositorioCliente repositorioCliente) {
		this.repositorioCarrera = repositorioCarrera;
		this.repositorioCliente = repositorioCliente;
	}

	public Carrera crearCarrera(Carrera carrera) {
		Cliente clienteRegistrado = repositorioCliente.buscarClientePorCedula(carrera.getClienteId().toString())
				.orElseThrow(() -> { 
					ExcepcionClienteNoEncontrado excepcion = new ExcepcionClienteNoEncontrado(
						"No se encuentra Registrado un Cliente con el numero de Cedula proporcionado");
					LOG.warn(excepcion);
					return excepcion;
				});
		
		carrera.setClienteId(clienteRegistrado.getId());
		carrera.setFechaInicio(LocalDateTime.now());
		return repositorioCarrera.crear(carrera);
	}
}
