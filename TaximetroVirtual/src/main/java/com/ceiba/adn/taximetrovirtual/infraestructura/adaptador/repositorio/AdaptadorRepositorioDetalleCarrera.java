package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio;

import org.springframework.stereotype.Component;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioDetalleCarrera;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.DetalleCarreraEntidad;
import com.ceiba.adn.taximetrovirtual.infraestructura.mapeador.MapeadorDetalleCarreraEntidad;

@Component
public class AdaptadorRepositorioDetalleCarrera implements RepositorioDetalleCarrera{
	private RepositorioDetalleCarreraJPA detalleCarreraJPA;

	public AdaptadorRepositorioDetalleCarrera(RepositorioDetalleCarreraJPA detalleCarreraJPA) {
		this.detalleCarreraJPA = detalleCarreraJPA;
	}

	@Override
	public DetalleCarrera crear(DetalleCarrera detalleCarrera) {
		DetalleCarreraEntidad entidad = MapeadorDetalleCarreraEntidad.mapearAEntidad(detalleCarrera);
		return MapeadorDetalleCarreraEntidad.mapearAModelo(detalleCarreraJPA.save(entidad)); 
	}	
	
}
