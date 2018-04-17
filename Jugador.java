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
		
		Microwarrior nuevo_microwarrior=new Microwarior();
		nuevo_microwarrior.setNombre();
		nuevo_microwarrior.setRaza();
		nuevo_microwarrior.setMedio();
		nuevo_microwarrior.setHabesp();
		nuevo_microwarrior.setImg();
		nuevo_microwarrior.setLema();
		nuevo_microwarrior.setNombreTeam();
		nuevo_microwarrior.setAtaque();
		nuevo_microwarrior.setDefensa();
		nuevo_microwarrior.setBotin();
		nuevo_microwarrior.setId();
		nuevo_microwarrior.setEquid();
	}
	
	private void editMicrowarrior(String id) {
		
		Microwarrior microwarrior=new Microwarior();
		microwarrior.setNombre();
		microwarrior.setHabesp();
		microwarrior.setImg();
		microwarrior.setLema();
	}
	
	private void deleteMicrowarrior() {
		
		// c�digo para borrar de la BBDD?
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
		
		// c�digo para borrar de la BBDD?
	}
	
	public String listarmicrowarriors() {
		
		for (int x=0; x<arraymicrowarriors.length; x++) { // Utilizamos un bucle para mostrar todos los elementos del array que contendr� a los microwarriors
			return arraymicrowarriors[x] ;
		}
		
	}
	
	public String buscarmicrowarrior(String Id) {
		
		
		return "";		
	}
	
	public String listarhistorialcombates() {
		
		for (int x=0; x<arraycombates.length; x++) { //Utilizamos un bucle para ir mostrando los combates almacenados en una array
			return arraycombates[x] ;
		}
		
	}
	
	public String buscarOponente() {
		
		return "";
	}
}