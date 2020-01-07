package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCarrera;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;
import com.ceiba.adn.taximetrovirtual.infraestructura.mapeador.MapeadorCarreraEntidad;

@Component
public class AdaptadorRepositorioCarrera implements RepositorioCarrera {

	private RepositorioCarreraJPA carreraJPA;

	public AdaptadorRepositorioCarrera(RepositorioCarreraJPA carreraJPA) {
		this.carreraJPA = carreraJPA;
	}

	@Override
	public Carrera crear(Carrera carrera) {
		CarreraEntidad entidad = MapeadorCarreraEntidad.mapearAEntidad(carrera);
		return MapeadorCarreraEntidad.mapearAModelo(carreraJPA.save(entidad));
	}

	@Override
	public Optional<Carrera> buscarPorId(Long id) {
		return carreraJPA.findById(id).map(MapeadorCarreraEntidad::mapearAModelo);
	}

}
