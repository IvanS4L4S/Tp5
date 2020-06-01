package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
/**
 * 
 * @author ivan Arnaldo Salas
 *
 */
@Component
public class Estadio {
	private String nombre;
	private LocalDate fechaFuncion;
	private String ciudad;
	private int capacidad;
	private String direccion;
	
	//*********CONSTRUCTORES*********
	public Estadio() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param nombre
	 * @param fechaFuncion
	 * @param ciudad
	 * @param capacidad
	 * @param direccion
	 */
	public Estadio(String nombre,LocalDate fechaFuncion,String ciudad,int capacidad,String direccion) {
		this.nombre=nombre;
		this.fechaFuncion=fechaFuncion;
		this.ciudad=ciudad;
		this.direccion=direccion;
	}
	
	//********GETTERS y SETTERS******
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaFuncion() {
		return fechaFuncion;
	}
	public void setFechaFuncion(LocalDate fechaFuncion) {
		this.fechaFuncion = fechaFuncion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFuncion=" + fechaFuncion + ", ciudad=" + ciudad + ", capacidad="
				+ capacidad + ", direccion=" + direccion + "]";
	}

	
	
	
}
