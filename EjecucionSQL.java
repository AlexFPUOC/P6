import java.sql.*;
import java.util.*;

public class EjecucionSQL implements iDAO {
	
	public void crearUsuarioJugador(Usuario jugador) {	
		
		Statement stm=null;
		Connection con=null;
		
		String sql="INSERT INTO JUGADORES (nombre, clave) VALUES ('"+Jugador.obtener_usuario()+"', '"+Jugador.obtener_clave()+"')";
		
		try {
			con=Conexion.conectar();
			stm=con.createStatement();
			stm.execute(sql);
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error al crear el Jugador");
			e.printStackTrace();
		}
		
		
	}
	
	public void modificarUsuarioJugador(Usuario jugador) {
		
		Statement stm=null;
		Connection con=null;
		
		String sql="UPDATE JUGADORES SET nombre='"+Jugador.obtener_usuario()+"', clave='"+Jugador.obtener_clave()+"' WHERE id="+Jugador.obtener_id();
		try {
			con=Conexion.conectar();
			stm=con.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			System.out.println("Error al actualizar el jugador");
			e.printStackTrace();
		}
		
	}
	
	public void eliminarUsuarioJugador(Usuario jugador) {
		
		Statement stm=null;
		Connection con=null;
		
		String sql="DELETE FROM JUGADORES WHERE id="+Jugador.obtener_id();
		
		try {
			con=Conexion.conectar();
			stm=con.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			System.out.println("Error al eliminar el Jugador");
			e.printStackTrace();
		}
	}
	
	public void setlema(Jugador lema) {
		Statement stm=null;
		Connection con=null;
		
		String sql="UPDATE JUGADORES SET lema='"+Jugador.getlema()+"' WHERE id="+Jugador.obtener_id();
		
		try {
			con=Conexion.conectar();
			stm=con.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			System.out.println("Error al establecer el lema");
			e.printStackTrace();
		}
	}
	
	public void crearMicrowarrior(Jugador microwarrior) {
		
		Statement stm=null;
		Connection con=null;
		
		String sql="INSERT INTO MICROWARRIORS (nombre , raza, medio, habesp, img, nombreTeam, ataque, defensa, botin, combate) "
				+ "VALUES ('"+Microwarrior.getNombre()+"', '"+Microwarrior.getRaza()+"', '"+Microwarrior.getMedio()+"', '"+Microwarrior.getHabesp()+"', '"+Microwarrior.getImg()+"', '"+Microwarrior.getNombreTeam()+"', '"+Microwarrior.getAtaque()+"', '"+Microwarrior.getDefensa()+"', '"+Microwarrior.getBotin()+"', '"+Microwarrior.getCombate()+"')";
		
		try {
			con=Conexion.conectar();
			stm=con.createStatement();
			stm.execute(sql);
			
		} catch (SQLException e) {
			System.out.println("Error al crear el Microwarrior");
			e.printStackTrace();
		}
	}
	
	public void editMicrowarrior(Jugador microwarrior) {
		Statement stm=null;
		Connection con=null;
		
		String sql="UPDATE MICROWARRIORS SET nombre='"+Microwarrior.getNombre()+"', habesp='"+Microwarrior.getHabesp()+"', img='"+Microwarrior.getImg()+"' WHERE id="+Microwarrior.getId();
		
		try {
			con=Conexion.conectar();
			stm=con.createStatement();
			stm.execute(sql);
			
		} catch (SQLException e) {
			System.out.println("Error al editar el Microwarrior");
			e.printStackTrace();
		}
	}
	
	public void deleteMicrowarrior(Jugador microwarrior) {
		Statement stm=null;
		Connection con=null;
		
		String sql="DELETE FROM MICROWARRIORS WHERE id="+Microwarrior.getId();
		
		try {
			con=Conexion.conectar();
			stm=con.createStatement();
			stm.execute(sql);
			
		} catch (SQLException e) {
			System.out.println("Error al eliminar el Microwarrior");
			e.printStackTrace();
		}
		
	}
	
	public void crearTeam(Jugador team) {
		Statement stm=null;
		Connection con=null;
		
		String sql="INSERT INTO TEAMS (totalmiembros, potcomb, ordercombat, miembros, especializado) VALUES ('"+Team.getTotalmiembros()+"', '"+Team.getPotcomb()+"', '"+Team.getOrdercombat(1)+"', '"+Team.getMiembros(1)+"', '"+Team.getEspecializado()+"')";
		
		try {
			con=Conexion.conectar();
			stm=con.createStatement();
			stm.execute(sql);
			
		} catch (SQLException e) {
			System.out.println("Error al crear el equipo");
			e.printStackTrace();
		}
	}
	
	public void editTeam(Jugador team) {
		Statement stm=null;
		Connection con=null;
		
		String sql="UPDATE TEAMS SET ordercombat='"+Team.getOrdercombat(0)+"', miembros='"+Team.getMiembros(0)+"' WHERE id="+Team.getid();
		
		try {
			con=Conexion.conectar();
			stm=con.createStatement();
			stm.execute(sql);
			
		} catch (SQLException e) {
			System.out.println("Error al modificar el equipo");
			e.printStackTrace();
		}
	}
	
	public void deleteTeam(Jugador team) {
		Statement stm=null;
		Connection con=null;
		
		String sql="DELETE FROM TEAMS WHERE id="+Team.getid();
		
		try {
			con=Conexion.conectar();
			stm=con.createStatement();
			stm.execute(sql);
			
		} catch (SQLException e) {
			System.out.println("Error al eliminar el equipo");
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Microwarrior> buscarMicrowarrior(){
		
		Statement stm=null;
		Connection con=null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM MICROWARRIORS";//WHERE id="+Microwarrior.getId();
		
		List<Microwarrior> buscamicrowarrior=new ArrayList<Microwarrior>();
		
		try {
			con= Conexion.conectar();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			while(rs.next()) {
				Microwarrior c=new Microwarrior(Microwarrior.getNombre(), Microwarrior.getRaza(), Microwarrior.getMedio(), Microwarrior.getHabesp(), Microwarrior.getImg(), Microwarrior.getAtaque(), Microwarrior.getDefensa(), Microwarrior.getCombate());
				c.setNombre(rs.getString(2));
				c.setRaza(rs.getString(3));
				c.setMedio(rs.getString(4));
				c.setHabesp(rs.getString(5));
				c.setImg(rs.getString(6));
				c.setAtaque(rs.getInt(9));
				c.setDefensa(rs.getInt(10));
				c.setCombate(rs.getBoolean(17));
				buscamicrowarrior.add(c);
			}
	
		} catch (SQLException e) {
			System.out.println("Error al buscar el Microwarrior");
			e.printStackTrace();
		}
		return buscamicrowarrior;
		
	}
	
	
	
}
