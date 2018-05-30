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


public class Controlador_microwarrior {
	public Button crearText;
	public TextField nombreText;
	public TextField razaText;
	public TextField medioText;
	public TextField habilidadText;
	public TextField imagenText;
	public TextField ataqueText;
	public TextField defensaText;
	public TextField idText;
	private TextField combateText;
	
	
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void crear_Micro(ActionEvent event){
		System.out.println("boton clicado");
		
		boolean combate;
		Jugador player=new Jugador();
		Controlador cont=new Controlador();
		
		String nombre= nombreText.getText();
		String raza=razaText.getText();
		String medio=medioText.getText();
		String habilidad=habilidadText.getText();
		String imagen=imagenText.getText();
		int ataque= Integer.parseInt(ataqueText.getText());
		int defensa= Integer.parseInt(defensaText.getText());
		int id= Integer.parseInt(idText.getText());
		String combat=combateText.getText();
		if (combat=="Sí") {
			combate=true;
		} else {
			combate=false;
		}
		
		player.crearMicrowarrior(nombre, raza, medio, habilidad, imagen, ataque, defensa, id, combate);
		cont.crearMicrowarrior(player);
	}

}
