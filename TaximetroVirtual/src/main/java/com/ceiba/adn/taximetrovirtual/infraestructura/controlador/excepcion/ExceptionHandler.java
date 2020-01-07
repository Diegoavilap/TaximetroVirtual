package com.ceiba.adn.taximetrovirtual.infraestructura.controlador.excepcion;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionClienteNoEncontrado;
import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionCedulaYaRegistrada;
import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionFechaFinalAnteriorAFechaInicial;


@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{
	private static final Logger LOG = LogManager.getLogger(ExceptionHandler.class);
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ExcepcionFechaFinalAnteriorAFechaInicial.class)
	public void excepcionFechaFinalInvalida(HttpServletResponse response) throws IOException {
		LOG.warn("ServicioCrearCliente.crearCliente - La Fecha Fin debe ser mayor a la inicial");
		response.sendError(HttpStatus.PRECONDITION_FAILED.value());
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ExcepcionClienteNoEncontrado.class)
	public void excepcionClienteNoEncontrado(HttpServletResponse response) throws IOException {
		LOG.warn("ServicioCrearCarrera.crearCarrera - No se encuentra Registrado un Cliente con el numero de Cedula proporcionado");
		response.sendError(HttpStatus.BAD_REQUEST.value());
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ExcepcionCedulaYaRegistrada.class)
	public void excepcionClienteYaRegistrado(HttpServletResponse response) throws IOException {
		LOG.warn("--ServicioCrearCliente.crearCliente - No se encuentra cliente con esa cedula--");
		response.sendError(HttpStatus.PRECONDITION_FAILED.value());
	}
}
