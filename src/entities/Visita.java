package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Visita {
	private final String idVisita;
	private static int autoIncrementalInit = 1000;
	private String horaAccidente;
    private	String lugarAccidente;
    private	String comentarios;
    private	ArrayList<Revision> revisiones = new ArrayList<>();
    private	String rutCliente;
    private	LocalDate fechaAccidente;
    
    public Visita() {
		this.idVisita = "" + (++autoIncrementalInit);
	}
    
	public Visita(String horaAccidente, String lugarAccidente, String comentarios,
			Revision revision, String rutCliente, LocalDate fechaAccidente) {
		this();
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.comentarios = comentarios;
		this.revisiones.add(revision);
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
	}
	
	public Visita(String rutCliente, LocalDate fechaAccidente, String horaAccidente, 
				String lugarAccidente, String comentarios) {
					this();
					this.rutCliente = rutCliente;
					this.fechaAccidente = fechaAccidente;
					this.horaAccidente = horaAccidente;
					this.lugarAccidente = lugarAccidente;
					this.comentarios = comentarios;
				}

	public String getIdVisita() {
		return idVisita;
	}

	public String getHoraAccidente() {
		return horaAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public String getComentarios() {
		return comentarios;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public LocalDate getFechaAccidente() {
		return fechaAccidente;
	}

// TODO revisar metodos para agregar revisiones.
//	public ArrayList<Revision> getRevisiones() {
//		return revisiones;
//	}
//
//	public void setRevisiones(Revision revisiones) {
//		this.revisiones.add(revisiones);
//	}

	/*
	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}
	*/

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public void setFechaAccidente(LocalDate fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	@Override
	public String toString() {
		return "Visita [idVisita=" + idVisita + ", horaAccidente=" + horaAccidente 
				+ ", lugarAccidente=" + lugarAccidente + ", comentarios=" 
				+ comentarios + ", rutCliente=" + rutCliente + ", fechaAccidente="
				+ fechaAccidente + "]";
	}
    
    
    
}
