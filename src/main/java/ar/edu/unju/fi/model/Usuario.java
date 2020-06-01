package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
/**
 * 
 * @author ivan
 *
 */
@Component
public class Usuario {

	private long id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String direccion;
	private long dni;
	private LocalDate fechaAlta;
	private String Tipo;//SOCIO,ADMIN,CONSULTOR;
	private String password;
	
	
	//*********CONSTRUCTORES*********
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param direccion
	 * @param dni
	 * @param fechaAlta
	 * @param Tipo
	 * @param password
	 */
	public Usuario(long id, String nombre,String apellido, LocalDate fechaNacimiento,String direccion, long dni
			,LocalDate fechaAlta, String Tipo, String password) {
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaNacimiento=fechaNacimiento;
		this.direccion=direccion;
		this.dni=dni;
		this.fechaAlta=fechaAlta;
		this.setTipo(Tipo);
		this.password=password;
	}
	//********GETTERS y SETTERS******
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
  //
	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", Tipo="
				+ Tipo + ", password=" + password + "]";
	}
	
	
	
}
