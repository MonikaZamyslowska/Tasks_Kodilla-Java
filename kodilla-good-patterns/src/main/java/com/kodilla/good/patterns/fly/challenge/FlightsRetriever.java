package com.kodilla.good.patterns.fly.challenge;

import java.util.HashMap;
import java.util.Map;

public class FlightsRetriever {

    public FlightsMap retrieve() {
        Airport warsaw = new Airport("Warsaw");
        Airport cracow = new Airport("Cracow");
        Airport wroclaw = new Airport("Wroclaw");
        Airport gdansk = new Airport("Gdansk");

        Map<Airport, Airport> flightsMap = new HashMap<>();
        flightsMap.put(warsaw, cracow);
        flightsMap.put(cracow, wroclaw);
        flightsMap.put(wroclaw, gdansk);
        flightsMap.put(gdansk, warsaw);
        flightsMap.put(gdansk, cracow);
        flightsMap.put(cracow, warsaw);

        return new FlightsMap(flightsMap);
    }
}
