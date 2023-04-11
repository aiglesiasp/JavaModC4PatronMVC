/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.models;

import java.sql.Date;

/**
 * @author aitor
 *
 */
public class Cliente {
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private Date fecha;
	
	private int contador=0;
	
	//CONSTRUCTOR
	@SuppressWarnings("deprecation")
	public Cliente(int id) {
		this.id = id;
		this.nombre = "";
		this.apellido = "";
		this.direccion = "";
		this.dni = 00000000;
		this.fecha = new Date(123,3,4);
	}
	
	//GETTERS y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	private int generarId() {
		contador++;
		return contador;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", dni=" + dni + ", fecha=" + fecha + "]";
	}
	
	
}
