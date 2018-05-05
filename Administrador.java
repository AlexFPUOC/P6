
public class Administrador extends Usuario{
	
		
	public void crearUsuarioJugador(String nombre, String clave) {	
			nombreusuario=nombre;
			claveacceso=clave;
	}
	
	public void modificarUsuarioJugador(String nombre, String clave) {
			nombreusuario=nombre;
			claveacceso=clave;
	}
	
	public void eliminarUsuarioJugador(String ID) {
			id=ID;
	}
}
