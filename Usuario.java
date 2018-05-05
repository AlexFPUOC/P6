public class Usuario {
	
	public static String nombreusuario, claveacceso, id;
	
	public Usuario() {
		//nombreusuario="";
		//claveacceso="";
	}
	
	public static void main(String[] args) {

		//Ejemplo de crear un Usuario Jugador
		Administrador player=new Administrador();
		Controlador cont=new Controlador();
		
		player.crearUsuarioJugador("nombre", "clave");
		cont.crearUsuarioJugador(player);
		
			
	}
	
	public void crearAdmin(String nombre){ //SETTER PARA ESTABLECER EL NOMBRE DEL ADMINISTRADOR
		
		nombreusuario=nombre;
		
		
	}

	public void crearClave(String clave) { //SETTER PARA ESTABLECER LA CLAVE DEL ADMINISTRADOR
		
		claveacceso=clave;
		
		
	}
	
	public static String obtener_usuario(){ //GETTER PARA OBTENER EL NOMBRE DE USUARIO
		
		return nombreusuario;
		
	}
	
	public static String obtener_clave() { //GETTER PARA OBTENER LA CLAVE DEL USUARIO
		
		return claveacceso;
		
	}
	
	public static String obtener_id() {
		return id;
	}
	
	public void setid(String ID) {
		
		id=ID;
		
	}
	
	
}