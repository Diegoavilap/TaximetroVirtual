package com.ceiba.adn.taximetrovirtual.aplicacion.manejador;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;
import com.ceiba.adn.taximetrovirtual.aplicacion.mapeador.MapeadorCliente;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.dominio.servicio.ServicioCrearCliente;

/**
 * Clase para definir el servicio de creacion de cliente
 * 
 * @author diego.avila
 *
 */
public class ManejadorCrearCliente {

	private final ServicioCrearCliente servicioCrearCliente;

	public ManejadorCrearCliente(ServicioCrearCliente servicioCrearCliente) {
		this.servicioCrearCliente = servicioCrearCliente;
	}

	/**
	 * Metodo encargado de realizar la operacion de creacion de un cliente
	 * 
	 * @param clienteDTO
	 * @return
	 */
	public Cliente ejecutar(ClienteDTO clienteDTO) {
		Cliente cliente = MapeadorCliente.mapearAModelo(clienteDTO);
//		try {
			return this.servicioCrearCliente.crearCliente(cliente); 
//		}catch(NullPointerException e) {
//			throw new RuntimeException("este es el error " + " " +
//					cliente.getId() + " " +
//					cliente.getCedula() +	 " " +
//					cliente.getNombre() +  " " +
//					cliente.getApellido() + " " +
//					" ... Mensaje  ..." +  " " +
//					e);
//		}
	}

}
