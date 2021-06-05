/**
 * 
 */
package com.markdev.restaurantjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author marcos.hernandez
 * 
 * Clase que se encarga de cerrar la sesion del usuario.
 *
 */
@ManagedBean
public class SessionClosedController {
	
	@PostConstruct
	public void init() {
		System.out.println("Cerrando sesion del usuario");		
	}
	
	/**
	 * Metodo encargado de cerrar la sesion del usuario,
	 */
	public void cerrarSesion() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		
		try {
			this.reedireccionar("login.xhtml");
		} catch (IOException e) {
			FacesContext.getCurrentInstance().addMessage("formLogin:campoUsuario", 
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "Ups! Página no encontrada.", ""));
		}
	}
	
	/**
	 * Metodo que toma como parametro la redireccion a una pagina
	 * @param pagina {@link String} pagina a redireccionarse
	 * @throws IOException Excepcion en caso de no entrar la pagina solicitada
	 */
	private void reedireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

}
