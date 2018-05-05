import java.lang.reflect.Array;

public class Jugador extends Usuario {

	private static String nombrejugador, lema;
	
	public Jugador() {
		
		nombrejugador="";
		lema="";
	}
	
	public static String getjugador() { //GETTER PARA OBTENER EL NOMBRE DEL JUGADOR
		
		return nombrejugador;
	}
	
	public static String getlema() { //GETTER PARA OBTENER EL LEMA DEL JUGADOR
		
		return lema;
	}
	
	public void setjugador(String nombre) { //SETTER PARA ESTABLECER EL NOMBRE DEL JUGADOR
		
		nombrejugador=nombre;
	}
	
	public void setlema(String nuevo_lema) { //SETTER PARA ESTABLECER EL LEMA DEL JUGADOR
		
		lema=nuevo_lema;
	}
	
	//GESTION DE MICROWARRIORS
	
	public void crearMicrowarrior(String nombre, String raza, String medio, String habilidad, String imagen, int ataque, int defensa, Boolean combate) {
		
		Microwarrior nuevo_microwarrior=new Microwarrior(nombre, raza, medio, habilidad, imagen, ataque, defensa, combate);
		nuevo_microwarrior.setNombre(nombre);
		nuevo_microwarrior.setRaza(raza);
		nuevo_microwarrior.setMedio(medio);
		nuevo_microwarrior.setHabesp(habilidad);
		nuevo_microwarrior.setImg(imagen);
		nuevo_microwarrior.setAtaque(ataque);
		nuevo_microwarrior.setDefensa(defensa);
		nuevo_microwarrior.setCombate(combate);	
		
	}
	
	public void editMicrowarrior(int id, String nombre, String habilidad, String imagen) {
		
		Microwarrior microwarrior=new Microwarrior(nombre, Microwarrior.getRaza(), Microwarrior.getMedio(), habilidad, imagen, Microwarrior.getAtaque(), Microwarrior.getDefensa(), Microwarrior.getCombate());
		microwarrior.setId(id);
		microwarrior.setNombre(nombre);
		microwarrior.setHabesp(habilidad);
		microwarrior.setImg(imagen);
		
	}
	
	public void deleteMicrowarrior(int id) {
		
		Microwarrior microwarrior=new Microwarrior(Microwarrior.getNombre(), Microwarrior.getRaza(), Microwarrior.getMedio(), Microwarrior.getHabesp(), Microwarrior.getImg(), Microwarrior.getAtaque(), Microwarrior.getDefensa(), Microwarrior.getCombate());
		microwarrior.setId(id);
	}
	
	//GESTION DE EQUIPOS
	
	public void crearTeam(int totalmiembros, int potcomb, Microwarrior ordercombat[], Microwarrior miembros[], boolean especializado) {
		
		Team nuevo_equipo=new Team(totalmiembros, potcomb, ordercombat, miembros, especializado );
		nuevo_equipo.setTotalmiembros(totalmiembros);
		nuevo_equipo.setPotcomb(potcomb);
		nuevo_equipo.setOrdercombat(1, ordercombat);
		nuevo_equipo.setMiembros(1, miembros);
		nuevo_equipo.setEspecializado(especializado);
		
	}
	
	public void editTeam(int Id) {
		
		Team equipo=new Team(Team.getTotalmiembros(), Team.getPotcomb(), Team.getOrdercombat(0), Team.getMiembros(0), Team.getEspecializado());
		equipo.setid(Id);
		equipo.setMiembros(0, nmiembros);
		
	}
	
	public void deleteTeam(int Id) {
		
		Team equipo=new Team(Team.getTotalmiembros(), Team.getPotcomb(), Team.getOrdercombat(0), Team.getMiembros(0), Team.getEspecializado());
		equipo.setid(Id);
	}
	
	public String listarmicrowarriors() {
		
		//CONSULTA A LA BBDD
		for (int x=0; x<arraymicrowarriors.length; x++) { // Utilizamos un bucle para mostrar todos los elementos del array que contendrá a los microwarriors
			return arraymicrowarriors[x] ;
		}
		
	}
	
	public void buscarmicrowarrior(int Id) {
		
		Microwarrior microwarrior=new Microwarrior(Microwarrior.getNombre(), Microwarrior.getRaza(), Microwarrior.getMedio(), Microwarrior.getHabesp(), Microwarrior.getImg(), Microwarrior.getAtaque(), Microwarrior.getDefensa(), Microwarrior.getCombate());
		microwarrior.setId(Id);	
	}
	
	public String listarhistorialcombates() {
		
		//CONSULTA A LA BBDD
		for (int x=0; x<arraycombates.length; x++) { //Utilizamos un bucle para ir mostrando los combates almacenados en una array
			return arraycombates[x] ;
		}
		
	}
	
	public String buscarOponente() {
		
		Microwarrior microwarrior=new Microwarrior(Microwarrior.getNombre(), Microwarrior.getRaza(), Microwarrior.getMedio(), Microwarrior.getHabesp(), Microwarrior.getImg(), Microwarrior.getAtaque(), Microwarrior.getDefensa(), Microwarrior.getCombate());
		return microwarrior.getnombre();
	}
}
