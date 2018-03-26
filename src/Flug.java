import java.util.Date;

/**
 * Flug
 *
 * @author Lukas Reichert [199034]
 * @version 1.0.0
 */
public class Flug
{

    // Klassen Variablen
    private Date datum;
    private String flugNummer;
    private Fluglinie organisator;
    private Flugzeug befoerderungsmittel;
    private Pilot[] piloten = new Pilot[3];
    private Passagier[] passagiere = new Passagier[853];
    private Flughafen[] herkuenfte = new Flughafen[5];
    private Flughafen[] destinationen = new Flughafen[5];

    /**
     * Konstruktor
     * @param datum
     * @param flugNummer
     * @param organisator
     * @param befoerderungsmittel
     * @param piloten
     * @param passagiere
     * @param herkuenfte
     * @param destinationen
     */
    public Flug(Date datum, String flugNummer, Fluglinie organisator, Flugzeug befoerderungsmittel, Pilot[] piloten, Passagier[] passagiere, Flughafen[] herkuenfte, Flughafen[] destinationen){
        this.datum = datum;
        this.flugNummer = flugNummer;
        this.organisator = organisator;
        this.befoerderungsmittel = befoerderungsmittel;
        this.piloten = piloten;
        this.passagiere = passagiere;
        this.herkuenfte = herkuenfte;
        this.destinationen = destinationen;

        System.out.println(this.toString() + " angelegt.");
    }

    /**
     * Konstruktor
     * @param datum
     * @param flugNummer
     * @param organisator
     * @param befoerderungsmittel
     */
    public Flug(Date datum, String flugNummer, Fluglinie organisator, Flugzeug befoerderungsmittel){
        this.datum = datum;
        this.flugNummer = flugNummer;
        this.organisator = organisator;
        this.befoerderungsmittel = befoerderungsmittel;

        System.out.println(this.toString() + " angelegt.");
    }

    public void einstellen() {
        System.out.println(this.toString() + " wird eingestellt.");
    }

    public void reservieren() {
        System.out.println(this.toString() + " wird reserviert.");
    }

    public void abheben() {
        System.out.println(this.toString() + " hebt ab.");
    }

    public void landen() {
        System.out.println(this.toString() + " landet.");
    }

    public void streichen() {
        System.out.println(this.toString() + " wird gestrichen.");
    }

    public void verspaeten() {
        System.out.println(this.toString() + " hat Verspaetung.");
    }

    /**
     * Getter
     */
    public Date getDatum() {
        return datum;
    }

    public String getFlugNummer() {
        return flugNummer;
    }

    public Fluglinie getOrganisator() {
        return organisator;
    }

    public Flugzeug getBefoerderungsmittel() {
        return befoerderungsmittel;
    }

    public Pilot[] getPiloten() {
        return piloten;
    }

    public Passagier[] getPassagiere() {
        return passagiere;
    }

    public Flughafen[] getHerkuenfte() {
        return herkuenfte;
    }

    public Flughafen[] getDestinationen() {
        return destinationen;
    }

    /**
     * Setter
     */
    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setFlugNummer(String flugNummer) {
        this.flugNummer = flugNummer;
    }

    public void setOrganisator(Fluglinie organisator) {
        this.organisator = organisator;
    }

    public void setBefoerderungsmittel(Flugzeug befoerderungsmittel) {
        this.befoerderungsmittel = befoerderungsmittel;
    }

    public void setPiloten(Pilot[] piloten) {
        this.piloten = piloten;
    }

    public void setPassagiere(Passagier[] passagiere) {
        this.passagiere = passagiere;
    }

    public void setHerkuenfte(Flughafen[] herkuenfte) {
        this.herkuenfte = herkuenfte;
    }

    public void setDestinationen(Flughafen[] destinationen) {
        this.destinationen = destinationen;
    }

    /**
     * Methoden fuer Arrays
     */
    public boolean addPilot(Pilot pilot) {
        boolean success = false;
        for (int i = 0; i < this.piloten.length; i++) {
            if(this.piloten[i] == null) {
                this.piloten[i] = pilot;
                i = this.piloten.length;
                success = true;
            }
        }
        return success;
    }

    public boolean addPassagier(Passagier passagier) {
        boolean success = false;
        for (int i = 0; i < this.passagiere.length; i++) {
            if(this.passagiere[i] == null) {
                this.passagiere[i] = passagier;
                i = this.passagiere.length;
                success = true;
            }
        }
        return success;
    }

    public boolean addHerkunft(Flughafen herkunft) {
        boolean success = false;
        for (int i = 0; i < this.herkuenfte.length; i++) {
            if(this.herkuenfte[i] == null) {
                this.herkuenfte[i] = herkunft;
                i = this.herkuenfte.length;
                success = true;
            }
        }
        return success;
    }

    public boolean addDestination(Flughafen destination) {
        boolean success = false;
        for (int i = 0; i < this.destinationen.length; i++) {
            if(this.destinationen[i] == null) {
                this.destinationen[i] = destination;
                i = this.destinationen.length;
                success = true;
            }
        }
        return success;
    }

    public void removePilot(int index) {
        if (index < this.piloten.length)
            this.piloten[index] = null;
    }

    public void addPassagier(int index) {
        if (index < this.passagiere.length)
            this.passagiere[index] = null;
    }

    public void addHerkunft(int index) {
        if (index < this.herkuenfte.length)
            this.herkuenfte[index] = null;
    }

    public void addDestination(int index) {
        if (index < this.destinationen.length)
            this.destinationen[index] = null;
    }

    public void show(){
        System.out.println(toString()+" am "+getDatum());
        System.out.println("angeboten von "+organisator);
        System.out.print("gefolgen von "+piloten[0]);
        for(int i=1;piloten[i]!=null||i<=3;i++){
            System.out.println(" und "+piloten[i]);
        }
        System.out.println();
        System.out.println("startet in "+herkuenfte[0]+" bei "+herkuenfte[0].getEinzugsgebiet());
        System.out.println("landet in "+destinationen[0]+" bei "+destinationen[0].getEinzugsgebiet());
        System.out.println("wird durchgeführt mit "+befoerderungsmittel.getKennzeichen()+"("+befoerderungsmittel.getModel+")");
        System.out.print("befördert Passagiere: ");
        Flugzeug.getAlleSitzplaetze.forEach((key,value) -> System.out.println(value "auf Platz "+key));
    }
    @Override
    public String toString() {
        return this.getClass().getName() + " '" + this.flugNummer + "'";
    }

}
