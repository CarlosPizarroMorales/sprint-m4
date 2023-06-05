package actions;

import java.time.LocalDate;
import java.util.Scanner;

import utils.Show;
import utils.Validate;

/**
 * <p>Clase que contiene el método principal encargado de
 * la orquestación de eventos destinados a la creación 
 * de todas las instancias del proyecto. Es utilizado por
 * <ul>
 * <li>CreateCliente.java</li>
 * <li>CreateProfesional.java</li>
 * <li>CreateAdministrativo.java</li>
 * <li>CreateCapacitacion.java</li>
 *</ul>
 *</p>  
 */
public abstract class Common {
	
	private static Scanner sc = new Scanner(System.in);
	private static boolean isValid;							// flag validador
	private static String field;

	/**
	 * Método base que encargado de realizar la recepción
	 * de la entrada de usuario a través de un objeto de
	 * tipo Scanner. Esta se encarga de orquestar la 
	 * invocación de los métodos necesarios para validar 
	 * el campo que se está ingresando. 
	 * 
	 * Utilizado por todas las clases Create[Class] del
	 * package actions que a su vez son invocadas por el
	 * método Select.action() y también la clase DeleteUsuario
	 * 
	 * Se sobrecarga para respetar las firmas de validación
	 * de los distintos tipos de campos.
	 */
	public static String doIt(String fieldGuideMsg, boolean isRequired, int min, int max) {
		
		Show.guide(fieldGuideMsg);
		do {
			Show.style("bgBlue");
			field = sc.nextLine().trim();						// recibo la entrada de usuario
			Show.style("reset");
			isValid = Validate.in(field, isRequired, min, max);	// envío la entrada a validar según tipo (no se transforma nada, solo valida)
			if(!isValid) Show.guide("createWrongField");		// si la validación es mala, envía mensaje de error y vuelve al loop
		} while (!isValid);										// si la validación es buena, se termina el ciclo y retorna la misma String
		
		isValid = !isValid;	
		return field;
	}
		
	public static String doIt(String fieldGuideMsg, boolean isRequired, String kind) {
		
		Show.guide(fieldGuideMsg);
		do {
			Show.style("bgBlue");
			field = sc.nextLine().trim();
			Show.style("reset");
			isValid = Validate.in(field, isRequired, kind);
			if(!isValid) Show.guide("createWrongField");
		} while (!isValid);
		
		isValid = !isValid;	
		
		return field;
	}
}
