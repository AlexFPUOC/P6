
public class Administrador extends Usuario{
		
	public void crearUsuarioJugador(String nombre_jugador, String clave_jugador) {	
	
		Jugador jugador=new Jugador();
			
		jugador.setjugador(nombre_jugador);
		jugador.setlema(clave_jugador);
		// CODIGO PARA HACER LA CONSULTA A LA BBDD
				
	}
	
	public void modificarUsuarioJugador(String nombre_jugador, String clave_jugador) {
		
		Jugador jugador=new Jugador();
		jugador.setjugador(nombre_jugador);
		jugador.setlema(clave_jugador);
		// CODIGO PARA HACER LA CONSULTA A LA BBDD
	}
	
	public void eliminarUsuarioJugador(String nombre_jugador) {
		
		// código para borrar de la BBDD?
	}
}