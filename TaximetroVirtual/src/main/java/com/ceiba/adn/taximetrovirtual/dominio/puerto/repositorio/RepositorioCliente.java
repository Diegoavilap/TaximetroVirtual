package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;

@Repository
public interface RepositorioCliente extends JpaRepository<ClienteEntidad, Long>{
/*
	public Long crear(Cliente cliente);

	public void actualizar(Cliente cliente);

	public Optional<Cliente> buscarPorIdCliente(Long id);

	public Optional<Cliente> buscarPorCedula(String cedula);

	public List<Cliente> listar();
*/
}
