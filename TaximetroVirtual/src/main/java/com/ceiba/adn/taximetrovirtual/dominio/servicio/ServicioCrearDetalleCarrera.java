package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import java.time.LocalDateTime;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionCarreraNoEncontrada;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioDetalleCarrera;

public class ServicioCrearDetalleCarrera {

	private RepositorioDetalleCarrera repositorioDetalleCarrera;
	private RepositorioCarrera repositorioCarrera;

	public ServicioCrearDetalleCarrera(RepositorioDetalleCarrera repositorioDetalleCarrera, RepositorioCarrera repositorioCarrera) {
		this.repositorioDetalleCarrera = repositorioDetalleCarrera;
		this.repositorioCarrera = repositorioCarrera;
	}
	
	public DetalleCarrera crearDetalleCarrera(DetalleCarrera detalleCarrera) {
		//Aqui toca poner todo la logica
		Carrera carreraRegistrada = repositorioCarrera.buscarPorId(detalleCarrera.getCarreraId())
				.orElseThrow(() -> new ExcepcionCarreraNoEncontrada(
						"No se encuentra Registrada una carrera con el id proporcionado"));
		detalleCarrera.setFechaFin(LocalDateTime.now());
		ValidarFechas.validarFechaFinalPosteriorAFechaInicial(detalleCarrera.getFechaFin(), carreraRegistrada.getFechaInicio());
		detalleCarrera.setCosto(Taximetro.calcularCosto(carreraRegistrada, detalleCarrera.getFechaFin()));
		return repositorioDetalleCarrera.crear(detalleCarrera);
	}

}