/**
 * Clase que genera los combates entre equipos de Microwarriors
 */

/**
 * @author Alejandro Manuel Seva Arroyo
 *
 */
public class ModoTeamBattle {
	/* Variables si un microwarrior ya ha usado ataque de fuerza concentrada */
	private boolean FactivA, FactivD;
	/* Variables si uno de los equipos tiene bonus por moral */
	private int bonusA, bonusD;
	/* constructor */
	private Jugador jugador1, jugador2;
	public ModoTeamBattle (Jugador jugador1, Jugador jugador2) {
		this.FactivA=false;
		this.FactivD=false;
		this.bonusA=0;
		this.bonusD=0;
		this.jugador1=jugador1;
		this.jugador2=jugador2;
	}
	/*get*/
	public boolean getFactivA() {
		return this.FactivA;
	}
	public boolean getFactivD() {
		return this.FactivD;
	}
	public int getBonusA() {
		return this.bonusA;
	}
	public int getBonusD() {
		return this.bonusD;
	}
	/*set*/
	public void setFactivA(boolean factiva) {
		this.FactivA=factiva;
	}
	public void setFactivD(boolean factivd) {
		this.FactivD=factivd;
	}
	/*comprobarMoral*/
	private int comprobarMoral(int mas, int menos) {
		int bonus;
		bonus = mas/menos;
		if (bonus==1) {
			bonus=0;
		}
		return bonus;
	}
	/*combate*/
	public int combate(Team team1, Team team2) {
		String nombre1, nombre2, medio;
		int resultadoTeam;
		/*se declaran variables para llevar la cuenta de las victorias*/
		int survival1[];
		int survival2[];
		int y, escaramuza;
		/* inicializamos las variables */
		for (y=0; y<team1.GRUPO_MAX;y++) {
			survival1[y]=0;
			survival2[y]=0;
		}
		/*se revisa equipo con menos combatientes*/
		int comMin,total1,total2, moral, x;
		Microwarrior atq, def;
		total1=team1.getTotalmiembros();
		total2=team2.getTotalmiembros();
		if (total1>=total2) {
			comMin=total2;
			moral=comprobarMoral (total1, total2);
			this.bonusA=moral;
		} else {
			comMin=total1;
			moral=comprobarMoral (total2, total1);
			this.bonusD=moral;
		}
		/* Se realiza la primera pasada*/
	for (x=0; x<=comMin; x++) {
		atq=team1.getOrdercombat(x);
		nombre1=atq.getNombreTeam();
		survival1[x]=1;
		def=team2.getOrdercombat(x);
		nombre2=def.getNombreTeam();
		survival2[x]=1;
		ModoDuelo refriega = new ModoDuelo(atq,def);
		medio=refriega.seleccionarMedio();
		escaramuza=refriega.combate (jugador1, jugador2, bonusA, bonusD, 
				nombre1,nombre2,medio,this);
		switch (escaramuza) {
		case 0: survival1[x]=0;
				total1=total1-1;
				survival2[x]=0;
				total2=total2-1;
				break;
		case 1: survival2[x]=0;
				total2=total2-1;
				break;
		case 2: survival1[x]=0;
				total1=total1-1;
				break;
		}
	}
	/* Resto de combates */
	while (total1>0 && total2>0) {
		boolean controlA=false;
		boolean controlD=false;
		for (x=0; x<=comMin;x++) {
			if ((survival1[x]==1) && (controlA==false)) {
				atq=team1.getOrdercombat(x);
				controlA=true;
			}
			if ((survival2[x]==1) && (controlD==false)) {
				def=team2.getOrdercombat(x);
				controlD=true;
			}
		}
		ModoDuelo refriega = new ModoDuelo(atq,def);
		medio=refriega.seleccionarMedio();
		escaramuza=refriega.combate (jugador1, jugador2, bonusA, bonusD, 
				nombre1,nombre2,medio,this);
		switch (escaramuza) {
		case 0: survival1[x]=0;
				total1=total1-1;
				survival2[x]=0;
				total2=total2-1;
				break;
		case 1: survival2[x]=0;
				total2=total2-1;
				break;
		case 2: survival1[x]=0;
				total1=total1-1;
				break;
		}
	}
	if (total1==0 && total2==0) {
		resultadoTeam=0;
	}
	if (total1>0) {
		resultadoTeam=1;
	}
	if (total2>0) {
		resultadoTeam=2;
	}
	return resultadoTeam;
	}
}