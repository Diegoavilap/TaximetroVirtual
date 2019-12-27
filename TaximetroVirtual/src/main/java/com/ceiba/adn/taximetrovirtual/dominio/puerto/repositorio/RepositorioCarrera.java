package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;

public interface RepositorioCarrera extends JpaRepository<CarreraEntidad, Long>{

}
