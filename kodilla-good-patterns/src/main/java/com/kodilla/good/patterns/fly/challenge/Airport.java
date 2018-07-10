package com.kodilla.good.patterns.fly.challenge;

import java.util.Objects;

public class Airport {

    private String airportName;

    public Airport(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportName() {
        return airportName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return Objects.equals(getAirportName(), airport.getAirportName());
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "[" + airportName + "]";
    }
}
