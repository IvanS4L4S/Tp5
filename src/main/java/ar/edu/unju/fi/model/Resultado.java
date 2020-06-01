package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author ivan Arnaldo salas
 *
 */
@Component
public class Resultado {
	private LocalDate fecha;
	@Autowired
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1; 
	private int golesEquipo2;
	
	
	
	//*********CONSTRUCTORES*********
	
	public Resultado() {
		// TODO Auto-generated constructor stub
	}
	 /**
	  * 
	  * @param equipo1
	  * @param equipo2
	  */
	public Resultado(Equipo equipo1,Equipo equipo2) {
		this.equipo1=equipo1;
		this.equipo2=equipo2;
	}
	/**
	 * 
	 * @param fecha
	 * @param golesEquipo1
	 * @param golesEquipo2
	 */
	public Resultado(LocalDate fecha,int golesEquipo1,int golesEquipo2) {

		this.golesEquipo1=golesEquipo1;
		this.golesEquipo2=golesEquipo2;
	}
	
	//********GETTERS y SETTERS******
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Equipo getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	public Equipo getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	} 

	
	
}
