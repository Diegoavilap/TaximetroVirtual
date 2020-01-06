package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import java.util.List;
import java.util.Optional;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;

public interface RepositorioCarrera{
	
	public Carrera crear (Carrera carrera);
	
	public Optional<Carrera> buscarPorId(Long id);
	
	public List<Carrera> listar();	
	
}
