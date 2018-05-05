import java.util.*;
public class Vista {
	
	public void verDatos(Microwarrior microwarrior) {
		System.out.println("Tabla: "+ microwarrior);
	}
	
	public void verMicrowarrior(List<Microwarrior> microwarriors) {
		for (Microwarrior microwarrior : microwarriors) {
		System.out.println("Datos: "+ microwarrior);
	
		}
	}
}
