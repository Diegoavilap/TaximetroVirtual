package com.ceiba.adn.taximetrovirtual.infraestructura.mapeador;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;

@Component
public class MapeadorClienteEntidad {
	
	public Cliente mapearAModelo(ClienteEntidad clienteEntidad) {
		if (Objects.isNull(clienteEntidad)) {
			return null;
		}
		return new Cliente(clienteEntidad.getId(), clienteEntidad.getCedula(), clienteEntidad.getNombre(),
				clienteEntidad.getApellido());
	}

	public ClienteEntidad mapearAEntidad(Cliente cliente) {
		if (Objects.isNull(cliente)) {
			return null;
		}
		return new ClienteEntidad(cliente.getId(), 
				cliente.getCedula(),
				cliente.getNombre(),
				cliente.getApellido());
	}
}
