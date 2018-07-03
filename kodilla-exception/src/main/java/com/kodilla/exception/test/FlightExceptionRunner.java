package com.kodilla.exception.test;

import java.util.Map;

public class FlightExceptionRunner {
    public static void main(String[] args) {
        Flight flight = new Flight(null, "Chicago");

        FlightSearch flightSearch = new FlightSearch();
        try {
            Map<String, Boolean> flyMap = flightSearch.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Please choose another flight, the final airport was not found");
        }
    }
}
