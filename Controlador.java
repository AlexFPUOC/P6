import java.util.*;

public class Controlador {
	private Vista vista=new Vista();
	
	public Controlador() {
		
	}
	
	public void crearUsuarioJugador(Usuario jugador) {
		iDAO dao=new EjecucionSQL();
		dao.crearUsuarioJugador(jugador);
	}
	
	public void modificarUsuarioJugador(Usuario jugador) {
		iDAO dao=new EjecucionSQL();
		dao.modificarUsuarioJugador(jugador);
	}
	
	public void eliminarUsuarioJugador(Usuario jugador) {
		iDAO dao=new EjecucionSQL();
		dao.eliminarUsuarioJugador(jugador);
	}
	
	public void setlema(Jugador lema) {
		iDAO dao=new EjecucionSQL();
		dao.setlema(lema);
	}
	
	
	public void crearMicrowarrior(Jugador microwarrior) {
		iDAO dao=new EjecucionSQL();
		dao.crearMicrowarrior(microwarrior);
	}
	
	public void editMicrowarrior(Jugador microwarrior) {
		iDAO dao=new EjecucionSQL();
		dao.editMicrowarrior(microwarrior);
	}
	
	public void deleteMicrowarrior(Jugador microwarrior) {
		iDAO dao=new EjecucionSQL();
		dao.deleteMicrowarrior(microwarrior);
	}
	
	public void crearTeam(Jugador team) {
		iDAO dao=new EjecucionSQL();
		dao.crearTeam(team);
	}
	
	public void editTeam(Jugador team) {
		iDAO dao=new EjecucionSQL();
		dao.editTeam(team);
	}
	
	public void deleteTeam(Jugador team) {
		iDAO dao=new EjecucionSQL();
		dao.editTeam(team);
	}
	
	public void buscarMicrowarrior() {
		List<Microwarrior> datos=new ArrayList<Microwarrior>();
		iDAO dao=new EjecucionSQL();
		datos=dao.buscarMicrowarrior();
		vista.verMicrowarrior(datos);
	}

}
