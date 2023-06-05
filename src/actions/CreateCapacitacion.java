package actions;

import java.time.LocalDate;
import java.time.LocalTime;

import utils.Validate;
import entities.Capacitacion;
import utils.Show;
import main.Main;

public class CreateCapacitacion {
	
	private static String rutCliente;
	private static String dia;
	private static LocalDate fecha;
	private static LocalTime hora;
	private static String lugar;
	private static String duracionStr;			// para controlar conversión de String vacía a Float
	private static float duracion;
	private static String cantAsistentesStr;
	private static int cantAsistentes;
	
	/*
	 * origen indica si la invocación la realiza la creación de CLiente o 
	 * el menú principal.
	 * "" -> se crea desde el menu principal
	 * != 0 -> la crea Cliente, en este caso se salta la creación y validación de rut
	 */
	public static void create() {
		Show.guide("createGeneral");
		
		rutCliente = Common.doIt("createRut", true, "rut");
		boolean isFounded = validateCliente(rutCliente);
		/*
		 * Si el rut ingresado no existe o no corresponde a un usuario de tipo
		 * Cliente, entonces se informa al usuario y se termina la ejecución. 
		 */
		if(!isFounded) {
			Show.guide("rutNoCliente");
			return;								
		}
		
		dia = Common.doIt("createCapacitacionDia", false, "dia");
		fecha = LocalDate.parse(Common.doIt("createCapacitacionFecha", true, "fecha"), Validate.FECHA_FORMAT);
		hora = LocalTime.parse(Common.doIt("createCapacitacionHora", true, "hora"), Validate.HORA_FORMAT);
		lugar = Common.doIt("createCapacitacionLugar", true, 10, 70);
		duracionStr = Common.doIt("createCapacitacionDuracion", false, "duracion");
		duracion = (duracionStr.length() == 0 ) ? 0f : Float.parseFloat(duracionStr);
		cantAsistentesStr = Common.doIt("createCapacitacionAsistentes", false, "asistentes");
		cantAsistentes = (cantAsistentesStr.length() == 0 ) ? 0 : Integer.parseInt(cantAsistentesStr);
		
	    Capacitacion c = new Capacitacion(rutCliente, dia, hora, fecha, lugar, duracion, cantAsistentes);
	    Main.listados.almacenarCapacitacion(c);
	}
	
	/*
	 * Este método se encarga de validar que el rut existe en la lista de 
	 * clientes registrados. Si no, termina la ejecución del método. 
	 */
	public static boolean validateCliente(String rutCliente) {
		return Main.listados.searchCliente(rutCliente);
	}
}


