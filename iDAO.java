import java.util.*;

public interface iDAO {
	public void crearUsuarioJugador(Usuario jugador);
	//public List<Administrador> obtener();
	public void modificarUsuarioJugador(Usuario jugador);
	public void eliminarUsuarioJugador(Usuario jugador);
	
	public void setlema(Jugador lema);
	public void crearMicrowarrior(Jugador microwarrior);
	public void editMicrowarrior(Jugador microwarrior);
	public void deleteMicrowarrior(Jugador microwarrior);
	
	public void crearTeam(Jugador team);
	public void editTeam(Jugador team);
	public void deleteTeam(Jugador team);
	
	public List<Microwarrior> buscarMicrowarrior();
	
}
