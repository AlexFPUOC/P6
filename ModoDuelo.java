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
	private boolean ventajaA, ventajaD;
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
		/*Significar si uno de los contendientes tiene velocidad extrema*/
		this.ventajaA=false;
		this.ventajaD=false;
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
	private void presentarContendiente(Jugador jugador, Jugador jugador2) {
		/*A modificar tras establecer como se muestra en pantalla*/
		System.out.print (this.atacante.getNombre());
		System.out.print (jugador.getlema());
		System.out.print (this.defensor.getNombre());
		System.out.print (jugador2.getlema());
	}
	private void presentarContendiente (Jugador jugador, Jugador jugador2, String nombre1, String nombre2) {
		System.out.print(nombre1);
		System.out.print(jugador.getlema());
		System.out.print(nombre2);
		System.out.print(jugador2.getlema());
	}
	public String seleccionarMedio() {
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
	private void comprobarMedio(String lugarlucha) {
		String medio=lugarlucha;
		if (atacante.getMedio()==medio) {
			this.bonoataqueA=this.bonoataqueA+1;
			this.bonodefensaA=this.bonodefensaA+1;
		}
		if (defensor.getMedio()==medio) {
			this.bonoataqueD=this.bonoataqueD+1;
			this.bonodefensaD=this.bonodefensaD+1;
		}
	}
	private void comprobarHabesp() {
		String habilidad;
		habilidad=this.atacante.getHabesp();
		if (habilidad=="velocidad extrema") {
			this.ventajaA=true;
		}
		if (habilidad=="ataque de fuerza concentrada") {
			Random aleatorio = new Random(System.currentTimeMillis());
			int intAleatorio = aleatorio.nextInt(3)+1;
			this.bonoataqueA=this.bonoataqueA + intAleatorio;
		}
		habilidad=this.defensor.getHabesp();
		if (habilidad=="velocidad extrema") {
			this.ventajaD=true;
		}
		if (habilidad=="ataque de fuerza concentrada") {
			Random aleatorio = new Random(System.currentTimeMillis());
			int intAleatorio = aleatorio.nextInt(3)+1;
			this.bonodefensaD=this.bonoataqueD + intAleatorio;
		}
	}
	/* Sobrecargamos para tratar la habilidad ataque f. conc. en TemBattle */
	private void comprobarHabesp(ModoTeamBattle batalla) {
		boolean control;
		String habilidad;
		habilidad=this.atacante.getHabesp();
		if (habilidad=="velocidad extrema") {
			this.ventajaA=true;
		}
		if (habilidad=="ataque de fuerza concentrada") {
			control=batalla.getFactivA();
			/*Si es true es que ya se ha utilizado y entonces da -1 a la defensa*/
			if (control) {
				this.bonodefensaA=this.bonodefensaA-1;
				batalla.setFactivA(false);
			} else {
				/*Si false de 1 a 3 al ataque */
				Random aleatorio = new Random(System.currentTimeMillis());
				int intAleatorio = aleatorio.nextInt(3)+1;
				this.bonoataqueA=this.bonoataqueA + intAleatorio;
				batalla.setFactivA(true);
			}
		}
		habilidad=this.defensor.getHabesp();
		if (habilidad=="velocidad extrema") {
			this.ventajaD=true;
		}
		if (habilidad=="ataque de fuerza concentrada") {
			control=batalla.getFactivD();
			if (control) {
				this.bonodefensaD=this.bonodefensaD-1;
				batalla.setFactivD(false);
			} else {
				Random aleatorio = new Random(System.currentTimeMillis());
				int intAleatorio = aleatorio.nextInt(3)+1;
				this.bonodefensaD=this.bonoataqueD + intAleatorio;
				batalla.setFactivD(true);
			}
		}
	}
	private void comprobarBotin(Microwarrior vencedor) {
		Random aleatorio = new Random(System.currentTimeMillis());
		int intAleatorio = aleatorio.nextInt(100)+1;
		int botin=vencedor.getBotin();
		if (botin>=intAleatorio) {
			vencedor.setBotin(3);
			/* FALTA IMPLEMENTAR ganarEquipo en clase Jugador */
		} else {
			if (botin<96) {
				botin=botin+3;
			}
			vencedor.setBotin(botin);
		}
	}
	public int combate(Jugador jugador1,Jugador jugador2) {
		presentarContendiente(jugador1,jugador2);
		/* 1 ganador atacante, 2 ganador defensor, 0 empate */
		int resultado=0;
		comprobarMedio();
		comprobarHabesp();
		int fuerzaA=this.fatacante + this.bonoataqueA;
		int fuerzaD=this.fdefensor + this.bonoataqueD;
		int defenA=this.datacante + this.bonodefensaA;
		int defenD=this.ddefensor + this.bonodefensaD;
		if ((fuerzaA>=defenD) && (this.ventajaA) && !(this.ventajaD)) {
			resultado=1;
		}
		if ((fuerzaD>=defenA)&& (this.ventajaD)&& !(this.ventajaA)) {
			resultado=2;
		}
		if ((fuerzaA>=defenD)&& (this.ventajaA) && (this.ventajaD) && (fuerzaD>=defenA)) {
			resultado=0;
		}
		if ((fuerzaA>=defenD)&& (this.ventajaA) && (this.ventajaD) && (fuerzaD<defenA)) {
			resultado=1;
		}
		if ((fuerzaA<defenD)&& (this.ventajaA) && (this.ventajaD) && (fuerzaD>=defenA)) {
			resultado=2;
		}
		if ((fuerzaA>=defenD)&& !(this.ventajaA) && !(this.ventajaD) && (fuerzaD>=defenA)) {
			resultado=0;
		}
		if ((fuerzaA>=defenD)&& !(this.ventajaA) && !(this.ventajaD) && (fuerzaD<defenA)) {
			resultado=1;
		}
		if ((fuerzaA<defenD)&& !(this.ventajaA) && !(this.ventajaD) && (fuerzaD>=defenA)) {
			resultado=2;
		}
		switch (resultado) {
		case 0: break;
		case 1: comprobarBotin(this.atacante);
				break;
		case 2: comprobarBotin(this.defensor);
				break;
		}
		return resultado;
	}
	/*Sobrecargamos el combate para el modoteambattle*/
	public int combate(Jugador jugador1,Jugador jugador2, int bonusA, int bonusD, 
			String nombre1, String nombre2, String medio, ModoTeamBattle batalla) {
		presentarContendiente(jugador1,jugador2, nombre1, nombre2);
		/* 1 ganador atacante, 2 ganador defensor, 0 empate */
		int resultado=0;
		comprobarMedio(medio);
		comprobarHabesp(batalla);
		int fuerzaA=this.fatacante + this.bonoataqueA + bonusA;
		int fuerzaD=this.fdefensor + this.bonoataqueD + bonusD;
		int defenA=this.datacante + this.bonodefensaA + bonusA;
		int defenD=this.ddefensor + this.bonodefensaD + bonusD;
		if ((fuerzaA>=defenD) && (this.ventajaA) && !(this.ventajaD)) {
			resultado=1;
		}
		if ((fuerzaD>=defenA)&& (this.ventajaD)&& !(this.ventajaA)) {
			resultado=2;
		}
		if ((fuerzaA>=defenD)&& (this.ventajaA) && (this.ventajaD) && (fuerzaD>=defenA)) {
			resultado=0;
		}
		if ((fuerzaA>=defenD)&& (this.ventajaA) && (this.ventajaD) && (fuerzaD<defenA)) {
			resultado=1;
		}
		if ((fuerzaA<defenD)&& (this.ventajaA) && (this.ventajaD) && (fuerzaD>=defenA)) {
			resultado=2;
		}
		if ((fuerzaA>=defenD)&& !(this.ventajaA) && !(this.ventajaD) && (fuerzaD>=defenA)) {
			resultado=0;
		}
		if ((fuerzaA>=defenD)&& !(this.ventajaA) && !(this.ventajaD) && (fuerzaD<defenA)) {
			resultado=1;
		}
		if ((fuerzaA<defenD)&& !(this.ventajaA) && !(this.ventajaD) && (fuerzaD>=defenA)) {
			resultado=2;
		}
		return resultado;
	}
}
