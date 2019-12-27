package com.ceiba.adn.taximetrovirtual.infraestructura.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;
import com.ceiba.adn.taximetrovirtual.aplicacion.servicio.ServicioCrearCliente;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * Clase encargada que sirve los servicios web de los Clientes
 * @author diego.avila
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cliente")
@Api(tags = "cliente")
public class ClienteController {

	private final ServicioCrearCliente servicioCliente;
	
	
	public ClienteController(ServicioCrearCliente servicioCliente) {
		this.servicioCliente = servicioCliente;
	}
		
	@PostMapping
	@ApiOperation(value = "Crear Cliente", notes = "Servicio para Crear un Cliente")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Cliente Creado Exitosamente"),
			@ApiResponse(code = 400, message = "Solicitud invalida") })
	public ResponseEntity<ClienteEntidad> crearCliente(@RequestBody ClienteDTO cliente){
		ClienteEntidad clienteEntidad = new ClienteEntidad();
		clienteEntidad.setId(cliente.getId());
		clienteEntidad.setCedula(cliente.getCedula());
		clienteEntidad.setNombre(cliente.getNombre());
		clienteEntidad.setApellido(cliente.getApellido());
		return new ResponseEntity<>(this.servicioCliente.ejecutar(clienteEntidad), HttpStatus.CREATED);
	}
}
