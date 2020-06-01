package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ivan Arnaldo Salas
 *
 */
@Component
public class Equipo {
	
	private String nombre;
	@Autowired
	private Estadio estadio;
	
	//*********CONSTRUCTORES*********
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param estadio
	 */
	public Equipo( Estadio estadio) {
		this.estadio=estadio;
	}
    /**
     * @param nombre
     */
	public Equipo(String nombre) {
		this.nombre=nombre;
		
	}

	
	//********GETTERS y SETTERS******
	
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Estadio getEstadio() {
		return estadio;
	}
	/**
	 * 
	 * @param 
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio ;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	
	
}
