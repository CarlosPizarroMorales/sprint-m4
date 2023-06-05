package interfaces;

/**
 * Las cuatro interfaces que implementa la clase abstracta Validate
 */
public interface IValidate {
	
	/**
	 * Esta es una de las dos funciones generales de validación de campos.
	 * @param field es el campo que se está validando actualmente.
	 * @param isRequired es la variable que indica la obligatoriedad del campo. (length != 0) 
	 * @param kind es un marcador de tipo de campo que sirve para realizar la 
	 * validación correspondiente. Puede ser "hora", "dia", "fecha", "rut", 
	 * "duracion", "afp" y "salud" (sistema de salud)
	 *  
	 * @return un valor booleano que indica si el valor ingresado por el 
	 * usuario el puede ser asignado al campo correspondiente. 
	 */
	boolean in(String field, boolean isRequired, String kind);
	/**
	 * Esta es una de las dos funciones generales de validación de campos.
	 * @param field es el campo que se está validando actualmente.
	 * @param isRequired es la variable que indica la obligatoriedad del campo. (length != 0) 
	 * @param min es el valor mínimo para field.length() 
	 * @param max es el valor máximo para field.length() 
	 *  
	 * @return un valor booleano que indica si el valor ingresado por el 
	 * usuario el puede ser asignado al campo correspondiente. 
	 */
	boolean in(String field, boolean isRequired, int min, int max);
	/**
	 * Esta es una función utilitaria de las dos primeras que sirve para 
	 * controlar el estado de un campo en función de si está en blanco (length == 0)
	 * y si su presencia en la creación de la instancia es obligatoria o no.  
	 * @param isRequired es la variable que indica la obligatoriedad del campo. (length != 0)
	 * @param fieldLen es el largo del campo. 
	 * @return un valor booleano que indica si el campo es obligatorio y está vacío.
	 * En este caso el retorno es false. Para los otros dos casos, obligatorio y 
	 */
	boolean utilValidateRequiredEmpty(boolean isRequired, int fieldLen);
	/**
	 * Esta es una función utilitaria de las dos primeras que sirve para
	 * controlar el estado de un campo en función de su obligatoriedad y de si
	 * está vacío o no (fieldLen != 0) 
	 *  
	 * @param fieldLen el largo del campo, se utiliza para validar si es != 0
	 * @param min el valor mínimo para el rango
	 * @param max el valor máxiimo para el rango
	 * @return un valor booleano que devuelve false en el caso de que el campo
	 * sea obligatorio y esté vacío y true en los demás casos.
	 */
	boolean utilValidateLen(int fieldLen, int min, int max);
}
