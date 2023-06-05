package actions;

import java.time.LocalDate;
import entities.Accidente;
import utils.Show;
import utils.Validate;
import main.Main;

public class CreateAccidente {
	private static String rutCliente;
	private static LocalDate fechaAccidente;
	private static String horaAccidente;
	private static String lugarAccidente;
	private static String origenAccidente;
	private static String consecuenciaAccidente;
	
	/*
	 * El parámetro rutAsociado se utiliza para asignarlo al campo rutCliente
	 * de esta clase.
	 */
	public static Accidente create(String rutAsociado) {
        Show.guide("createAccidente");
        
        rutCliente = Common.doIt("createRutCliente", true, "rut");
        fechaAccidente = LocalDate.parse(Common.doIt("createAccidenteFecha", true, "fecha"), Validate.FECHA_FORMAT);
        horaAccidente = Common.doIt("createAccidenteHora", true, "hora");
        lugarAccidente = Common.doIt("createAccidenteLugar", true, 10, 50);
        origenAccidente = Common.doIt("createAccidenteOrigen", true, 10, 50);
        consecuenciaAccidente = Common.doIt("createAccidenteConsecuencias", true, 10, 50);
        
        Accidente a = new Accidente(rutCliente, fechaAccidente, horaAccidente,
                lugarAccidente, origenAccidente, consecuenciaAccidente);
        
        return a;
    }
}

