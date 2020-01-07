package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.DetalleCarreraEntidad;

/**
 * Interfaz que permite utilizar los metodos que proporciona JpaRepository para la entidad DetalleCarrera
 * @author diego.avila
 *
 */
public interface RepositorioDetalleCarreraJPA extends JpaRepository<DetalleCarreraEntidad, Long>{

}
