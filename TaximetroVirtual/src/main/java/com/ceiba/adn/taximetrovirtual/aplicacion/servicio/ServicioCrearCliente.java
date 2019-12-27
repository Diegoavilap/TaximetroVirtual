package com.ceiba.adn.taximetrovirtual.aplicacion.servicio;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;

/**
 * Clase para definir el servicio de creación de cliente
 * 
 * @author diego.avila
 *
 */
@Service
public class ServicioCrearCliente {

	private final RepositorioCliente repositorioCliente;

	public ServicioCrearCliente(RepositorioCliente repositorioCliente) {
		this.repositorioCliente = repositorioCliente;
	}

	/**
	 * Método encargado de realizar la operación de creacion de un cliente
	 * @param clienteDTO
	 * @return
	 */
	@Transactional
	public ClienteEntidad ejecutar(ClienteEntidad cliente) {
		//ClienteEntidad cliente = MapeadorCliente.mapearAModelo(clienteDTO);
		return this.repositorioCliente.save(cliente);
	}

}
