import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controlador_interfaz implements Initializable {
	
	public Button registrar_jugador;
	public TextField nombre_jugador;
	public TextField pass_jugador;
	
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void crearJugador(ActionEvent event){
		System.out.println("boton clicado");
		
		Administrador player=new Administrador();
		Controlador cont=new Controlador();
		
		String nombre= nombre_jugador.getText();
		String pass=pass_jugador.getText();
		
		player.crearUsuarioJugador(nombre, pass);
		cont.crearUsuarioJugador(player);
	}

}
