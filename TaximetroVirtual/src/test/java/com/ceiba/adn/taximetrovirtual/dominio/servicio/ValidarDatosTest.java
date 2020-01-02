package com.ceiba.adn.taximetrovirtual.dominio.servicio;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;


public class ValidarDatosTest {
	private static final String MSG_CEDULA_TIENE_CARACTERES_NO_NUMERICOS = "La cedula debe contener solo caracteres numericos";
	private static final String MSG_CEDULA_TIENE_ESPACIOS = "La cedula no debe contener espacios entre los numeros";
	
	@Test
	public void cedulaConCaracteresNoNumericos() {
		// arrange
		String cedulaConCaracteresNoNumericos = "1'104.098.093";

		// act / assert
		assertThrows(IllegalArgumentException.class, 
						() ->  ValidarDatos.validarCedula(cedulaConCaracteresNoNumericos), 
						MSG_CEDULA_TIENE_CARACTERES_NO_NUMERICOS);	    
	}
	
	@Test
	public void cedulaConEspaciosEntreLosNumeros() {
		// arrange
		String cedulaConCaracteresNoNumericos = " 1 104 098 093 ";

		// act / assert
		assertThrows(IllegalArgumentException.class, 
						() ->  ValidarDatos.validarCedula(cedulaConCaracteresNoNumericos), 
						MSG_CEDULA_TIENE_ESPACIOS);	    
	}
	
	
}
