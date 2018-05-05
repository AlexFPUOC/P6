import java.sql.*;

public class Conexion {

	public static Connection conectar() {
		
		Connection con=null;
		
		String host="localhost";
		String db="fightclub";
		String port="3306";
		String usuario="root";
		String pass="root";
		
		try {
			
			con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?user="+usuario+"&password="+pass+"&useSSL=FALSE&serverTimezone=UTC");
			if(con != null) {
				System.out.println("Conectado");
			}
			
		} catch (SQLException ex) {
			System.out.println("SQLException " + ex.getMessage());
		}
		return con;
	}

}
