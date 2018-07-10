package com.kodilla.good.patterns.fly.challenge;

import java.util.List;
import java.util.Map;

public final class FlightsMap {
    private Map<Airport, List<Airport>> flight;

    public FlightsMap(Map<Airport, List<Airport>> flight) {
        this.flight = flight;
    }

    public Map<Airport, List<Airport>> getFlight() {
        return flight;
    }

}
