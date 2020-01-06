package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.DetalleCarreraEntidad;

public interface RepositorioDetalleCarreraJPA extends JpaRepository<DetalleCarreraEntidad, Long>{

}
