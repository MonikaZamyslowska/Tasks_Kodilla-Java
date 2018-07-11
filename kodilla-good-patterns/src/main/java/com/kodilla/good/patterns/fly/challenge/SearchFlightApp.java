package com.kodilla.good.patterns.fly.challenge;


public class SearchFlightApp {
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        flightSearch.findFlightFrom("Kraków");
        flightSearch.findFlightTo("Warszawa");
        flightSearch.findConnectingFlight("Kraków", "Warszawa", "Wrocław");
    }
}
