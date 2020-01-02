package com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.ceiba.adn.taximetrovirtual.dominio.modelo.Cliente;
import com.ceiba.adn.taximetrovirtual.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.adn.taximetrovirtual.infraestructura.adaptador.repositorio.entidad.ClienteEntidad;
import com.ceiba.adn.taximetrovirtual.infraestructura.mapeador.MapeadorClienteEntidad;

@Component
public class AdaptadorRepositorioCliente implements RepositorioCliente{

	private RepositorioClienteJPA clienteJPA;
	private MapeadorClienteEntidad mapeadorCliente;
	
	public AdaptadorRepositorioCliente(RepositorioClienteJPA clienteJPA, MapeadorClienteEntidad mapeadorClienteEntidad) {
		this.clienteJPA = clienteJPA;
		this.mapeadorCliente = mapeadorClienteEntidad;
	}
	
	@Override
	public Cliente crear(Cliente cliente) {
		ClienteEntidad entidad;
		entidad = mapeadorCliente.mapearAEntidad(cliente);
		return mapeadorCliente.mapearAModelo(clienteJPA.save(entidad));
	}

	@Override
	public Optional<Cliente> buscarPorCedula(String cedula) {
		return clienteJPA.findByCedula(cedula);
	}

	@Override
	public boolean existePorCedula(String cedula) {
		return clienteJPA.existsByCedula(cedula);
	}
	
}
