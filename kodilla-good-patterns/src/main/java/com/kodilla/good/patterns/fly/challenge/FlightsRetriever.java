package com.kodilla.good.patterns.fly.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightsRetriever {

    public FlightsMap retrieve() {
        Airport warsaw = new Airport("Warsaw");
        Airport cracow = new Airport("Cracow");
        Airport wroclaw = new Airport("Wroclaw");
        Airport gdansk = new Airport("Gdansk");

        List<Airport> flightWarsaw = new ArrayList<>();
        flightWarsaw.add(cracow);
        flightWarsaw.add(wroclaw);

        List<Airport> flightCracow = new ArrayList<>();
        flightCracow.add(wroclaw);
        flightCracow.add(gdansk);

        List<Airport> flightWroclaw = new ArrayList<>();
        flightWroclaw.add(gdansk);
        flightWroclaw.add(cracow);

        List<Airport> flightGdansk = new ArrayList<>();
        flightGdansk.add(warsaw);



        Map<Airport, List<Airport>> flightsMap = new HashMap<>();
        flightsMap.put(warsaw, flightWarsaw);
        flightsMap.put(cracow, flightCracow);
        flightsMap.put(wroclaw, flightWroclaw);
        flightsMap.put(gdansk, flightGdansk);

        return new FlightsMap(flightsMap);
    }
}
