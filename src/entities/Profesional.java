package entities;

import java.time.LocalDate;

import utils.Validate;

public class Profesional extends Usuario {
	
	private String titulo;
	private LocalDate fechaIngreso;
	
	public Profesional() {}
	
	public Profesional(String nombres, String apellidos, LocalDate fechaNacimiento,
					   String run, String titulo, LocalDate fechaIngreso) {
		super(nombres, apellidos, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("\tTitulo: " + titulo + "\n\tFecha de ingreso: " + fechaIngreso.format(Validate.FECHA_FORMAT));
		
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	@Override
	public String toString() {
		return "Profesional [run=" + run + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", titulo=" + titulo + ", fechaIngreso=" + fechaIngreso.format(Validate.FECHA_FORMAT) + "]";
	}
}
