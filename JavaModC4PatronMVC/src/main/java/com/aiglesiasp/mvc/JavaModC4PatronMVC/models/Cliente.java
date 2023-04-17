/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.models;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.network.ClienteConnector;

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
	
	public Cliente() {
		
	}
		
	//CONSTRUCTOR
	@SuppressWarnings("deprecation")
	public Cliente(String nombre, String apellido, String direccion, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = generarFechaActual();
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
	
	private Date generarFechaActual() {
		return new Date();
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", dni=" + dni + ", fecha=" + fecha + "]";
	}
	
	
}
