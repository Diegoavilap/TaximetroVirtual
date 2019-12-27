/**
 * 
 * 
 */
package com.ceiba.adn.taximetrovirtual.aplicacion.mapeador;


import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;

/**
 * Clase encargada de mapear una clase Cliente a su respectivo ClienteDTO y viceversa
 * @author diego.avila
 *
 */
public final class MapeadorCliente {

	
	private MapeadorCliente() {
		throw new AssertionError("Esta clase no debe ser instanciada");
	}

	/**
	 * Funcion que de acuerdo a un ClienteDTO lo mapea en un Cliente
	 * @param ClienteDTO clienteDTO
	 * @return Cliente
	 */
	public static ClienteEntidad mapearAModelo(ClienteDTO clienteDTO) {
		ClienteEntidad entidadCliente = new ClienteEntidad().setId(clienteDTO.getId());
		return entidadCliente;
	}
	
	/**
	 * Funcion que de acuerdo a un Cliente lo mapea en un ClienteDTO
	 * @param Cliente cliente
	 * @return ClienteDTO
	 */
	public static ClienteDTO mapearADTO(Cliente cliente) {
		return new ClienteDTO(cliente.getId(), 
						cliente.getCedula(), 
						cliente.getNombre(),
						cliente.getApellido());
	}
}
