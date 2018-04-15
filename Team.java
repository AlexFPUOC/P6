/**
 * Gestiona los equipos de Microwarriors
 */

/**
 * @author Alejandro Manuel Seva Arroyo
 *
 */
public class Team {
	/*Máximo miembros de un grupo especificado en 12*/
	final int GRUPO_MAX=12;
	private int totalmiembros, potcomb, ordercombat[], miembros[];
	private boolean especializado;
	
	/*Método constructor*/
	public Team (int totalmiembros, int potcomb, int ordercombat[], int miembros[],
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
	
	/*Métodos get*/
	public int getTotalmiembros() {
		return this.totalmiembros;
	}
	public int getPotcomb() {
		return this.potcomb;
	}
	public int getOrdercombat(int x) {
		return this.ordercombat[x];
	}
	public int getMiembros(int x) {
		return this.miembros[x];
	}
	public boolean getEspecializado() {
		return this.especializado;
	}
	/*Métodos set*/
	public void setTotalmiembros(int totalmiembros) {
		this.totalmiembros=totalmiembros;
	}
	public void setPotcomb(int potcomb) {
		this.potcomb=potcomb;
	}
	public void setOrdercombat(int x,int ordercombat) {
		this.ordercombat[x]=ordercombat;
	}
	public void setMiembros(int x, int miembros) {
		this.miembros[x]=miembros;
	}
	public void setEspecializado(boolean especializado) {
		this.especializado=especializado;
	}
}
