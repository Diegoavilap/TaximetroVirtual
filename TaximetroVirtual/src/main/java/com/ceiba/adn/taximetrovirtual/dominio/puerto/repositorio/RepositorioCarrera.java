package com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Carrera;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;

public interface RepositorioCarrera extends JpaRepository<Cliente, String>{

	public Long crear(Carrera carrera);

	public void actualizar(Carrera carrera);

	public void eliminar(Long id);

	public Optional<Carrera> buscarPorId(Long id);

	public Optional<Carrera> buscarPorCedula(String cedula);

	public List<Carrera> listar();
}
