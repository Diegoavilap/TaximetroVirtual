package com.ceiba.adn.taximetrovirtual.infraestructura.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;
import com.ceiba.adn.taximetrovirtual.aplicacion.servicio.ServicioCrearCliente;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;

/**
 * Clase encargada que sirve los servicios web de los Clientes
 * @author diego.avila
 *
 */
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
/*
	private final ServicioCrearCliente servicioCliente;
	
	public ClienteController(ServicioCrearCliente servicioCliente) {
		this.servicioCliente = servicioCliente;
	}
	
	@PostMapping
	public ResponseEntity<Cliente> crearCliente(@RequestBody ClienteDTO clienteDTO){
		return new ResponseEntity<>(this.servicioCliente.ejecutar(clienteDTO), HttpStatus.CREATED);
	}
*/
}
