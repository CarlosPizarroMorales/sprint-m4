package entities;

import java.time.LocalDate;

public class Administrativo extends Usuario {
	
	private String expPrevia;
	private String area;
	
	public Administrativo() {}
	
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("\tArea de trabajo: " + area + "\n\tExperiencia: " + expPrevia);
	}
	
	public Administrativo(String nombres, String apellidos, LocalDate fechaNacimiento,
	    		String run, String expPrevia,String area) {
		super(nombres, apellidos, fechaNacimiento, run);
		this.expPrevia = expPrevia;
		this.area = area;
	}
	
	
	public String getExpPrevia() {
		return expPrevia;
	}
	
	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Administrativo [expPrevia=" + expPrevia + ", area=" + area + "]";
	}
}
