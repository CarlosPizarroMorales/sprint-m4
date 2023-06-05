package main;
import java.util.Scanner;

import actions.CreateAdministrativo;
import actions.CreateCapacitacion;
import actions.CreateCliente;
import actions.CreateProfesional;
import actions.DeleteUsuario;
import actions.Display;

public abstract class Select {
	
	private static boolean isValid = true; 
	private static String option;
	private static Integer optionNumber;
	private static Scanner sc = new Scanner(System.in);
	
	public static void action() {

		do {
			try {
				System.out.println("Ingrese su opcion:");
				option = sc.next();
				optionNumber = Integer.parseInt(option);		// intenta parsear token a Integer
				
				if (optionNumber >= 1 && optionNumber <= 9) {	// si éxito, valida el rango 1-9
					isValid = !isValid;							// para salir del ciclo
				} else {
					throw new UnsupportedOperationException();	// sino, arroja un Exception al catch
				}
			} catch (Exception e) {								// captura las excepciones del parseo de
				System.out.println("Opción inválida");			// Integer y de la validación de rango
			}

		} while (isValid);
		
		isValid = true;
//		sc.close(); 				// no cerrar Scanner, no se por qué // AVERIGUAR
		
		switch (optionNumber) {									// Elije la acción e invoca el método asociado
			case 1:
				CreateCliente.create();
				break;
			case 2:
				CreateProfesional.create();
				break;
			case 3:
				CreateAdministrativo.create();
				break;
			case 4:
				CreateCapacitacion.create();
				break;
			case 5:
				DeleteUsuario.delete();
				break;
			case 6:
				Display.usuarios();
				break;
			case 7:
				Display.category();
				break;
			case 8:
				Display.capacitaciones();
				break;
			case 9:
				System.out.println("Ejecución finalizada por el usuario"); 
				System.exit(0);
				break;
			default:
				// Nunca entrará acá pero se deja por buena práctica.
				System.out.println("Ups... ¡Algo muy raro ha pasado!"); 
				System.exit(0);
		}														// ends switch option
		Menu.drawMenu(0);
	}															// ends static action()
}																// ends class Select