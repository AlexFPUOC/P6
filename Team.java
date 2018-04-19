/**
 * Gestiona los equipos de Microwarriors
 */

/**
 * @author Alejandro Manuel Seva Arroyo
 *
 */
public class Team {
	/*MAX. miembros de un grupo especificado en 12*/
	final int GRUPO_MAX=12;
	private int totalmiembros, potcomb;
	private Microwarrior ordercombat[], miembros[];
	private boolean especializado;
	
	/*Constructor*/
	public Team (int totalmiembros, int potcomb, Microwarrior ordercombat[], Microwarrior miembros[],
			boolean especializado) {
		this.totalmiembros=totalmiembros;
		this.potcomb=potcomb;
		int x = 0;
		for (x=0; x<GRUPO_MAX; x++) {
			this.ordercombat[x]=ordercombat[x];
			this.miembros[x]=miembros[x];
		}
		this.especializado=especializado;
	}
	
	/*Get*/
	public int getTotalmiembros() {
		return this.totalmiembros;
	}
	public int getPotcomb() {
		return this.potcomb;
	}
	public Microwarrior getOrdercombat(int x) {
		return this.ordercombat[x];
	}
	public Microwarrior getMiembros(int x) {
		return this.miembros[x];
	}
	public boolean getEspecializado() {
		return this.especializado;
	}
	/*Set*/
	public void setTotalmiembros(int totalmiembros) {
		this.totalmiembros=totalmiembros;
	}
	public void setPotcomb(int potcomb) {
		this.potcomb=potcomb;
	}
	public void setOrdercombat(int x,Microwarrior ordercombat) {
		this.ordercombat[x]=ordercombat;
	}
	public void setMiembros(int x, Microwarrior miembros) {
		this.miembros[x]=miembros;
	}
	public void setEspecializado(boolean especializado) {
		this.especializado=especializado;
	}
}
