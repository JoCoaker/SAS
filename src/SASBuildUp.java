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

    }
    private void  buildAirline() {
        theAirline = new Fluglinie(new ArrayList<>(), new ArrayList<>(),  "Scandinavian Airlines", "SAS");
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
    private void buildFlights() {
        outboundFlight = new Flug(new Date(1516971600000L), "LH1234", theAirline, theAirplane);
        outboundFlight.addHerkunft(depAirport);
        outboundFlight.addPilot(thePilot);
        outboundFlight.addPassagier(p1);
        outboundFlight.addPassagier(p2);
        outboundFlight.addDestination(destAirport);

        inboundFlight = new Flug(new Date(1517144400000L), "LH1235", theAirline, theAirplane);
        inboundFlight.addHerkunft(destAirport);
        inboundFlight.addPilot(thePilot);
        outboundFlight.addPassagier(p1);
        inboundFlight.addDestination(depAirport);
    }
}
