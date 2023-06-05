/*
 * Crear un menú principal con nueve opciones: 
 * ocho para las acciones indicadas en el listado
 * una opción para salir del programa. 
 * En caso de que se ingrese una opción incorrecta, se debe pedir nuevamente. 
 * El programa solo terminará una vez que ingrese la opción de salida.
 * 1. Crear Cliente: crear Cliente -> Contenedor.usuarios
 * 2. Crear Profesional: crear Profesional -> Contenedor.usuarios
 * 3. Crear Administrativo: crear Administrativo -> Contenedor.usuarios
 * 4. Crear Capacitacion: crear Capacitacion -> Contenedor.capacitaciones 
 * 5. Eliminar Usuario: eliminar entrada de Contenedor.usuarios.usuario segun RUN
 * 6. Listar Usuarios: show Contenedor.usuarios.analizarUsuario()
 * 7. Listar Usuario x tipo: show Contenedor.usuarios.analizarUsuario() según instancia? constructor?
 * 8. Listar Capacitaciones: show Contenedor.capacitaciones 
 * 9. SALIR
 */

package main;
import utils.Show;

public abstract class Menu {

	public static void drawMenu(int a) {
		System.out.println();
		System.out.println("\t" + Show.BG_BLACK + " ".repeat(55) + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    ****** SISTEMA DE GESTION DE INFORMACIÓN ******    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *                                             *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *     [1]  CREAR CLIENTE                      *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *     [2]  CREAR PROFESIONAL                  *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *     [3]  CREAR ADMINISTRATIVO               *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *     [4]  CREAR CAPACITACIÓN                 *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *     [5]  ELIMINAR USUARIO                   *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *     [6]  LISTAR USUARIOS                    *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *     [7]  LISTAR USUARIOS POR CATEGORÍA      *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *     [8]  LISTAR CAPACITACIONES              *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *     [9]  SALIR                              *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    *                                             *    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + "    ***********************************************    " + Show.RESET);
		System.out.println("\t" + Show.BG_BLACK + " ".repeat(55) + Show.RESET);
		System.out.println(Show.RESET + "\n");
		
		Select.action();
	}
}


