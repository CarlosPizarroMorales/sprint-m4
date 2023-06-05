package entities;

import java.util.ArrayList;

import utils.Show;

import java.time.LocalDate;

public class Contenedor {
	
	private ArrayList<Usuario> usuarios = new ArrayList<>();
	
	private ArrayList<Capacitacion> capacitaciones = new ArrayList<>();

	public Contenedor() {}
	
	public void almacenarCliente(Cliente cliente){
		usuarios.add(cliente);
	}
	
	public void almacenarProfesional(Profesional profesional){
		usuarios.add(profesional);
	}
	
	public void almacenarAdministrativo(Administrativo administrativo){
		usuarios.add(administrativo);
	}
	
	public void almacenarCapacitacion(Capacitacion capacitacion){
		capacitaciones.add(capacitacion);
	}
		
	public boolean eliminarUsuario(String rut){
		System.out.println();
		boolean valid = false;
		Usuario user = null;
		
		for(Usuario u : usuarios){
			if (u.getRun().equals(rut)) {
				user = u;
			}
		}
		
		if(user != null) {
			user.analizarUsuario();
			usuarios.remove(user);
			return true;
		} else {
			return false;
		}
	}	
	
	/*
	 * Esta función recibe una String que 
	 * representa el rut de una instancia de Cliente y
	 * devuelve true en el caso de que existe
	 * un usuario con ese rut y false en caso
	 * contrario.
	 */
	public boolean searchCliente(String rutUser) {
		boolean isFounded = false;
		boolean test = false;
		for(Usuario u: usuarios) {
			test = (u.getRun().equals(rutUser) && u.getClass().getSimpleName().equals("Cliente"));
			
			if (test) isFounded = true;
		}
		return isFounded;
	}
	
	public void listarUsuarios	(){
		for(Usuario u : usuarios){
			u.analizarUsuario(); 				
		}
	}
	
	
	
	public void listarUsuariosTipo(String category){
		int count = 0;
		
		for(Usuario u : usuarios){
			boolean valid = u.getClass().getSimpleName().equals(category); 
			
			if(valid) {
				u.analizarUsuario();
				count++;
			}
		}
		if (count == 0 ) Show.guide("usuarioNoExiste");
	}
	
	
	
	public void listarCapacitaciones(){
		for(Capacitacion c : capacitaciones){
			System.out.println(c.toString());
			// var =  c.getRutCliente()
			// loopear usuarios 
				// coincidir var.equals(usuario.getRun())
					// SI? u.analizarUsuario();
		}
	}
}
