import java.util.*;

/**
 * Fluglinie
 *
 * @author Peter Tim Oliver Nauroth [198322]
 * @version 1.0.0
 */

public class Fluglinie {
	
	// Klassen Variablen
	List<Flug> fluege;
	List<Pilot> piloten;
	
	/*
	 * Konstruktor mit den Fluegen
	 */
	public Fluglinie(List<Flug> fluege, List<Pilot> piloten){
		this.fluege = fluege;
		this.piloten = piloten;
		
		System.out.println(this.toString() + " angelegt.");	
	}
	
	/*
	 * Konstruktor ohne die Fluege
	 */
	public Fluglinie(List<Pilot> piloten){
		this.fluege = Arrays.asList();
		this.piloten = piloten;
		System.out.println(this.toString() + " angelegt.");	
	}
	
	
	/*
	 * Getter´s and Setter`s
	 */
    public List<Flug> getFluege() {
		return fluege;
	}

	public void setFluege(List<Flug> fluege) {
		this.fluege = fluege;
	}

	public List<Pilot> getPiloten() {
		return piloten;
	}

	public void setPiloten(List<Pilot> piloten) {
		this.piloten = piloten;
	}
	
	
	/*
	 * Funktionen fuer die Listen
	 */
	
	public boolean addPilot(Pilot pilot) {
		return this.piloten.add(pilot);
	}
	
	
	public boolean addFlug(Flug flug) {
		return this.fluege.add(flug);
	}
	
	public boolean removePilot(Pilot pilot) {
		if(this.piloten.size()>1) {
			return this.piloten.remove(pilot);
		}else {
			throw new IllegalArgumentException("Die Flugliene benötigt min. einen Piloten");		//Benötigt min. einen Piloten!!!
		}
	}
	
	public boolean reomveFlug(Flug flug) {
		return this.fluege.remove(flug);
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
    public String toString() {
        return "fill";
    }
	
	
	
}
