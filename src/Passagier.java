
/**
 * Passagier
 *
 * @author Felix Rueß [199261]
 * @version 1.0.0
 */
public class Passagier {
    private String name;
    private String vorname;

    private String geschlecht;
    private Bordkarte bordkarte;

    public Passagier(String name, String vorname, String geschlecht) {
        this.name = name;
        this.vorname = vorname;
        this.geschlecht = geschlecht;

        System.out.println(toString() + " angelegt.");
    }


    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setBordkarte(Bordkarte bordkarte) {
        this.bordkarte = bordkarte;
    }

    public Bordkarte getBordkarte() {
        return bordkarte;
    }

    public String toString() {
        return this.getClass().getName() + " '" + this.name + ", " + this.vorname + "' " + (this.geschlecht.equals("m") ? "Mr." : "Ms.");
    }
}