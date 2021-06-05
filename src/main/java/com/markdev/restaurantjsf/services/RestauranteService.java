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
		List<Restaurante> empleados = Arrays.asList(new Restaurante("McDonalds", "Dirección 1", "México", new Gerente("Marcos Salvador", "Hernández", "Guadarrama")),
				new Restaurante("Xotepingo", "Dirección 2", "México", new Gerente("Luis Felipe", "Hernández", "Guadarrama")),
				new Restaurante("Las Brasas", "Dirección 3", "España", new Gerente("Luis Gemila", "Hernández", "Guadarrama")),
				new Restaurante("Laas Lasagna", "Dirección 4", "Italia", new Gerente("Diego", "Paniagua", "López")),
				new Restaurante("Burguers Boy", "Dirección 5", "Estados Unidos", new Gerente("Azucena Margarita", "Flores", "Navarro")),
				new Restaurante("Pasta Italiana", "Dirección 6", "Italia", new Gerente("Susana", "Costa", "Sánchez")),
				new Restaurante("Italianis", "Dirección 7", "Estados Unidos", new Gerente("Rick", "Hawkings", "Scott")),
				new Restaurante("Pizza Hot", "Dirección 8", "México", new Gerente("Carlos", "Martínez", "López")),
				new Restaurante("Pizza Dominos", "Dirección 9", "Estados Unidos", new Gerente("Scott", "Pilgrim", "Bratt")),
				new Restaurante("Hamburguers Pitta", "Dirección 10", "Estados Unidos", new Gerente("Henry", "Gover", "Stan")));		
		return empleados;
	}
}
