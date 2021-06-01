/**
 * 
 */
package com.markdev.restaurantjsf.services;

import java.util.Arrays;
import java.util.List;

import com.markdev.restaurantjsf.entity.Gerente;
import com.markdev.restaurantjsf.entity.Restaurante;

/**
 * @author marcos.hernandez
 * 
 * Clase encargada de la logica de negocio.
 *
 */
public class RestauranteService {
	
	/**
	 * Metodo que permite consultar la lista de restaurantes.
	 * @return {@link Restaurante} lista de restaurantes.
	 */
	public List<Restaurante> findAll() {
		List<Restaurante> empleados = Arrays.asList(new Restaurante("McDonalds", "Direccion 1", "México", new Gerente("Marcos Salvador", "Hernández", "Guadarrama")),
				new Restaurante("Xotepingo", "Direccion 2", "México", new Gerente("Luis Felipe", "Hernández", "Guadarrama")),
				new Restaurante("Las Brasas", "Direccion 3", "España", new Gerente("Luis Gemila", "Hernández", "Guadarrama")),
				new Restaurante("Laas Lasagna", "Direccion 4", "Italia", new Gerente("Diego", "Paniagua", "López")),
				new Restaurante("Burguers Boy", "Direccion 5", "Estados Unidos", new Gerente("Azucena Margarita", "Flores", "Navarro")));		
		return empleados;
	}
}
