import java.util.*;

public interface iDAO {
	public void crearUsuarioJugador(Usuario jugador);
	//public List<Administrador> obtener();
	public void modificarUsuarioJugador(Usuario jugador);
	public void eliminarUsuarioJugador(Usuario jugador);
	
	public void setlema(Jugador lema);
	public void crearMicrowarrior(Jugador  jugador, Microwarrior microwarrior);
	public void editMicrowarrior(Microwarrior microwarrior);
	public void deleteMicrowarrior(Jugador microwarrior);
	
	public void crearTeam(Jugador jugador, Team team);
	public void editTeam(Jugador jugador, Team team);
	public void deleteTeam(Team team);
	
	public List<Microwarrior> buscarMicrowarrior(Jugador jugador);
	
}
