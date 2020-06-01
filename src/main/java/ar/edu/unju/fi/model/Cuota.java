package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author ivan Arnaldo Salas
 *
 */
@Component
public class Cuota {
    /**
     * el identificador de la cuota
     */
	private long id;
	/**
	 * la fecha del pago
	 */
	private LocalDate fechaPago;
	/**
	 * el periodode pago de la cuota
	 */
	private String periodo;
	/**
	 * el monto por cada cuota
	 */
	private double monto;
	/**
	 * estado de la cuota
	 */
	private String estado;
	/**
	 * el usuario 
	 */
	@Autowired
	private Usuario usuario;
	
	//------constructores-------
	/**
	 * 
	 * 
	 */
	public Cuota() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param usuario
	 */
	public Cuota(Usuario usuario) {
		this.usuario=usuario;
	} 
	
	/**
	 *@param id
	 *@param fechaPago
	 *@param monto
	 *@param estado 
	 */
	public Cuota(long id,LocalDate fechaPago, double monto, String estado) {
		this.id=id;
		this.fechaPago=fechaPago;
		this.monto=monto;
		this.estado=estado;
		
	}
	
	// -----GET Y SET-------
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado.toString();
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo.toString();
	}
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}

	
	
}
