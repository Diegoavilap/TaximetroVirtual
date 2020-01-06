package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;

public interface RepositorioDetalleCarrera{
	
	public DetalleCarrera crear (DetalleCarrera detalleCarrera);
	
	public List<DetalleCarrera> listar();
}
