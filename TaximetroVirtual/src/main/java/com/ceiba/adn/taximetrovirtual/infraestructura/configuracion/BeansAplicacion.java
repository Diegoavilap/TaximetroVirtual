package com.ceiba.adn.taximetrovirtual.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adn.taximetrovirtual.aplicacion.servicio.ServicioCrearCarrera;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCarrera;

@Configuration
public class BeansAplicacion {
	
	@Bean
	public ServicioCrearCarrera servicioCrearCarrera(final RepositorioCarrera repositorioCarrera) {
		return new ServicioCrearCarrera(repositorioCarrera);
	}

}
