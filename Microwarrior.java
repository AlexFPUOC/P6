/**
 * Clase que gestiona los Microwarriors.
 */

/**
 * @author Alejandro Manuel Seva Arroyo
 *
 */
public class Microwarrior {
	/*El botin inicial es 3*/
	final int BOTIN_INICIAL=3;
	private String nombre, raza, medio, habesp, img, nombreTeam, lema;
	private int ataque, defensa, botin, id, equid, victorias, derrotas, empates, fv;
	private boolean combate, inteam;
	
	/*Método constructor*/
	public Microwarrior (String nombre, String raza, String medio, String habesp,
			String img, String lema, int ataque, int defensa, int id, boolean combate) {
		this.nombre=nombre;
		this.raza=raza;
		this.medio=medio;
		this.habesp=habesp;
		this.img=img;
		this.lema=lema;
		this.ataque=ataque;
		this.defensa=defensa;
		this.botin=BOTIN_INICIAL;
		this.id=id;
		/*El Microwarrior se crea sin equipo*/
		this.equid=0;
		this.combate=combate;
	}
	/*Métodos get*/
	public String getNombre() {
		return this.nombre;
	}
	public String getRaza() {
		return this.raza;
	}
	public String getMedio() {
		return this.medio;
	}
	public String getHabesp() {
		return this.habesp;
	}
	public String getImg() {
		return this.img;
	}
	public String getLema() {
		return this.lema;
	}
	public String getNombreTeam() {
		return this.nombreTeam;
	}
	public int getAtaque() {
		return this.ataque;
	}
	public int getDefensa() {
		return this.defensa;
	}
	public int getBotin() {
		return this.botin;
	}
	public int getId() {
		return this.id;
	}
	public int getEquid() {
		return this.equid;
	}
	public int getVictorias() {
		return this.victorias;
	}
	public int getDerrotas() {
		return this.derrotas;
	}
	public int getEmpates() {
		return this.empates;
	}
	public int getFv() {
		return this.fv;
	}
	public boolean getCombate() {
		return this.combate;
	}
	public boolean getInteam() {
		return this.inteam;
	}
	/*Métodos set*/
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setRaza(String raza) {
		this.raza=raza;
	}
	public void setMedio(String medio) {
		this.medio=medio;
	}
	public void setHabesp(String habesp) {
		this.habesp=habesp;
	}
	public void setImg(String img) {
		this.img=img;
	}
	public void setLema(String lema ) {
		this.lema=lema;
	}
	public void setNombreTeam(String nombreTeam) {
		this.nombreTeam=nombreTeam;
	}
	public void setAtaque(int ataque) {
		this.ataque=ataque;
	}
	public void setDefensa(int defensa) {
		this.defensa=defensa;
	}
	public void setBotin(int botin) {
		this.botin=botin;
	}
	public void setId(int id) {
		this.id=id;
	}
	private void setEquid(int equid) {
		this.equid=equid;
	}
	public void setVictoria(int victorias) {
		this.victorias=victorias;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas=derrotas;
	}
	public void setEmpates(int empates) {
		this.empates=empates;
	}
	public void setFv(int fv) {
		this.fv=fv;
	}
	public void setCombate(boolean combate) {
		this.combate=combate;
	}
	public void setInteam(boolean inteam) {
		this.inteam=inteam;
	}
	/*Método Equipar. Vincula id de equipo a Microwarrior*/
	public void Equipar(int id) {
		setEquid(id);
	}
}
