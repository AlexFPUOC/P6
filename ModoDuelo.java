import java.util.Random;

/**
 * Clase que gestiona los combates individuales.
 */

/**
 * @author Alejandro Manuel Seva Arroyo
 *
 */
public class ModoDuelo {
	private Microwarrior atacante, defensor;
	private int fatacante, fdefensor, datacante, ddefensor, bonoataqueA, 
	bonodefensaA, bonoataqueD, bonodefensaD ;
	/* Constructor */
	public ModoDuelo (Microwarrior atacante, Microwarrior defensor) {
		this.atacante=atacante;
		this.defensor=defensor;
		this.fatacante=atacante.getAtaque();
		this.fdefensor=defensor.getAtaque();
		this.datacante=atacante.getDefensa();
		this.ddefensor=defensor.getDefensa();
		/*Los bonos de ataque y defensa se calculan durante el combate */
		this.bonoataqueA=0;
		this.bonodefensaA=0;
		this.bonoataqueD=0;
		this. bonodefensaD=0;
		
	}
	
	/* GET */
	public Microwarrior getAtacante() {
		return this.atacante;
	}
	public Microwarrior getDefensor() {
		return this.defensor;
	}
	public int getFatacante() {
		return this.fatacante;
	}
	public int getFdefensor() {
		return this.fdefensor;
	}
	public int getDatacante() {
		return this.datacante;
	}
	public int getDdefensor() {
		return this.ddefensor;
	}
	public int getBonoataqueA() {
		return this.bonoataqueA;
	}
	public int getBonodefensaA() {
		return this.bonodefensaA;
	}
	public int getBonoataqueD() {
		return this.bonoataqueD;
	}
	public int getBonodefensaD() {
		return this.bonodefensaD;
	}

	/* SET */
	public void setBonoataqueA(int bonoataque) {
		this.bonoataqueA=bonoataque;
	}
	public void setBonodefensaA(int bonodefensa) {
		this.bonodefensaA=bonodefensa;
	}
	public void setBonoataqueD(int bonoataque) {
		this.bonoataqueD=bonoataque;
	}
	public void setBonodefensaD(int bonodefensa) {
		this.bonodefensaD=bonodefensa;
	}
	/* METODOS PREVIOS AL COMBATE */
	private void presentarContendiente(Jugador jugador) {
		/*A modificar tras establecer como se muestra en pantalla*/
		System.out.print (this.atacante.getNombre());
		System.out.print (jugador.getLema());
		System.out.print (this.defensor.getNombre());
		System.out.print (jugador.getLema());
	}
	private String seleccionarMedio() {
		String terreno="";
		Random aleatorio = new Random(System.currentTimeMillis());
		int intAleatorio = aleatorio.nextInt(6)+1;
		switch(intAleatorio) {
		case 1: 
			terreno="agua";
			break;
		case 2: 
			terreno="desierto";
			break;
		case 3: 
			terreno="jungla";
			break;
		case 4: 
			terreno="monte";
			break;
		case 5: 
			terreno="pantano";
			break;
		case 6: 
			terreno="valle";
			break;
		}
		return terreno;
	}
	private void comprobarHabesp() {
		
	}
	private void comprobarMedio() {
		String medio=seleccionarMedio();
		if (atacante.getMedio()==medio) {
			this.bonoataqueA=this.bonoataqueA+1;
			this.bonodefensaA=this.bonodefensaA+1;
		}
		if (defensor.getMedio()==medio) {
			this.bonoataqueD=this.bonoataqueD+1;
			this.bonodefensaD=this.bonodefensaD+1;
		}
	}
}
