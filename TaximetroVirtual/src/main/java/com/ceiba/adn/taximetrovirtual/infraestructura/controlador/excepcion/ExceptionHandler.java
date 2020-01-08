package com.ceiba.adn.taximetrovirtual.infraestructura.controlador.excepcion;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionClienteNoEncontrado;
import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionCedulaYaRegistrada;
import com.ceiba.adn.taximetrovirtual.dominio.excepcion.ExcepcionFechaFinalAnteriorAFechaInicial;


@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{

	@org.springframework.web.bind.annotation.ExceptionHandler(ExcepcionFechaFinalAnteriorAFechaInicial.class)
	public void excepcionFechaFinalInvalida(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.PRECONDITION_FAILED.value());
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ExcepcionClienteNoEncontrado.class)
	public void excepcionClienteNoEncontrado(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value());
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ExcepcionCedulaYaRegistrada.class)
	public void excepcionClienteYaRegistrado(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.PRECONDITION_FAILED.value());
	}
}
