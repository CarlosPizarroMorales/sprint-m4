package entities;

import java.time.LocalDate;
import java.time.LocalTime;

import utils.Validate;

public class Capacitacion {
	private final String idCapacitacion;
	private String rutCliente;
	private String dia;
	private LocalDate fecha;
	private LocalTime hora;
	private String lugar;
	private float duracion;
	private int cantAsistentes;
	private static int autoIncrementalInit = 1000;			// utilitario, no es campo
	
	public Capacitacion() {
		this.idCapacitacion = "id-" + (++autoIncrementalInit);
	}

	public Capacitacion(String rutCliente, String dia, LocalTime hora, LocalDate fecha,
						String lugar, float duracion, int cantAsistentes) {
		this();
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.fecha = fecha;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
	}
	
	public String getIdCapacitacion() {
		return idCapacitacion;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public LocalTime getHora() {
		return hora;
	}

	public String getLugar() {
		return lugar;
	}

	public float getDuracion() {
		return duracion;
	}

	public int getCantAsistentes() {
		return cantAsistentes;
	}

	/*
	 * Se deja testimonialmente pero por lógica de negocio no
	 * tiene setter, pues se controla internamente que sea un
	 * campos autoincremental. Usuario NO debe intervernir este campo.
	 */
//	public void setIdCapacitacion(int idCapacitacion) {
//		this.idCapacitacion = idCapacitacion;
//	}

	/*
	 * Quisiéramos setear realmente el Rut asociado a una capacitación?
	 */
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}

	@Override
	public String toString() {
		return "\n\tID Capacitacion: " + idCapacitacion + "\n\tRut Cliente: " 
				+ rutCliente + "\n\tDia: " + dia + " \n\tHora: " + hora + " \n\tFecha: " 
				+ fecha.format(Validate.FECHA_FORMAT) + "\n\tLugar: " + lugar + 
				"\n\tDuracion: " + duracion 
				+ " \n\tCantidad de Asistentes: " + cantAsistentes ;
	}
	
	public void mostrarDetalle() {
		System.out.println("\tLa capacitacion sera en " + lugar + " a las " + hora 
					+ " del dia " + dia + ", y durara " + duracion*60 + " minutos.");
	}
}