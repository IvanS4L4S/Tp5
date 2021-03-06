package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ivan Arnaldo Salas
 *
 */
@Component
public class Noticia {

	private LocalDate fecha;
	private String titulo;
	private String resumen;
	
	
	//*********CONSTRUCTORES*********
	public Noticia() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param fecha
	 * @param titulo
	 * @param resumen
	 */
	public Noticia(LocalDate fecha,String titulo,String resumen) {
		this.fecha=fecha;
		this.titulo=titulo;
		this.resumen=resumen;
	}
	//********GETTERS y SETTERS******
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}
	
	
	
	
}
