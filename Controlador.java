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
	
	
	public void crearMicrowarrior(Jugador jugador, Microwarrior microwarrior) {
		iDAO dao=new EjecucionSQL();
		dao.crearMicrowarrior(jugador, microwarrior);
	}
	
	public void editMicrowarrior(Microwarrior microwarrior) {
		iDAO dao=new EjecucionSQL();
		dao.editMicrowarrior(microwarrior);
	}
	
	public void deleteMicrowarrior(Jugador microwarrior) {
		iDAO dao=new EjecucionSQL();
		dao.deleteMicrowarrior(microwarrior);
	}
	
	public void crearTeam(Jugador jugador, Team team) {
		iDAO dao=new EjecucionSQL();
		dao.crearTeam(jugador, team);
	}
	
	public void editTeam(Jugador jugador, Team team) {
		iDAO dao=new EjecucionSQL();
		dao.editTeam(jugador, team);
	}
	
	public void deleteTeam(Team team) {
		iDAO dao=new EjecucionSQL();
		dao.deleteTeam(team);
	}
	
	public void buscarMicrowarrior(Jugador jugador) {
		List<Microwarrior> datos=new ArrayList<Microwarrior>();
		iDAO dao=new EjecucionSQL();
		datos=dao.buscarMicrowarrior(jugador);
		vista.verMicrowarrior(datos);
	}

}
