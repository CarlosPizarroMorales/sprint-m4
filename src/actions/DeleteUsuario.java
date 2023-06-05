package actions;

import main.Main;
import utils.Show;

public class DeleteUsuario {
	
	private static String rut;
	
	public static void delete() {
		
		rut = Common.doIt("deleteUsuario", true, "rut");
		boolean isOk = Main.listados.eliminarUsuario(rut);
		if (isOk) {
			Show.guide("deleteUsuarioOk");
		} else {
			Show.guide("usuarioNoExiste");
		}
	}
}
