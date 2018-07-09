package com.kodilla.good.patterns.fly.challenge;

import java.util.List;
import java.util.Map;

public final class FlightsMap {
    private Map<DepartureAirport, List<ArrivalAirport>> flight;

    public FlightsMap(Map<DepartureAirport, List<ArrivalAirport>> flight) {
        this.flight = flight;
    }

    public Map<DepartureAirport, List<ArrivalAirport>> getFlight() {
        return flight;
    }

    @Override
    public String toString() {
        return "FlightsMap{" +
                "flight=" + flight +
                '}';
    }
}
