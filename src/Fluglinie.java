import java.util.*;

/**
 * Fluglinie
 *
 * @author Peter Tim Oliver Nauroth [198322]
 * @version 1.0.0
 */

public class Fluglinie {

    // Klassen Variablen
    private List<Flug> fluege;
    private List<Pilot> piloten;
    private String name;
    private String iataKuerzel;

    /*
     * Konstruktor mit den Fluegen
     */
    public Fluglinie(List<Flug> fluege, List<Pilot> piloten, String name, String iataKuerzel) {
        this.fluege = fluege;
        this.piloten = piloten;
        this.name = name;
        this.iataKuerzel = iataKuerzel;

        System.out.println(this.toString() + " angelegt.");
    }

    /*
     * Konstruktor ohne die Fluege
     */
    public Fluglinie(List<Pilot> piloten) {
        this.fluege = Arrays.asList();
        this.piloten = piloten;
        System.out.println(this.toString() + " angelegt.");
    }


    /*
     * Getters and Setters
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
        if (this.piloten.size() > 1) {
            return this.piloten.remove(pilot);
        } else {
            throw new IllegalArgumentException("Die Flugliene benoetigt min. einen Piloten");        //Benoetigt min. einen Piloten!!!
        }
    }

    public boolean removeFlug(Flug flug) {
        return this.fluege.remove(flug);
    }


    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "'" + name + "' " + iataKuerzel;
    }


}
