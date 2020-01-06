package com.ceiba.adn.taximetrovirtual.infraestructura.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.DetalleCarreraDTO;
import com.ceiba.adn.taximetrovirtual.aplicacion.manejador.ManejadorCrearDetalleCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.modelo.DetalleCarrera;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin
@RestController
@RequestMapping("/api/detalleCarrera")
@Api(tags = "detalleCarrera")
public class ControladorDetalleCarrera {
	private final ManejadorCrearDetalleCarrera servicioDetalleCarrera;

	public ControladorDetalleCarrera(ManejadorCrearDetalleCarrera servicioDetalleCarrera) {
		this.servicioDetalleCarrera = servicioDetalleCarrera;
	}
	
	@PostMapping
	@ApiOperation(value = "Crear Detalle Carrera", notes = "Servicio para Crear un Detalle Carrera")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Detalle Carrera Creado Exitosamente"),
			@ApiResponse(code = 400, message = "Solicitud invalida") })
	public ResponseEntity<DetalleCarrera> crearDetalleCarrera(@RequestBody DetalleCarreraDTO detalleCarreraDTO) {
		return new ResponseEntity<>(this.servicioDetalleCarrera.ejecutar(detalleCarreraDTO), HttpStatus.CREATED);
	}

}
