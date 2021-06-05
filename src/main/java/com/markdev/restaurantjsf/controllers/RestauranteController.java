/**
 * 
 */
package com.markdev.restaurantjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.markdev.restaurantjsf.entity.Restaurante;
import com.markdev.restaurantjsf.services.RestauranteService;

/**
 * @author marcos.hernandez
 * 
 * Clase controller que se encarga de procesar la informacion para la pantalla restaurantes.xhtml
 *
 */
@ManagedBean
@ViewScoped
public class RestauranteController {
	
	/**
	 * Lista de los restaurantes consultados.
	 */
	private List<Restaurante> restaurantes;
	
	/**
	 * Lista de los restaurantes filtrados.
	 */
	private List<Restaurante> restaurantesFiltrados;
	/**
	 * Logica de negocio para consultar los restaurantes.
	 */
	private RestauranteService restauranteService = new RestauranteService();
	
	/**
	 * Metodo que inicializa los parametros al entrar a la pantalla restaurantes.xhtml
	 */
	@PostConstruct
	public void init() {
		this.findAll();
	}
	
	/**
	 * Metodo que realiza la consulta de todos los restaurantes.
	 */
	public void findAll() {
		this.restaurantes = this.restauranteService.findAll();
	}

	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	/**
	 * @return the restaurantesFiltrados
	 */
	public List<Restaurante> getRestaurantesFiltrados() {
		return restaurantesFiltrados;
	}

	/**
	 * @param restaurantesFiltrados the restaurantesFiltrados to set
	 */
	public void setRestaurantesFiltrados(List<Restaurante> restaurantesFiltrados) {
		this.restaurantesFiltrados = restaurantesFiltrados;
	}
	
}
