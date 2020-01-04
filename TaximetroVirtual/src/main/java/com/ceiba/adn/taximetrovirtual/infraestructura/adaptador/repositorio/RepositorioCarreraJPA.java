package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;

public interface RepositorioCarreraJPA extends JpaRepository<CarreraEntidad, Long>{

}
