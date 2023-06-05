package actions;

import utils.Show;
import main.*;
import entities.*;

public class CreateRevision {
	private static String idVisita;
	private static String nombre;
	private static String detalle;
	private static byte estado;
	private static String estadoStr;
	
	public static void create(){
		Show.guide("createGeneral");
		
		idVisita = Common.doIt("revisionIdVisita", false, detalle); // asociar a visita de terreno
		
		boolean exists = validateIdVisita(idVisita);
		if(!exists) {
			Show.guide("visitaNoExiste");
			return;
		}
		
		nombre = Common.doIt("createRevisionAsunto", true, 10, 50);
		detalle = Common.doIt("createRevisionDetalle", false, 1, 100);
		estadoStr = Common.doIt("createRevisionEstado", false, detalle);
		estado = (estadoStr.length() == 0 ) ? 0 : Byte.parseByte(estadoStr) ;
		
		Revision r = new Revision( idVisita,  nombre,
								  detalle, estado);
	}
	
	
	
	public static boolean validateIdVisita(String idVisita) {
		return true;
	}
}
