/**
 * Repräsentiert einen Sitzplatz in einem Flugzeug.
 * @author Niklas Kapelle
 * @version 1.0.0
 */
public class Sitzplatz {
    private String ort;
    private int reihe;
    private char platz;

    private Flugzeug standort;

    Sitzplatz(String ort, int reihe, char platz,Flugzeug standort){
        this.setOrt(ort);
        this.setReihe(reihe);
        this.setPlatz(platz);
        this.setStandort(standort);

        System.out.println(this.toString() + " angelegt.");
    }

    public void heizen(){
        System.out.println(this.toString() + " wird beheitzt.");
    }

    public void einstellen(){
        System.out.println(this.toString() + " wird eingestellt.");
    }

    public void reservieren(){
        System.out.println(this.toString() + " wird reserviert.");
    }

    public void reparieren(){
        System.out.println(this.toString() + " wird repariert.");
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " +  this.standort + " " + this.reihe + this.platz;
    }

    /*
        Getter
     */
    public String getOrt() {
        return ort;
    }

    public int getReihe() {
        return reihe;
    }

    public char getPlatz() {
        return platz;
    }

    public Flugzeug getStandort() {
        return standort;
    }

    /*
        Setter
    */

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setReihe(int reihe) {
        this.reihe = reihe;
    }

    public void setPlatz(char platz) {
        this.platz = platz;
    }

    public void setStandort(Flugzeug standort) {
        if(standort == null){
            throw new IllegalArgumentException("standort darf nicht null sein");
        }else{
            this.standort = standort;
        }
    }
}
