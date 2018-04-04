public class Bordkarte {

    private Passagier passagier;
    private Flug flug;
    private Sitzplatz sitzplatz;


    public Bordkarte(Passagier passagier, Flug flug, Sitzplatz sitzplatz) {
            this.passagier = passagier;
            this.flug = flug;
            this.sitzplatz = sitzplatz;
    }

    public Passagier getPassagier() {
        return passagier;
    }

    public void setPassagier(Passagier passagier) {
        this.passagier = passagier;
    }

    public Flug getFlug() {
        return flug;
    }

    public void setFlug(Flug flug) {
        this.flug = flug;
    }

    public Sitzplatz getSitzplatz() {
        return sitzplatz;
    }

    public void setSitzplatz(Sitzplatz sitzplatz) {
        this.sitzplatz = sitzplatz;
    }

}
