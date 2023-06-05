package actions;

import java.time.LocalDate;
import utils.Validate;
import entities.Administrativo;
import main.Main;

/**
 * Clase que se encarga de implementar el proceso de recibir y validar 
 * la entrada de datos asociados a la creación de instancias de la clase
 * entities.Administrativo. Cuando el ciclo de validaciones de todos los campos
 * es correcto se instancia el constructor con los campos entregados por
 * el usuario ya validados. El principio es desacoplar la lógica que se 
 * enfrenta al usuario del diseño de la clase misma, para hacerla flexible
 * a cambios. Esta (la clase entities.Administrativo) es agnóstica de la data 
 * que recibe, y "espera" que sea correcta porque solo se encarga de describir
 * la estructura de esta.
 */
public class CreateAdministrativo {					
	
	private static String nombres;						
	private static String apellidos;
	private static LocalDate fechaNacimiento;
	private static String rut;
	private static String area;
	private static String expPrevia;
	
	public static void create() {
		nombres = Common.doIt("createNombres", true, 5, 30);
		apellidos = Common.doIt("createApellidos", true, 5, 30);
		fechaNacimiento = LocalDate.parse(Common.doIt("createFechaNac", true, "fecha"), Validate.FECHA_FORMAT);
		rut = Common.doIt("createRut", true, "rut");
		area = Common.doIt("createAdminArea", true, 5, 20);
		expPrevia = Common.doIt("createAdminExpPrevia", false, 0, 100);
		
	    Administrativo a = new Administrativo(nombres, apellidos, fechaNacimiento, rut, expPrevia, area);
		Main.listados.almacenarAdministrativo(a);
	}
}
