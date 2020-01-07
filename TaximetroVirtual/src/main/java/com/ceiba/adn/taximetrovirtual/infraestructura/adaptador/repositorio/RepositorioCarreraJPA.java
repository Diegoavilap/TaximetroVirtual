package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;

/**
 * Interfaz que permite utilizar todos los metodos que proporciona JPA
 * Repository para la Entidad Carrera
 * 
 * @author diego.avila
 *
 */
public interface RepositorioCarreraJPA extends JpaRepository<CarreraEntidad, Long> {

}
