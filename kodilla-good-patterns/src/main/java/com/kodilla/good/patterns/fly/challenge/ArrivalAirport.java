package com.kodilla.good.patterns.fly.challenge;

import java.util.Objects;

public class ArrivalAirport {
    private String arrivalCity;

    public ArrivalAirport(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrivalAirport)) return false;
        ArrivalAirport that = (ArrivalAirport) o;
        return Objects.equals(getArrivalCity(), that.getArrivalCity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getArrivalCity());
    }

    @Override
    public String toString() {
        return "Arrival Airport: " + arrivalCity;
    }
}
