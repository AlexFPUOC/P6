
public class Usuario {
	
	String nombreusuario, claveacceso;
	
	public Usuario() {
		this.nombreusuario="";
		claveacceso="";
	}
	
	public static void main(String[] args) {
		
		
		Usuario user=new Usuario();
		user.crearAdmin("nombre");
		user.crearClave("clave");
		
		//EJECUCIÓN DEL CÓDIGO...
	}
	
	public void crearAdmin(String nombre){ //SETTER PARA ESTABLECER EL NOMBRE DEL ADMINISTRADOR
		
		nombreusuario=nombre;
		
		
	}

	public void crearClave(String clave) { //SETTER PARA ESTABLECER LA CLAVE DEL ADMINISTRADOR
		
		claveacceso=clave;
		
	}
	
	public String obtener_usuario(){ //GETTER PARA OBTENER EL NOMBRE DE USUARIO
		
		return nombreusuario;
	}
	
	public String obtener_clave() { //GETTER PARA OBTENER LA CLAVE DEL USUARIO
		
		return claveacceso;
	}
	
	
}