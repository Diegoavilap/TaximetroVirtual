package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCarrera;

public class ServicioCrearCarrera {
	private RepositorioCarrera repositorio;
	
	public ServicioCrearCarrera(RepositorioCarrera repositorio) {
		this.repositorio = repositorio;
	}
	
	public Carrera crearCarrera(Carrera carrera) {
		return repositorio.crear(carrera);
	}
}
