/**
 * Clase que gestiona las armas y escudos de la aplicación.
 */

/**
 * @author Alejandro Manuel Seva Arroyo
 *
 */
public class Equipo {

	private int bonfuerza,bondef,equipid;
	private String nombre,habesp, tipo;
	private boolean medionot,destroy,hab;
	
	/* Método constructor */
	public Equipo (int bonfuerza, int bondef, int equipid, String nombre, 
			String habesp, String tipo, boolean medionot, boolean destroy, boolean hab) {
		this.bonfuerza=bonfuerza;
		this.bondef=bondef;
		this.equipid=equipid;
		this.nombre=nombre;
		this.habesp=habesp;
		this.tipo=tipo;
		this.medionot=medionot;
		this.destroy=destroy;
		this.hab=hab;
	}
	/* Métodos get */
	public int getBonfuerza() {
		return this.bonfuerza;
	}
	public int getBondef() {
		return this.bondef;
	}
	public int getEquipid() {
		return this.equipid;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getHabesp() {
		return this.habesp;
	}
	public String getTtipo() {
		return this.tipo;
	}
	public boolean getMedionot() {
		return this.medionot;
	}
	public boolean getDestroy() {
		return this.destroy;
	}
	public boolean getHab() {
		return this.hab;
	}
	/* Métodos Set: Dado que los valores de las armas no pueden cambiar *
	 * durante la gestión de la aplicación, no se establecerán métodos Set.*/
	
}
