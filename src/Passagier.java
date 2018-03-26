
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
    private Flug reiseMittel;
    private Sitzplatz sitzplatz;

    public Passagier(String name, String vorname, String geschlecht){
        this.name = name;
        this.vorname = vorname;
        this.geschlecht = geschlecht;

        System.out.println(toString() + " angelegt.");
    }


    public String getName(){ return name;}

    public String getVorname() { return vorname;}

    public String getGeschlecht() { return geschlecht;}

    public Flug getReiseMittel() { return reiseMittel;}

    public Sitzplatz getSitzplatz() { return sitzplatz;}

    public void setSitzplatz(Sitzplatz sitzplatz){ this.sitzplatz = sitzplatz; }

    public void setReisemittel(Flug reiseMittel){ this.reiseMittel = reiseMittel; }
    public String toString(){ return this.getClass().getName() +  " '" + this.name + ", " + this.vorname + "'";}
}