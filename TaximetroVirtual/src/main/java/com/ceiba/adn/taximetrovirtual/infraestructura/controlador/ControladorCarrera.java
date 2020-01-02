package com.ceiba.adn.taximetrovirtual.infraestructura.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.taximetrovirtual.aplicacion.dto.CarreraDTO;
import com.ceiba.adn.taximetrovirtual.aplicacion.manejador.ManejadorCrearCarrera;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.CarreraEntidad;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Clase encargada que sirve los servicios web de las Carreras
 * 
 * @author diego.avila
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/api/carrera")
@Api(tags = "carrera")
public class ControladorCarrera {

	private final ManejadorCrearCarrera servicioCarrera;

	public ControladorCarrera(ManejadorCrearCarrera servicioCarrera) {
		this.servicioCarrera = servicioCarrera;
	}
	/*
	@PostMapping
	@ApiOperation(value = "Crear Carrera", notes = "Servicio para Crear un Carrera")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Carrera Creada Exitosamente"),
			@ApiResponse(code = 400, message = "Solicitud invalida") })
	public ResponseEntity<CarreraEntidad> crearCarrera(@RequestBody CarreraDTO carrera) {
		CarreraEntidad carreraEntidad = new CarreraEntidad();
		//Como se hacen con las relaciones, 
		
		carreraEntidad.setId(carrera.getId());
		
		carreraEntidad.setClienteId(carrera.getClienteId());
		carreraEntidad.setFechaInicio(carrera.getFechaInicio());
		return new ResponseEntity<>(this.servicioCarrera.ejecutar(carreraEntidad), HttpStatus.CREATED);
	}
	*/
}
