package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;

public interface RepositorioCarrera{
	
	public Carrera crear (Carrera carrera);
	
	public List<Carrera> listar();
}
