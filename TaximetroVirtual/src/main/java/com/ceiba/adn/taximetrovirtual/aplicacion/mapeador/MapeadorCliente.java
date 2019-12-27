package com.ceiba.adn.taximetrovirtual.aplicacion.mapeador;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;

public class MapeadorCliente {

	private MapeadorCliente() {
	}

	/**
	 * Funcion encargada de convertir una clase ClienteEntidad a ClienteDTO
	 * 
	 * @param ClienteEntidad
	 * @return ClienteDTO
	 */
	public static ClienteDTO mapearDTO(ClienteEntidad clienteEntidad) {

		return new ClienteDTO(clienteEntidad.getId(), clienteEntidad.getCedula(), clienteEntidad.getNombre(),
				clienteEntidad.getApellido());

	}

	/**
	 * Funcion encargada de convertir una clase ClienteDTO a ClienteEntidad
	 * 
	 * @param ClienteDTO
	 * @return ClienteEntidad
	 */
	public static ClienteEntidad mapearAModelo(ClienteDTO clienteDTO) {

		ClienteEntidad clienteEntidad = new ClienteEntidad();
		clienteEntidad.setId(clienteDTO.getId());
		clienteEntidad.setCedula(clienteDTO.getCedula());
		clienteEntidad.setNombre(clienteDTO.getNombre());
		clienteEntidad.setApellido(clienteDTO.getApellido());

		return clienteEntidad;
	}

}
