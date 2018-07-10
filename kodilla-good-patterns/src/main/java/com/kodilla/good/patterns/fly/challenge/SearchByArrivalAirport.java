package com.kodilla.good.patterns.fly.challenge;

import java.util.Map;
import java.util.stream.Collectors;

public class SearchByArrivalAirport {

    public void findFlight (FlightsMap flightsMap, Airport airport) {
        Map<Airport, Airport> result = flightsMap.getFlight().entrySet().stream()
                .filter(map -> airport.equals(map.getValue()))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        System.out.println(result);
    }
}
