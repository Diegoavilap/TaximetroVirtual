package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionClienteNoEncontrado;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioCrearCarrera {
	private RepositorioCarrera repositorioCarrera;
	private RepositorioCliente repositorioCliente;

	public ServicioCrearCarrera(RepositorioCarrera repositorioCarrera, RepositorioCliente repositorioCliente) {
		this.repositorioCarrera = repositorioCarrera;
		this.repositorioCliente = repositorioCliente;
	}

	public Carrera crearCarrera(Carrera carrera) {
		Cliente clienteRegistrado = repositorioCliente.buscarClientePorCedula(carrera.getClienteId().toString())
				.orElseThrow(() -> new ExcepcionClienteNoEncontrado(
						"No se encuentra Registrado un Cliente con el numero de Cedula proporcionado"));
		carrera.setClienteId(clienteRegistrado.getId());
		carrera.setFechaInicio(LocalDateTime.now());
		return repositorioCarrera.crear(carrera);
	}
}
