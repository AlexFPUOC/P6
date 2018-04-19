import java.lang.reflect.Array;

public class Jugador extends Usuario {

	private String nombrejugador, lema;
	
	public Jugador() {
		
		nombrejugador="";
		lema="";
	}
	
	public String getjugador() { //GETTER PARA OBTENER EL NOMBRE DEL JUGADOR
		
		return nombrejugador;
	}
	
	public String getlema() { //GETTER PARA OBTENER EL LEMA DEL JUGADOR
		
		return lema;
	}
	
	public void setjugador(String nombre) { //SETTER PARA ESTABLECER EL NOMBRE DEL JUGADOR
		
		nombrejugador=nombre;
	}
	
	public void setlema(String nuevo_lema) { //SETTER PARA ESTABLECER EL LEMA DEL JUGADOR
		
		lema=nuevo_lema;
	}
	
	//GESTION DE MICROWARRIORS
	
	public void crearMicrowarrior() {
		
		Microwarrior nuevo_microwarrior=new Microwarior("nombre", "raza", "medio", "habilidad", "imagen", "lema", 5, 5, 1, true);
		
	}
	
	private void editMicrowarrior(String id) {
		
		Microwarrior microwarrior=new Microwarior();
		microwarrior.setNombre();
		microwarrior.setHabesp();
		microwarrior.setImg();
		microwarrior.setLema();
	}
	
	private void deleteMicrowarrior() {
		
		// código para borrar de la BBDD?
	}
	
	//GESTION DE EQUIPOS
	
	public void crearTeam() {
		
		Team nuevo_equipo=new Team();
		nuevo_equipo.setTotalmiembros();
		nuevo_equipo.setPotcomb();
		nuevo_equipo.setOrdercombat();
		nuevo_equipo.setMiembros();
		nuevo_equipo.setEspecializado();
		
	}
	
	private void editTeam(String Id) {
		
		Team team=new Team();
		team.setOrdercombat();
		team.setMiembros();
	}
	
	private void deleteTeam(String Id) {
		
		// código para borrar de la BBDD?
	}
	
	public String listarmicrowarriors() {
		
		//CONSULTA A LA BBDD
		for (int x=0; x<arraymicrowarriors.length; x++) { // Utilizamos un bucle para mostrar todos los elementos del array que contendrá a los microwarriors
			return arraymicrowarriors[x] ;
		}
		
	}
	
	public String buscarmicrowarrior(String Id) {
		
		// CONSULTA A LA BBDD CON FILTRO Id
		Microwarrior microwarrior=new Microwarrior();
		return microwarrior.getnombre();		
	}
	
	public String listarhistorialcombates() {
		
		//CONSULTA A LA BBDD
		for (int x=0; x<arraycombates.length; x++) { //Utilizamos un bucle para ir mostrando los combates almacenados en una array
			return arraycombates[x] ;
		}
		
	}
	
	public String buscarOponente() {
		
		Microwarrior microwarrior=new Microwarrior();
		return microwarrior.getnombre();
	}
}
