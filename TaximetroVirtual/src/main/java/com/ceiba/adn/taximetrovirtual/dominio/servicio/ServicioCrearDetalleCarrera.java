package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionCarreraNoEncontrada;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioDetalleCarrera;

public class ServicioCrearDetalleCarrera {
	private static final Logger LOG = LogManager.getLogger(ServicioCrearDetalleCarrera.class);
	private RepositorioDetalleCarrera repositorioDetalleCarrera;
	private RepositorioCarrera repositorioCarrera;

	public ServicioCrearDetalleCarrera(RepositorioDetalleCarrera repositorioDetalleCarrera, RepositorioCarrera repositorioCarrera) {
		this.repositorioDetalleCarrera = repositorioDetalleCarrera;
		this.repositorioCarrera = repositorioCarrera;
	}
	
	public DetalleCarrera crearDetalleCarrera(DetalleCarrera detalleCarrera) {
		Carrera carreraRegistrada = repositorioCarrera.buscarPorId(detalleCarrera.getCarreraId())
				.orElseThrow(() -> {
					ExcepcionCarreraNoEncontrada excepcion = new ExcepcionCarreraNoEncontrada(
						"No se encuentra Registrada una carrera con el id proporcionado");
					LOG.warn(excepcion);
					throw excepcion;
				});
		detalleCarrera.setCarreraId(carreraRegistrada.getId());
		detalleCarrera.setFechaFin(LocalDateTime.now());
		ValidarFechas.validarFechaFinalPosteriorAFechaInicial(detalleCarrera.getFechaFin(), carreraRegistrada.getFechaInicio());
		detalleCarrera.setCosto(Taximetro.calcularCosto(carreraRegistrada, detalleCarrera.getFechaFin()));
		return repositorioDetalleCarrera.crear(detalleCarrera);
	}

}
