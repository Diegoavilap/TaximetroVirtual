package com.ceiba.adn.taximetrovirtual.aplicacion.mapeador;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;

public class MapeadorCliente {

	private MapeadorCliente() {
	}

	/**
	 * Funcion encargada de convertir una clase Clientea ClienteDTO
	 * 
	 * @param Cliente
	 * @return ClienteDTO
	 */
	public static ClienteDTO mapearDTO(Cliente cliente) {

		return new ClienteDTO(cliente.getId(), cliente.getCedula(), cliente.getNombre(), cliente.getApellido());

	}

	/**
	 * Funcion encargada de convertir una clase ClienteDTO a Cliente
	 * 
	 * @param ClienteDTO
	 * @return Cliente
	 */
	public static Cliente mapearAModelo(ClienteDTO clienteDTO) {

		return new Cliente(clienteDTO.getId(), clienteDTO.getCedula(), clienteDTO.getNombre(),
				clienteDTO.getApellido());

	}

}
