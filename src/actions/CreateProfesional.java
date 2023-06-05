package actions;

import java.time.LocalDate;
import entities.Profesional;
import utils.Show;
import utils.Validate;
import main.Main;

/**
 * Clase que se encarga de implementar el proceso de recibir y validar 
 * la entrada de datos asociados a la creación de instancias de la clase
 * entities.Profesional. Cuando el ciclo de validaciones de todos los campos
 * es correcto se instancia el constructor con los campos entregados por
 * el usuario ya validados. El principio es desacoplar la lógica que se 
 * enfrenta al usuario del diseño de la clase misma, para hacerla flexible
 * a cambios. Esta (la clase entities.Profesional) es agnóstica de la data 
 * que recibe, y "espera" que sea correcta porque solo se encarga de describir
 * la estructura de esta.
 */
public class CreateProfesional {

	private static String nombres;						
	private static String apellidos;
	private static LocalDate fechaNacimiento;
	private static String rut;
	private static String fecIngStr;					// intermedia para fechaIngreso
	private static LocalDate fechaIngreso;
	private static String titulo;
	
	/*
	 * Clase terminada y revisada.
	 * TODO probar con instancias.
	 * TODO revisar mensajes para orientar al usuario
	 */
	public static void create() {
		Show.guide("createGeneral");
		
		nombres = Common.doIt("createNombres", true, 5, 30);
		apellidos = Common.doIt("createApellidos", true, 5, 30);
		fechaNacimiento = LocalDate.parse(Common.doIt("createFechaNac", true, "fecha"), Validate.FECHA_FORMAT);		
		rut = Common.doIt("createRut", true, "rut");
		
		/*
		 * se utiliza una variable intermedia de tipo String para los casos de 
		 * conversiones de tipo donde una String vacía generará una excepción en
		 * el momento de la conversión al tipo requerido por la instancia. Esto
		 * puede suceder con casos de hora, fecha o números en aquellos campos 
		 * que no son obligatorios. Para esos casos se consulta el largo de la 
		 * String devuelta y se asigna un valor null o 0 al campo no obligatorio
		 * cumpliendo con la lógica de negocio.  
		 */
		fecIngStr = Common.doIt("createIngreso", false, "fecha");
		fechaIngreso = (fecIngStr.length() != 0) ? LocalDate.parse(fecIngStr, Validate.FECHA_FORMAT) : null;
		titulo = Common.doIt("createTitulo", true, 10, 50);
		
		Profesional p = new Profesional(nombres, apellidos, fechaNacimiento, rut, titulo, fechaIngreso);
		Main.listados.almacenarProfesional(p);
	}
}