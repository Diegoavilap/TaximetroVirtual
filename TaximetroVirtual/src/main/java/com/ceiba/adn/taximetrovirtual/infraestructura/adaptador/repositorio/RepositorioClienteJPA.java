package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;

/**
 * Interfaz que permite utilizar los metodos que proporciona JpaRepository para
 * la Entidad Cliente
 * 
 * @author diego.avila
 *
 */
public interface RepositorioClienteJPA extends JpaRepository<ClienteEntidad, Long> {
	/**
	 * Metodo que permite la busqueda de un Cliente por Cedula
	 * 
	 * @param cedula
	 * @return Optional<Cliente>
	 */
	public Optional<Cliente> findByCedula(@Param("cedula") String cedula);

	/**
	 * Metodo que se encarga de validar si ya se encuentra registrado un Cliente con
	 * la cedula proporcionada
	 * 
	 * @param cedula
	 * @return boolean {true} si ya existe un cliente con esa cedula o {false} en caso contrario
	 */
	public boolean existsByCedula(@Param("cedula") String cedula);
}
