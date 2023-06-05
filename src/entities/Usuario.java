package entities;

import java.time.LocalDate;
import java.time.Period;

import interfaces.IAsesoria;
import utils.Validate;

public abstract class Usuario implements IAsesoria {

	protected String nombres;
	protected String apellidos;
	protected String run;
	protected LocalDate fechaNacimiento;
	
	public Usuario() {}
	
	/**
	 * Constructor de la super clase Usuario que tiene campos comunes 
	 * de las subclases Administrativo, Profesional, Cliente
	 * 
	 * @param run campo que registra el número 
	 * @param nombres, ambos cuando hubiera. 
	 * @param apellidos, ambos apellidos si aplica.
	 * @param fechaNacimiento 
	 */
	public Usuario(String nombres, String apellidos, LocalDate fechaNacimiento, String run) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println("\n\tRun: " + run + "\n\tNombre: " + nombres + "\n\tApellido: " + apellidos);
	}
	
	public void mostrarEdad() {
	    Period periodo = Period.between(this.fechaNacimiento, Validate.HOY);
	    System.out.printf("\n\tEdad: %s años", periodo.getYears());
	}
	
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Usuario [nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", run=" + run + "]";
	}
}
