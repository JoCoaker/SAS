import java.util.*;

public class SASBuildUp {

    private Fluglinie theAirline;
    private Pilot thePilot;
    private Stadt destCity;
    private Stadt depCity;
    private Flughafen destAirport;
    private Flughafen depAirport;
    private Passagier p1;
    private Passagier p2;
    private Flugzeug theAirplane;
    private Flug outboundFlight;
    private Flug inboundFlight;


    public static void main(String[] args) {
        new SASBuildUp();
    }

    public SASBuildUp() {
        buildAirline();
        buildPilots();
        buildCities();
        buildAirports();
        buildPassangers();
        buildAirplanes();

        System.out.println();
        System.out.println();

        buildOutboundFlight();

        System.out.println("----- " + outboundFlight + " startet -----");

        outboundFlight.show();

        p1.setBordkarte(null);
        p2.setBordkarte(null);

        System.out.println();
        System.out.println("----- " + outboundFlight + " beendet -----");
        System.out.println();

        buildInboundFlight();
        System.out.println("----- " + inboundFlight + " startet -----");

        inboundFlight.show();
        System.out.println();
        System.out.println("----- " + inboundFlight + " beendet -----");
    }

    private void buildAirline() {
        theAirline = new Fluglinie(new ArrayList<>(), new ArrayList<>(), "Special Air Service", "SAS");
    }

    private void buildPilots() {
        thePilot = new Pilot("Whitaker", "John", 199261, theAirline, new ArrayList<>());
    }

    private void buildCities() {
        destCity = new Stadt("New York");
        depCity = new Stadt("Frankfurt Main");
    }

    private void buildAirports() {
        destAirport = new Flughafen("John F. Kennedy", "JFK", destCity);
        depAirport = new Flughafen("Frankfurt Airport", "FRA", depCity);
        destCity.addFlughafen(destAirport);
        depCity.addFlughafen(depAirport);
    }

    private void buildPassangers() {
        p1 = new Passagier("Fetzer", "Tobias", "m");
        p2 = new Passagier("Reichert", "Lukas", "m");
    }

    private void buildAirplanes() {
        theAirplane = new Flugzeug("B747", "SN1030458435092", 105.99f, "D-A BCX");
        Sitzplatz s1 = new Sitzplatz(16, 'E', theAirplane);
        Sitzplatz s2 = new Sitzplatz(16, 'D', theAirplane);
        theAirplane.addSitzplatz("16E", s1);
        theAirplane.addSitzplatz("16D", s2);
    }

    private void buildOutboundFlight() {
        outboundFlight = new Flug(new Date(1516971600000L), "LH1234", theAirline, theAirplane);
        outboundFlight.addHerkunft(depAirport);
        outboundFlight.addPilot(thePilot);
        outboundFlight.addPassagier(p1);
        outboundFlight.addPassagier(p2);
        outboundFlight.addDestination(destAirport);

        p1.setBordkarte(theAirplane.getSitzplatz("16E").reservieren(p1, outboundFlight));
        p2.setBordkarte(theAirplane.getSitzplatz("16D").reservieren(p2, outboundFlight));
    }

    private void buildInboundFlight() {
        inboundFlight = new Flug(new Date(1517144400000L), "LH1235", theAirline, theAirplane);
        inboundFlight.addHerkunft(destAirport);
        inboundFlight.addPilot(thePilot);
        inboundFlight.addPassagier(p1);
        inboundFlight.addDestination(depAirport);

        p1.setBordkarte(theAirplane.getSitzplatz("16E").reservieren(p1, inboundFlight));
    }
}
