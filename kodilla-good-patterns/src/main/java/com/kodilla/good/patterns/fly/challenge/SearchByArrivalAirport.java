package com.kodilla.good.patterns.fly.challenge;


import java.util.Collection;

public class SearchByArrivalAirport {


    public void findFlight(FlightsMap flightsMap, ArrivalAirport arrivalAirport) {
        flightsMap.getFlight().keySet().stream()
                .filter(t -> t.getDepartureCity().equals(arrivalAirport.getArrivalCity()))
                .forEach(System.out::println);
    }
}
