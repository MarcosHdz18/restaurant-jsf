/**
 * 
 */
package com.markdev.restaurantjsf.entity;

/**
 * @author marcos.hernandez
 * 
 * Clase que representa entidades de gerentes.
 *
 */
public class Gerente {
	
	/**
	 * Nombre del gerente.
	 */
	private String nombre;
	/**
	 * Apellido Paterno del gerente.
	 */
	private String apellidoPaterno;
	/**
	 * Apellido Materno del gerente.
	 */
	private String apellidoMaterno;
	
	/**
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 */
	public Gerente(String nombre, String apellidoPaterno, String apellidoMaterno) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * @param apellidoMaterno the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

}
