package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;
import com.mysql.cj.log.Log;

public interface RepositorioClienteJPA  extends JpaRepository<ClienteEntidad, Log> {
	
	public Optional<Cliente> findByCedula(@Param("cedula") String cedula);
	
	public boolean existsByCedula(@Param("cedula") String cedula);
}
