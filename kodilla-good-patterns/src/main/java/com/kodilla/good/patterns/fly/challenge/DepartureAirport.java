package com.kodilla.good.patterns.fly.challenge;

import java.util.Objects;

public class DepartureAirport {
    private String departureCity;

    public DepartureAirport(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepartureAirport)) return false;
        DepartureAirport that = (DepartureAirport) o;
        return Objects.equals(getDepartureCity(), that.getDepartureCity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDepartureCity());
    }

    @Override
    public String toString() {
        return "Departure Airport: " + departureCity;
    }
}
