package entities;

import java.time.LocalDate;

public class Accidente {
	private final String idAccidente;
	private String rutCliente;
	private LocalDate fechaAccidente;
	private String horaAccidente;
	private String lugarAccidente;
	private String origenAccidente;
	private String consecuenciaAccidente;
	private static int autoIncrementalInit = 1000;
	
	public Accidente() {
		this.idAccidente = "acc-" + (++autoIncrementalInit);
	}

	public Accidente(String rutCliente, LocalDate fechaAccidente, String horaAccidente,
			String lugarAccidente, String origenAccidente, String consecuenciaAccidente) {
		this();
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.origenAccidente = origenAccidente;
		this.consecuenciaAccidente = consecuenciaAccidente;
	}

	public String getIdAccidente() {
		return idAccidente;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public LocalDate getFechaAccidente() {
		return fechaAccidente;
	}

	public String getHoraAccidente() {
		return horaAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public String getOrigenAccidente() {
		return origenAccidente;
	}

	public String getConsecuenciaAccidente() {
		return consecuenciaAccidente;
	}

	/*
	 * Se deja porque lo solicita la pauta pero no se puede
	 * controlar desde fuera de la propia clase.
	 */
//	public void setIdAccidente(String idAccidente) {
//		this.idAccidente = idAccidente;
//	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public void setFechaAccidente(LocalDate fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	public void setOrigenAccidente(String origenAccidente) {
		this.origenAccidente = origenAccidente;
	}

	public void setConsecuenciaAccidente(String consecuenciaAccidente) {
		this.consecuenciaAccidente = consecuenciaAccidente;
	}

	@Override
	public String toString() {
		return "\n\tDatos del accidente: " + idAccidente + "\n\tRut del cliente: " + rutCliente + "\n\tFecha del accidente: "
				+ fechaAccidente + "\n\tHora del accidente: " + horaAccidente + "\n\tLugar del accidente: " + lugarAccidente
				+ "\n\tOrigen del accidente: " + origenAccidente + "\n\tConsecuencia del accidente: " + consecuenciaAccidente;
	}
}

