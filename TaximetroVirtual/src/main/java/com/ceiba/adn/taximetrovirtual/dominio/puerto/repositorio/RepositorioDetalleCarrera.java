package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import java.util.List;
import java.util.Optional;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;

public interface RepositorioDetalleCarrera {

	public Long crear(DetalleCarrera detalleCarrera);

	public Optional<DetalleCarrera> buscarDetalleCarreraPorId(Long id);

	public List<DetalleCarrera> listar();
	
}
