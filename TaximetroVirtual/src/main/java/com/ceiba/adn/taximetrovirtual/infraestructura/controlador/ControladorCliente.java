package com.ceiba.adn.taximetrovirtual.infraestructura.controlador;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.ClienteDTO;
import com.ceiba.adn.taximetrovirtual.aplicacion.manejador.ManejadorCrearCliente;
import com.ceiba.adn.taximetrovirtual.aplicacion.manejador.ManejadorListarCliente;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * Clase encargada que sirve los servicios web de los Clientes
 * 
 * @author diego.avila
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/cliente")
@Api(tags = "cliente")
public class ControladorCliente {
	private static final Logger LOG = LogManager.getLogger(ControladorCliente.class);
	private final ManejadorCrearCliente servicioCrearCliente;
	private final ManejadorListarCliente servicioListarCliente;

	public ControladorCliente(ManejadorCrearCliente servicioCliente, ManejadorListarCliente servicioListarCliente) {
		this.servicioCrearCliente = servicioCliente;
		this.servicioListarCliente = servicioListarCliente;
	}

	@PostMapping
	@ApiOperation(value = "Crear Cliente", notes = "Servicio para Crear un Cliente")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Cliente Creado Exitosamente"),
			@ApiResponse(code = 400, message = "Solicitud invalida") })
	public ResponseEntity<Cliente> crearCliente(@RequestBody ClienteDTO clienteDTO) {
		return new ResponseEntity<>(this.servicioCrearCliente.ejecutar(clienteDTO), HttpStatus.CREATED);
	}

	@GetMapping(produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Cliente>> consultarBanos() {
		LOG.warn("La consulta funciona correctamente");
		return new ResponseEntity<>(this.servicioListarCliente.ejecutar(), HttpStatus.OK);
	}
}
