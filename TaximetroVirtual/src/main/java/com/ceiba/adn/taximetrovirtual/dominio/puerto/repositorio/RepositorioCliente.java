package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;


public interface RepositorioCliente extends JpaRepository<Cliente, Long>{
/*
	public Long crear(Cliente cliente);

	public void actualizar(Cliente cliente);

	public Optional<Cliente> buscarPorIdCliente(Long id);

	public Optional<Cliente> buscarPorCedula(String cedula);

	public List<Cliente> listar();
*/
}
