package utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Validate {

	private static boolean isValid;
	private static boolean isRequiredIsEmpty;
	public static final LocalDate HOY = LocalDate.now(); 
	private static final Pattern RUT_PATTERN = Pattern.compile("\\d{6,8}-[\\d|k]$", Pattern.CASE_INSENSITIVE);
	private static final Pattern TELEFONO_PATTERN = Pattern.compile("\\+56\\d{9}$");
	public static final DateTimeFormatter FECHA_FORMAT = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
	public static final DateTimeFormatter HORA_FORMAT = DateTimeFormatter.ISO_TIME;
	private static final String[] DIAS = {"lunes", "martes", "miércoles", "miercoles", "jueves", "viernes", "sábado", "sabado", "domingo"};
	
	// Cliente.rut, Cliente.telefono, Cliente.fechaNacimiento, Visita.fecha
	// Accidente.fecha, Capacitacion.fecha, Profesional.fechaIngreso,
	// Capacitacion.hora, Capacitacion.dia, Capacitacion.rutCliente, Capacitacion.duracion
	// Accidente.hora, Accidente.rutCliente, Visita.hora, Visita.rutCliente,
	// Usuario.run, Cliente.sistemaSalud, 
	public static boolean in(String field, boolean isRequired, String kind) {
		isValid = false;					// false -> field no sirve, true -> field sirve
		int fieldLen = field.length(); 
		
		/* 
		 * Validación general (No obligatorio && vacio)
		 * Si es obligatorio y está vacío, retornar de 
		 * inmediato false y no continuar ejecución. 
		 */
		isValid = utilValidateRequiredEmpty(isRequired, fieldLen);
		if(!isValid) return isValid;								// return para obligatorio vacio		
		if(isValid && fieldLen == 0) return true;					// return para noOligatorio vacio
		isValid = false;
		
		// TIPO RUT
		// LISTA: OK
		// TESTED: --
		if (kind.equals("rut")) {
			Matcher m = RUT_PATTERN.matcher(field);
			isValid = m.find();
		}
		
		// TIPO FECHA
		// LISTA: --
		// TESTED: --
		if (kind.equals("fecha")) {
			try {
				LocalDate d = LocalDate.parse(field, FECHA_FORMAT);
				isValid = !isValid;
			} catch (Exception e) {
				//isValid = isValid;
			}
		}
		
		// TIPO HORA
		// LISTA: --
		// TESTED: --
		if (kind.equals("hora")) {
			LocalTime h = LocalTime.parse(field, HORA_FORMAT);
			isValid=!isValid;
		}
		
		// TIPO TELEFONO (regex) "telefono"
		// LISTA: --
		// TESTED: --
		if(kind.equals("telefono")){
			Matcher t =TELEFONO_PATTERN.matcher(field);
			isValid= t.find();
			
		}
		// TIPO ESTADO (a mano limpia, puede ser 1, 2 o 3) "estado" 
		// LISTA: --
		// TESTED: --
		if(kind.equals("estado")){
			try{
				int i = Integer.parseInt(field);
				if( i >= 1 && i <= 3) isValid = !isValid;
			}catch(Exception e){
				// isValid = isValid;
			}
		}
		// TIPO ASISTENTES entero menor que 1000
		if(kind.equals("asistentes")){
			try{
				int i = Integer.parseInt(field);
				if( i >= 1 && i <= 1000) isValid = !isValid;
			}catch(Exception e){
				// isValid = isValid;
			}
		}
		
		// TIPO DIA (LUN-DOM utilizar constante DIAS con metodo equals() "dia"
		// LISTA: --
		// TESTED: --
		if(kind.equals("dia")){
			String fieldLower = field.toLowerCase();
			for(String d : DIAS ){
				if (fieldLower.equals(d)){
					isValid = !isValid;
					break;
				}
			}
		}
		// TIPO DURACION (HORAS ejemplo 1, 2, 1.5, 2.5, etc )  "duracion"
		// LISTA: --
		// TESTED: --
		if(kind.equals("duracion")){
			try{
				float d =Float.parseFloat(field);
				isValid = !isValid;
			}catch(Exception e ){
				//isValid = isValid;
			}
		}
		
		// TIPO SALUD (valida solo puede ser  1 o 2)    "salud"
		// LISTA: --
		// TESTED: --
		if(kind.equals("salud")){
			try{
				int s= Integer.parseInt(field);
				if(s == 1 || s == 2) isValid = !isValid;
			}catch(Exception e){
				//isValid = isValid;
			}
		}
		

		return isValid;
	}
	
	// Cliente.nombres, Cliente.apellidos, Cliente.
	public static boolean in(String field, boolean isRequired, int min, int max) {
		
		int fieldLen = field.length(); 
		
		// valida: obligatorio+vacio, noObligatorio+vacio, noObligatorio+
		isRequiredIsEmpty = utilValidateRequiredEmpty(isRequired, fieldLen);
		
		if (isRequiredIsEmpty && fieldLen != 0) {						// si validación anterior es true
			isValid = utilValidateLen(fieldLen, min, max);				// y largo mayor que 0, valida rango
		}
		
		return isValid;
	}
	
	// METODOS UTIL DE LA CLASE
	
	/*
 	 * Método utilitario que valida el ingreso en función de la obligatoriedad
 	 * de este en la instancia y si llega vacío o no. El unico caso de los 
 	 * cuatro que es necesario validar es vacio+obligatorio que retorna falso.
 	 * Todos los demás retornan verdadero. (Tabla: obligatorio -> ocupado)
	 */
	private static boolean utilValidateRequiredEmpty(boolean isRequired, int fieldLen) {
		
		if (fieldLen == 0 && isRequired) return false; 					// unico caso necesario de validar
		return true;
	}
	
	/*
	 * Util method que valida para campos obligatorios no vacios
	 * que el rango de caracteres sea el requerido por el sistema
	 */
	private static boolean utilValidateLen(int fieldLen, int min, int max) {
		if (fieldLen >= min && fieldLen <= max) {
			return true;
		}
		return false;
	}
}
