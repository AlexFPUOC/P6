
public class Administrador extends Usuario{
		
	public void crearUsuarioJugador(String nombre_jugador, String clave_jugador) {	
	
		Jugador jugador=new Jugador();
			
		jugador.setjugador(nombre_jugador);
		jugador.setlema(clave_jugador);
				
	}
	
	public void modificarUsuarioJugador(String nombre_jugador, String clave_jugador) {
		
		Jugador jugador=new Jugador();
		jugador.setjugador(nombre_jugador);
		jugador.setlema(clave_jugador);
	}
	
	public void eliminarUsuarioJugador(String nombre_jugador) {
		
		// código para borrar de la BBDD?
	}
}