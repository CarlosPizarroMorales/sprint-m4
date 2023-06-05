package actions;

import java.time.LocalDate;

import entities.Visita;
import utils.Show;
import utils.Validate;

public class CreateVisita {

	
	public static Visita create(String rutAsociado) {
		
		Show.guide("createGeneral");
        
        if(rutAsociado.length() != 0) {
        	rutCliente = rutAsociado;
        } else {
        	rutCliente = Common.doIt("createAccidenteRutCliente", true, "rut");
        }
        

		
		String rutClienteVisita = Common.doIt("createRut", true, "rut");
		LocalDate fechaVisita = LocalDate.parse(Common.doIt("createVisitaFecha", false, "fecha"), Validate.FECHA_FORMAT);
		String horaVisita = Common.doIt("createVisitaHora", false, "hora");
		String lugarVisita = Common.doIt("createVisitaLugar", true, 10, 50);
		String comentariosVisita = Common.doIt("createVisitaComentarios", false, 0, 100);
		
		Visita v = new Visita(rutClienteVisita, fechaVisita, horaVisita, lugarVisita, comentariosVisita);
		
		return v;
	}
}
