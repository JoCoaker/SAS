import java.util.ArrayList;
import java.util.List;

/**
 * Flughafen-Klasse
 * 
 * @author Daniel Banciu (198632)
 * @version 1.0.0
 */

public class Flughafen {

	// Klassen Variablen
	private String name;
	private String lataKuerzel;

	private List<Flug> ankuenfte;
	private List<Flug> herkunft;

	public Flughafen(String name, String lataKuerzel, List<Flug> ankuenfte, List<Flug> herkunft) {

		this.name = name;
		this.lataKuerzel = lataKuerzel;
		this.ankuenfte = ankuenfte;
		this.herkunft = herkunft;

		System.out.println(toString() + "angelegt");
	}

	// Falls Flughafen keine Ankuenfte oder Herkuenfte besitzt (z.B. neu gebaut)
	public Flughafen(String name, String lataKuerzel) {

		this.name = name;
		this.lataKuerzel = lataKuerzel;
		this.ankuenfte = new ArrayList<Flug>();
		this.herkunft = new ArrayList<Flug>();

		System.out.println(toString() + "angelegt");
	}

	public void setLataKuerzel(String lataKuerzel) {
		this.lataKuerzel = lataKuerzel;
	}

	public List<Flug> getAnkuenfte() {
		return ankuenfte;
	}

	public void setAnkuenfte(List<Flug> ankuenfte) {
		this.ankuenfte = ankuenfte;
	}

	public List<Flug> getHerkunft() {
		return herkunft;
	}

	public void setHerkunft(List<Flug> herkunft) {
		this.herkunft = herkunft;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getLataKuerzel() {
		return lataKuerzel;
	}

	public String toString() {
		return this.getClass().getName() + " " + name + " " + lataKuerzel;
	}

	public boolean addAnkunft(Flug ankuenfte) {
		return this.ankuenfte.add(ankuenfte);
	}

	public boolean addherkunft(Flug herkunft) {
		return this.herkunft.add(herkunft);
	}

	public boolean removeAnkunft(Flug ankuenfte) {
		return this.ankuenfte.remove(ankuenfte);
	}

	public boolean removeHerkunft(Flug herkunft) {
		return this.herkunft.remove(herkunft);
	}

	public void heizen() {
		System.out.println(toString() + " wird geheizt");
	}

	public void saeubern() {
		System.out.println(toString() + " wird gesaeubert");
	}

	public void enteisen() {
		System.out.println(toString() + " wird enteist");
	}

	public void streichen() {
		System.out.println(toString() + " wird gestrichen");
	}

	public void reparieren() {
		System.out.println(toString() + " wird repariert");
	}
}