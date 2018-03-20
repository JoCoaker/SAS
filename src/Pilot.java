import java.util.List;

/**
 * @author Simon Stratemeier 199067
 */
public class Pilot {
    private String name;
    private String vorname;
    private int personNr;

    private Fluglinie arbeitgeber;
    private List<Flug> auftraege;

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public Fluglinie getArbeitgeber() {
        return arbeitgeber;
    }

    public void setArbeitgeber(Fluglinie arbeitgeber) {
        this.arbeitgeber = arbeitgeber;
    }

    public List<Flug> getAuftraege() {
        return auftraege;
    }

    public void addAuftrag(Flug auftrag) {
        this.auftraege.add(auftrag);
    }

    public void einstellen() {
        System.out.println(toString() + " wird eingestellt");
    }

    public void entlassen() {
        System.out.println(toString() + " wird entlassen");
    }

    public void reservieren() {
        System.out.println(toString() + " wird reserviert");
    }

    public void verspaeten() {
        System.out.println(toString() + " wird verspätet");
    }

    public Pilot(String name, String vorname, int personNr, Fluglinie arbeitgeber, List<Flug> aufträge) {
        this.name = name;
        this.vorname = vorname;
        this.personNr = personNr;
        this.arbeitgeber = arbeitgeber;
        this.auftraege = aufträge;

        System.out.println(toString() + " angelegt");
    }

    @Override
    public String toString() {
        return "Pilot " + personNr;
    }
}
