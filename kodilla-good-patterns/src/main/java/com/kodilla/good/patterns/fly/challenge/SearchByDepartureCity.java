package com.kodilla.good.patterns.fly.challenge;


public class SearchByDepartureCity {

    public void findFlight(FlightsMap flightsMap, DepartureAirport departureAirport) {
        flightsMap.getFlight().entrySet().stream()
                .filter(t -> t.getKey().getDepartureCity().equals(departureAirport.getDepartureCity()))
                .forEach(System.out::println);
    }
}
