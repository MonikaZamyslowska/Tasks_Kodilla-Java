package com.kodilla.good.patterns.fly.challenge;

public class SearchFlightApp {
    public static void main(String[] args) {
        FlightsRetriever flightsRetriever = new FlightsRetriever();
        FlightsMap flightsMap = flightsRetriever.retrieve();

        DepartureAirport departureAirport = new DepartureAirport("Warsaw");
        SearchByDepartureCity searchByDepartureCity = new SearchByDepartureCity();
        searchByDepartureCity.findFlight(flightsMap, departureAirport);

        ArrivalAirport arrivalAirport = new ArrivalAirport("Krakow");
        SearchByArrivalAirport searchByArrivalAirport = new SearchByArrivalAirport();
        searchByArrivalAirport.findFlight(flightsMap, arrivalAirport);
    }
}
