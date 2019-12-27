package com.ceiba.adn.taximetrovirtual.aplicacion.servicio;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;
import com.ceiba.adn.taximetrovirtual.aplicacion.mapeador.MapeadorCliente;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCliente;

/**
 * Clase para definir el servicio de creación de cliente
 * 
 * @author martosfre
 *
 */
@Service
public class ServicioCrearCliente {

	private final RepositorioCliente repositorioCliente;

	public ServicioCrearCliente(RepositorioCliente repositorioCliente) {
		this.repositorioCliente = repositorioCliente;
	}
	
	@Transactional
	public Cliente ejecutar(ClienteDTO clienteDTO) {
		Cliente cliente = MapeadorCliente.mapearAModelo(clienteDTO);
		return this.repositorioCliente.save(cliente);
	}
}
