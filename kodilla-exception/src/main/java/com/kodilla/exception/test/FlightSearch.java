package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();

        Boolean flightPermission = false;
        if (flight.getArrivalAirport() != null) {
            flightPermission = true;
        }
        if (flight.getDepartureAirport() == null) {
            throw new RouteNotFoundException("Airport not found.");
        }

        flights.put(flight.getArrivalAirport(), flightPermission);
        return flights;
    }
}
