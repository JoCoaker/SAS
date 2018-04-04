import java.util.HashMap;
import java.util.ArrayList;
/**
 * @author Tobias Fetzer [198318]
 * @date 04/04/18
 */
public class Flugzeug {

    private String modell;
    private String serienNummer;
    private float flugStunden;
    private String kennzeichen;
    private HashMap<String, Sitzplatz> sitzplaetze = new HashMap<>();
    private ArrayList<Flug> auftrag = new ArrayList()<>;


    public Flugzeug(String modell, String serienNummer, float flugStunden, String kennzeichen) {
        this.modell = modell;
        this.serienNummer = serienNummer;
        this.flugStunden = flugStunden;
        this.kennzeichen = kennzeichen;
        System.out.println(toString() + " angelegt.");
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


    public Sitzplatz getSitzplatz(String sitzplatznummer) {
        return sitzplaetze.get(sitzplatznummer);
    }

    public void addSitzplatz(String sitzplatznummer, Sitzplatz sitzplatz) {
        sitzplaetze.put(sitzplatznummer, sitzplatz);
    }
    
    public void addAuftrag(Flug auftrag){
        auftrag.add(Flug);
    }

    public auftrag getAuftrag(){
        return auftrag;
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

    @Override
    public String toString() {
        return "Flugzeug '" + kennzeichen + "'";
    }

}

