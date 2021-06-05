/**
 * 
 */
package com.markdev.restaurantjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.markdev.restaurantjsf.dto.UsuarioDTO;

/**
 * @author marcos.hernandez
 * Clase que controla los datos ingresados en la pantalla login.xhtml
 *
 */
@ManagedBean
public class LoginController {
	
	/**
	 * Usuario ingresado en el login
	 */
	private String usuario;
	
	/**
	 * Password ingresado en el login
	 */	
	private String password;
	
	/**
	 * Bean que mantiene la informacion de la sesion del usuario
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	/**
	 * Metodo que valida los datos ingresados para entrar a la pantalla principal del proyecto
	 */
	public void ingresar() {
		if (this.getUsuario().equals("marcos.hernandez") && this.getPassword().equals("01052012Mark")) {
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.getUsuario());
				usuarioDTO.setPassword(this.getPassword());
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				
				this.reedireccionar("restaurantes.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:campoUsuario", 
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "Ups! Página no encontrada.", ""));
			}			
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:campoUsuario", 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Acceso incorrecto, usuario y/o password incorrectos.", ""));
		}
	}
	
	/**
	 * Metodo que tomo como parametro la redireccion a una pagina
	 * @param pagina
	 * @throws IOException
	 */
	private void reedireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

}
