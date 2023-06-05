// TODO: implementar sobrecargas en Valida.in()
// TODO: implementar procesos de creación actions.*
// TODO: interfaces.Asesoria
// TODO: implementar métodos custom en entities ?
// TODO: implementar Contenedor y métodos ?
// TODO: crear README.md
// TODO: revisar y comentar código.
/*
 * Balance Cohesion/Acoplamiento: Yeah!
 * 
 * [S]inle Responsibility: Yup!
 * [O]pen/Closed: Yup!
 * [L]iskov Substitution: Mmm. Don't know...
 * [I]interface Seggregation: Not applicable (Una sola interfaz)
 * [D]ependency Inversion: Yep! Uso de IAsesoria
 * 
 * KISS: yep. (Creemos)
 * Least Surprise Principle: Sipi.
 */

// System.out.print("\033[H\033[2J"); 					// limpiar terminal

package main;

import entities.*;
import utils.InstanciasTest;

/**
 * @author Etzel Mencias
 * @author Mangel Tort
 * @author Diego Paredes
 * @author Ricardo Silva
 * @author Carlos Pizarro
 * @author Sanson que aunque no trabajó directamente en el proyecto sirvió de inspiración. (aka Ricardo Gallegos)
 *
 * @version 1.0
 */
public class Main {

//	private static int exit;
	
	public static Contenedor listados = new Contenedor();		// Crea objeto que almacena instancias
	
	public static void main(String[] args) {
		InstanciasTest.cargarData();
		
		Menu.drawMenu(0);										// pinta Menu
	}
}