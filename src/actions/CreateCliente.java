/*
 * Clase que se encarga de implementar el proceso de recibir y validar 
 * la entrada de datos asociados a la creación de instancias de la clase
 * entities.Cliente. Cuando el ciclo de validaciones de todos los campos
 * es correcto se instancia el constructor con los campos entregados por
 * el usuario ya validados. El principio es desacoplar la lógica que se 
 * enfrenta al usuario del diseño de la clase misma, para hacerla flexible
 * a cambios. Esta (la clase entities.Cliente) es agnóstica de la data 
 * que recibe, y espera que sea correcta porque solo se encarga de describir
 * la estructura de esta.
 */

package actions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Cliente;
import entities.Contenedor;
import entities.Accidente;
import entities.Visita;
import main.Main;
import entities.Revision;
import entities.Capacitacion;
import utils.Show;
import utils.Validate;

public class CreateCliente {
	
	/*
	 * Campos necesarios para validar data de entrada 
	 * para crear instancias de entities.Cliente
	 */
	private static String nombres;
	private static String apellidos;
	private static LocalDate fechaNac;
	private static String run;
	private static String telefono;
	private static String afp;
	private static String saludStr;					// intermedia para parsear sistSalud
	private static int sistSalud;
	private static String direccion;
	private static String comuna;
	private static String edadStr; 					// intermedia para parsear edad
	private static int edad;
	private static Scanner scAc = new Scanner(System.in);
	private static String respuesta;
	private static Accidente acc;
	private static Visita vis;
	private static Revision rev;
	
	public static void create() {
		Show.guide("createGeneral");
		
		run = Common.doIt("createRut", true, "run");		
		/*
		 * Si el rut ingresado no existe o no corresponde a un usuario de tipo
		 * Cliente, entonces se informa al usuario y se termina la ejecución. 
		 */
		boolean isFounded = validateCliente(run);
		if(isFounded) {
			Show.guide("clienteYaExiste");
			return;								
		}
		isFounded = false;
		
		nombres = Common.doIt("createNombres", true, 5, 30);
		apellidos = Common.doIt("createApellidos", true, 5, 30);
		fechaNac = LocalDate.parse(Common.doIt("createFechaNac", true, "fecha"), Validate.FECHA_FORMAT);
		telefono = Common.doIt("createClienteTelefono", false, "telefono");
		afp = Common.doIt("createClienteAfp", false, 4, 30);
		saludStr =  Common.doIt("createClienteSalud", false, "salud");
		sistSalud = (saludStr.length() != 0) ? Integer.parseInt(saludStr) : 0; 
		direccion = Common.doIt("createClienteDireccion",false, 0, 70);
		comuna = Common.doIt("createClienteComuna", false, 0, 50);
		edad = Integer.parseInt(Common.doIt("createClienteEdad", true, "edad"));
		
		// Creación de accidente
		Show.guide("clienteCreateAccidente"); // Pregunta si quiere agregar accidente
		
		String r = "n";
		do {
			try {
				respuesta = scAc.next();
				r = respuesta.toLowerCase();
				if (r.equals("s")) {
					System.out.println("...Entrando en la creación de Accidente\n");
					acc = CreateAccidente.create(run);
				} else if (r.equals("n")){
					break; 
				} else {
					throw new UnsupportedOperationException();
				}
			} catch (Exception e) {								// captura las excepciones del parseo de
				System.out.println("Opción inválida");			// Integer y de la validación de rango
			}

		} while (!r.equals("s") && r.equals("n"));
	
		Show.guide("clienteCreateVisita");
		vis = CreateVisita.create(run);
//		
//        Accidente a = new Accidente();
//		// Lógica de creacion de capacitacion
		//CreateCapacitacion capacitacion;
		rutCliente = Common.doIt("createRut", true, "rut");
		isFounded = validateCliente(rutCliente);
		/*
		 * Si el rut ingresado no existe o no corresponde a un usuario de tipo
		 * Cliente, entonces se informa al usuario y se termina la ejecución. 
		 */
		if(!isFounded) {
			Show.guide("rutNoCliente");
			return;								
		}
		
		String dia = Common.doIt("createCapacitacionDia", false, "dia");
		LocalDate fecha = LocalDate.parse(Common.doIt("createCapacitacionFecha", true, "fecha"), Validate.FECHA_FORMAT);
		LocalTime hora = LocalTime.parse(Common.doIt("createCapacitacionHora", true, "hora"), Validate.HORA_FORMAT);
		String lugar = Common.doIt("createCapacitacionLugar", true, 10, 70);
		String duracionStr = Common.doIt("createCapacitacionDuracion", false, "duracion");
		float duracion = (duracionStr.length() == 0 ) ? 0f : Float.parseFloat(duracionStr);
		String cantAsistentesStr = Common.doIt("createCapacitacionAsistentes", false, "asistentes");
		int cantAsistentes = (cantAsistentesStr.length() == 0 ) ? 0 : Integer.parseInt(cantAsistentesStr);
		
	    Capacitacion capacitacion = new Capacitacion(rutCliente, dia, hora, fecha, lugar, duracion, cantAsistentes);
		
		
		// Lógica de creación de visita
		Show.guide("createVisitaRutCliente");
		String rutClienteVisita = Common.doIt("createRut", true, "rut");
		LocalDate fechaVisita = LocalDate.parse(Common.doIt("createVisitaFecha", false, "fecha"), Validate.FECHA_FORMAT);
		String horaVisita = Common.doIt("createVisitaHora", false, "hora");
		String lugarVisita = Common.doIt("createVisitaLugar", true, 10, 50);
		String comentariosVisita = Common.doIt("createVisitaComentarios", false, 0, 100);
		Visita visita = new Visita(rutClienteVisita, fechaVisita, horaVisita, lugarVisita, comentariosVisita);
		
		
		// Lógica de creación de revisión
        String idVisita = Common.doIt("createRevisionIdVisita", true, "vis-0000");
        String asuntoRevision = Common.doIt("createRevisionAsunto", true, 10, 50);
        String detalleRevision = Common.doIt("createRevisionDetalle", false, 1, 100);
        byte estadoRevision = Byte.parseByte(Common.doIt("createRevisionEstado", false, "estado"));

        //Revision revision = new Revision(idVisita, asuntoRevision, detalleRevision, estadoRevision);
		
		Cliente cliente = new Cliente(nombres, apellidos, fechaNac, run, direccion, comuna, telefono, edad, afp, sistSalud, visita, accidente, capacitacion);
		Main.listados.almacenarCliente(cliente);
	}
	
	public static boolean validateCliente(String rutCliente) {
		return Main.listados.searchCliente(rutCliente);
	}
}
