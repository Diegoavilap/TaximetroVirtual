package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.DetalleCarreraEntidad;

public interface RepositorioDetalleCarrera extends JpaRepository<DetalleCarreraEntidad, Long>{
}
