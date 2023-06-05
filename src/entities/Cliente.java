package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Usuario {
	
    private String direccion;
    private String comuna;
    private String telefono;
    private int edad;
    private String afp;
    private int sistemaSalud;
    private ArrayList<Visita> visita = new ArrayList<Visita>();   
    private ArrayList<Accidente> accidente = new ArrayList<Accidente>();   
    private ArrayList<Capacitacion> capacitacion = new ArrayList<Capacitacion>(); 

    public Cliente() {}

	public Cliente(String nombres, String apellidos, LocalDate fechaNacimiento, 
			String run, String direccion,String comuna, String telefono, int edad,
			String afp, int sistemaSalud, Visita visita,
			Accidente accidente, Capacitacion capacitacion) {
                
		super(nombres, apellidos, fechaNacimiento, run);
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.edad = edad;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.visita.add(visita);						// instancia 1..N
		this.accidente.add(accidente);					// instancia o null
		this.capacitacion.add (capacitacion);			// instancia 1..N
	}

	public String obtenerNombre() {
		return "\n\tNombre completo del cliente: " + nombres + " " + apellidos;
	}
	
	public void obtenerSistemaSalud(int option) {
		switch (option) {
			case 1:
				System.out.println("\n\tEl cliente tiene Fonasa.");
				break;
			case 2:
				System.out.println("\n\tEl cliente tiene Isapres.");
				break;
			default:
				System.out.println("\n\tError en el registro del sistema de salud.");
				break;
		}
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("\tDirección: " + direccion + "\n\tComuna: " + comuna);
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public String getTelefono() {
		return telefono;
	}

	public int getEdad() {
		return edad;
	}

	public String getAfp() {
		return afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public ArrayList<Visita> getVisita() {
		return visita;
	}

	public ArrayList<Accidente> getAccidente() {
		return accidente;
	}

	public ArrayList<Capacitacion> getCapacitacion() {
		return capacitacion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public void setVisita(Visita visita) {
		this.visita.add(visita);
	}

	public void setAccidente(Accidente accidente) {
		this.accidente.add (accidente);
	}

	public void setCapacitacion(Capacitacion capacitacion) {
		this.capacitacion.add(capacitacion);
	}
}