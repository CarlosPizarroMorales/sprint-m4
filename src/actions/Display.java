package actions;

import java.util.Scanner;

import main.Main;
import utils.Show;

public class Display {

	
	// campos si necesario
	private static Scanner scan = new Scanner(System.in);
	private static boolean isValid;
	
	/*
	 * Metodo intermedio que llama al método
	 * Contenedor.listarUsuarios() para mostrar
	 * un listado de todos los usuarios.
	 */
	public static void usuarios() {
		Main.listados.listarUsuarios();
	}
	
	/*
	 * Método que permite elegir una categoría
	 * de usuarios y listar solo aquellos que 
	 * corresponden con la categoría.
	 */
	public static void category() {
		System.out.print("\033[H\033[2J"); 					// limpiar terminal

		Show.guide("selectCategory");
		String tipo = selectOption(); 
		
		Main.listados.listarUsuariosTipo(tipo);
	}
	
	/*
	 * Método que muestra todas las capacitaciones,
	 * utilizando el toString()
	 */
	// TODO el listado además debe retornar 
	public static void capacitaciones() {
		Main.listados.listarCapacitaciones();
	}
	
	/*
	 * Método que 
	 */
	private static String selectOption() {
		String option = "";
		int optionNumber = 0;
		
		do {
			try {
				option = scan.next();							// recibe un token de tipo String
				optionNumber = Integer.parseInt(option);		// intenta parsear token a Integer
				
				if (optionNumber >= 1 && optionNumber <= 3) {	// si éxito, valida el rango 1-3
					isValid = !isValid;							// para salir del ciclo
				} else {
					throw new UnsupportedOperationException();	// sino, arroja un Exception al catch
				}
			} catch (Exception e) {								// captura las excepciones del parseo de
				System.out.println("Opción inválida");			// Integer y de la validación de rango
			}

		} while (!isValid);
		isValid = !isValid;
//		sc.close();
		
		return optionNumber == 1 ? "Cliente" 
			 : optionNumber == 2 ? "Profesional" : "Administrativo"; 
	}
}
