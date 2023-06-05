package entities;

public class Revision {
	
	private final String idRevision;
	private String idVisita;
	private String nombreRevision;
	private String detalle;
	private byte estado;
	private static int autoIncrementalInit = 1000;
	
	public Revision() {
		this.idRevision = "rev-" + (++autoIncrementalInit);
	}

	public Revision(String idVisita, String nombreRevision, String detalle, byte estado) {
		this();
		this.idVisita = idVisita;
		this.nombreRevision = nombreRevision;
		this.detalle = detalle;
		this.estado = estado;
	}

	public String getIdRevision() {
		return idRevision;
	}

	public String getIdVisita() {
		return idVisita;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public String getDetalle() {
		return detalle;
	}

	public byte getEstado() {
		return estado;
	}
	/* Se deja testimonialmente pero por la logica de negocio no
	 * tiene setter, pues se controla internamente que sea un
	 * campos autoincremental. Usuario NO debe intervernir este campo.
	 */
//		public void setIdRevision(String idRevision) {
//		this.idRevision = idRevision;
//	}

	public void setIdVisita(String idVisita) {
		this.idVisita = idVisita;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombreRevision=" + nombreRevision
				+ ", detalle=" + detalle + ", estado=" + estado + "]";
	}
}
