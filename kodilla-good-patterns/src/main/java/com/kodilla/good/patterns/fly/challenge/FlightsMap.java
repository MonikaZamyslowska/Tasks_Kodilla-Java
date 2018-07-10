package com.kodilla.good.patterns.fly.challenge;

import java.util.Map;

public final class FlightsMap {
    private Map<Airport, Airport> flight;

    public FlightsMap(Map<Airport, Airport> flight) {
        this.flight = flight;
    }

    public Map<Airport, Airport> getFlight() {
        return flight;
    }

}
