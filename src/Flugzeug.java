import java.util.HashMap;

/**
 * @Author: Tobias Fetzer
 * @Date: 20/03/18
 */
public class Flugzeug {

    private String modell;
    private String serienNummer;
    private float flugStunden;
    private String kennzeichen;
    private HashMap<String, Sitzplatz> sitzplaetze = new HashMap<>();


    public Flugzeug(String modell, String serienNummer, float flugStunden, String kennzeichen) {
        this.modell = modell;
        this.serienNummer = serienNummer;
        this.flugStunden = flugStunden;
        this.kennzeichen = kennzeichen;
        System.out.println("Flugzeig " + kennzeichen + " angelegt");
    }

    public String getModell() {
        return modell;
    }

    public HashMap<String, Sitzplatz> getAlleSitzplaetze() {
        return sitzplaetze;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getSerienNummer() {
        return serienNummer;
    }

    public void setSerienNummer(String serienNummer) {
        this.serienNummer = serienNummer;
    }

    public float getFlugStunden() {
        return flugStunden;
    }

    public void setFlugStunden(float flugStunden) {
        this.flugStunden = flugStunden;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }


    public Sitzplatz getSitzplatz(String key) {
        return sitzplaetze.get(key);
    }

    public void addSitzplatz(String key, Sitzplatz sitzplatz) {
        sitzplaetze.put(key, sitzplatz);
    }

    @Override
    public String toString() {
        return "Flugzeig " + kennzeichen;
    }

    public void heizen() {
        System.out.println(toString() + " wird geheizt");
    }

    public void auftanken() {
        System.out.println(toString() + " wird getankt");
    }

    public void saeubern() {
        System.out.println(toString() + " wird gesaeubert");
    }

    public void enteisen() {
        System.out.println(toString() + " wird geenteist");
    }

    public void abheben() {
        System.out.println(toString() + " wird geabehoben");
    }

    public void landen() {
        System.out.println(toString() + " wird gelandet");
    }

    public void reparieren() {
        System.out.println(toString() + " wird gerepariert");
    }

    public void streichen() {
        System.out.println(toString() + " wird gestrichen");
    }

}

