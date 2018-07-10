package com.kodilla.good.patterns.fly.challenge;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchByArrivalAirport {

    public void findFlight (FlightsMap flightsMap, Airport airport) {
        Map<Airport, List<Airport>> result = flightsMap.getFlight().entrySet().stream()
                .filter(map -> map.getValue().contains(airport))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        System.out.println(result);
    }
}
