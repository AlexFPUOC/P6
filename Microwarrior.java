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
	private static String nombre, raza, medio, habesp, img, nombreTeam;
	private static int ataque, defensa, botin, id, equid, victorias, derrotas, empates, fv;
	private static boolean combate, inteam;
	
	/*Constructor*/
	public Microwarrior (String nombre, String raza, String medio, String habesp,
			String img, int ataque, int defensa, boolean combate) {
		Microwarrior.nombre=nombre;
		Microwarrior.raza=raza;
		Microwarrior.medio=medio;
		Microwarrior.habesp=habesp;
		Microwarrior.img=img;
		Microwarrior.ataque=ataque;
		Microwarrior.defensa=defensa;
		Microwarrior.botin=BOTIN_INICIAL;
		/*El Microwarrior se crea sin equipo*/
		Microwarrior.equid=0;
		Microwarrior.combate=combate;
		/*Al comienzo el Microwarrior se crea sin pertenecer a ningún equipo*/
		Microwarrior.inteam=false;
	}
	/*Get*/
	public static String getNombre() {
		return nombre;
	}
	public static String getRaza() {
		return raza;
	}
	public static String getMedio() {
		return medio;
	}
	public static String getHabesp() {
		return habesp;
	}
	public static String getImg() {
		return img;
	}
	public static String getNombreTeam() {
		return nombreTeam;
	}
	public static int getAtaque() {
		return ataque;
	}
	public static int getDefensa() {
		return defensa;
	}
	public static int getBotin() {
		return botin;
	}
	public static int getId() {
		return id;
	}
	public static int getEquid() {
		return equid;
	}
	public static int getVictorias() {
		return victorias;
	}
	public static int getDerrotas() {
		return derrotas;
	}
	public static int getEmpates() {
		return empates;
	}
	public static int getFv() {
		return fv;
	}
	public static boolean getCombate() {
		return combate;
	}
	public static boolean getInteam() {
		return inteam;
	}
	/*Set*/
	public void setNombre(String nombre) {
		Microwarrior.nombre=nombre;
	}
	public void setRaza(String raza) {
		Microwarrior.raza=raza;
	}
	public void setMedio(String medio) {
		Microwarrior.medio=medio;
	}
	public void setHabesp(String habesp) {
		Microwarrior.habesp=habesp;
	}
	public void setImg(String img) {
		Microwarrior.img=img;
	}
	public void setNombreTeam(String nombreTeam) {
		Microwarrior.nombreTeam=nombreTeam;
	}
	public void setAtaque(int ataque) {
		Microwarrior.ataque=ataque;
	}
	public void setDefensa(int defensa) {
		Microwarrior.defensa=defensa;
	}
	public void setBotin(int botin) {
		Microwarrior.botin=botin;
	}
	public void setId(int id) {
		Microwarrior.id=id;
	}
	private void setEquid(int equid) {
		Microwarrior.equid=equid;
	}
	public void setVictoria(int victorias) {
		Microwarrior.victorias=victorias;
	}
	public void setDerrotas(int derrotas) {
		Microwarrior.derrotas=derrotas;
	}
	public void setEmpates(int empates) {
		Microwarrior.empates=empates;
	}
	public void setFv(int fv) {
		Microwarrior.fv=fv;
	}
	public void setCombate(boolean combate) {
		Microwarrior.combate=combate;
	}
	public void setInteam(boolean inteam) {
		Microwarrior.inteam=inteam;
	}
	/*Equipar. Vincula id de equipo a Microwarrior*/
	public void Equipar(int id) {
		setEquid(id);
	}
}
