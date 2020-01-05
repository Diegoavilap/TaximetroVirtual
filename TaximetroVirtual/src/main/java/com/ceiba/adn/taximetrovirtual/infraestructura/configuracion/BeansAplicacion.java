package com.ceiba.adn.taximetrovirtual.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adn.taximetrovirtual.aplicacion.manejador.ManejadorCrearCarrera;
import com.ceiba.adn.taximetrovirtual.aplicacion.manejador.ManejadorCrearCliente;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.taximetrovirtual.dominio.servicio.ServicioCrearCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.servicio.ServicioCrearCliente;

@Configuration
public class BeansAplicacion {
	
	@Bean
	public ManejadorCrearCliente manejadorCrearCliente(final ServicioCrearCliente servicioCrearCliente) {
		return new ManejadorCrearCliente(servicioCrearCliente);
	}
	
	@Bean
	public ServicioCrearCliente servicioCrearCliente(final RepositorioCliente repositorioCliente) {
		return new ServicioCrearCliente(repositorioCliente);
	}

	
	@Bean
	public ManejadorCrearCarrera manejadorCrearCarrera(final ServicioCrearCarrera servicioCrearCarrera) {
		return new ManejadorCrearCarrera(servicioCrearCarrera);
	}
	
	@Bean
	public ServicioCrearCarrera servicioCrearcarrera (final RepositorioCarrera repositorioCarrera, final RepositorioCliente repositorioCliente) {
		return new ServicioCrearCarrera(repositorioCarrera, repositorioCliente);
	}
	
}
