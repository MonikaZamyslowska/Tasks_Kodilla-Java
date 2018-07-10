package com.kodilla.good.patterns.fly.challenge;


public class SearchFlightApp {
    public static void main(String[] args) {
        FlightsRetriever flightsRetriever = new FlightsRetriever();
        FlightsMap flightsMap = flightsRetriever.retrieve();
        Airport airport = new Airport("Cracow");

        SearchByDepartureCity searchByDepartureCity = new SearchByDepartureCity();
        searchByDepartureCity.findFlight(flightsMap, airport);

        SearchByArrivalAirport searchByArrivalAirport = new SearchByArrivalAirport();
        searchByArrivalAirport.findFlight(flightsMap, airport);
    }
}
