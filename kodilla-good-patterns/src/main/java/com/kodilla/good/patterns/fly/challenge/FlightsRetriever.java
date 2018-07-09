package com.kodilla.good.patterns.fly.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightsRetriever {

    public FlightsMap retrieve() {

        List<ArrivalAirport> flightsFromWarsaw = new ArrayList<>();
        flightsFromWarsaw.add(new ArrivalAirport("Krakow"));
        flightsFromWarsaw.add(new ArrivalAirport("Gdansk"));
        flightsFromWarsaw.add(new ArrivalAirport("Wroclaw"));

        List<ArrivalAirport> flightsFromKrakow = new ArrayList<>();
        flightsFromKrakow.add(new ArrivalAirport("Wroclaw"));
        flightsFromKrakow.add(new ArrivalAirport("Lodz"));
        flightsFromKrakow.add(new ArrivalAirport("Warsaw"));

        List<ArrivalAirport> flightsFromWroclaw = new ArrayList<>();
        flightsFromWroclaw.add(new ArrivalAirport("Warsaw"));
        flightsFromWroclaw.add(new ArrivalAirport("Gdansk"));
        flightsFromWroclaw.add(new ArrivalAirport("Krakow"));

        List<ArrivalAirport> flightsFromGdansk = new ArrayList<>();
        flightsFromGdansk.add(new ArrivalAirport("Warsaw"));
        flightsFromGdansk.add(new ArrivalAirport("Krakow"));

        List<ArrivalAirport> flightsFromLodz = new ArrayList<>();
        flightsFromLodz.add(new ArrivalAirport("Krakow"));

        Map<DepartureAirport, List<ArrivalAirport>> flightsMap = new HashMap<>();
        flightsMap.put(new DepartureAirport("Warsaw"), flightsFromWarsaw);
        flightsMap.put(new DepartureAirport("Krakow"), flightsFromKrakow);
        flightsMap.put(new DepartureAirport("Wroclaw"), flightsFromWroclaw);
        flightsMap.put(new DepartureAirport("Gdansk"), flightsFromGdansk);
        flightsMap.put(new DepartureAirport("Lodz"), flightsFromLodz);

        return new FlightsMap(flightsMap);
    }
}
