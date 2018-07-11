package com.kodilla.good.patterns.fly.challenge;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flights {
    private List<Airport> flightsList = new ArrayList<>();

    public Flights() {
        flightsList.add(new Airport("Wrocław", "Kraków", LocalDateTime.now().plusDays(5)));
        flightsList.add(new Airport("Kraków", "Warszawa", LocalDateTime.now().plusDays(1)));
        flightsList.add(new Airport("Gdańsk", "Wrocław", LocalDateTime.now().plusDays(2)));
        flightsList.add(new Airport("Wrocław", "Łódź", LocalDateTime.now().plusDays(5)));
        flightsList.add(new Airport("Poznań", "Warszawa", LocalDateTime.now().plusDays(2)));
        flightsList.add(new Airport("Gdańsk", "Kraków", LocalDateTime.now().plusDays(1)));
        flightsList.add(new Airport("Kraków", "Poznań", LocalDateTime.now().plusDays(1)));
        flightsList.add(new Airport("Kraków", "Łódź", LocalDateTime.now().plusDays(3)));
        flightsList.add(new Airport("Wrocław", "Warszawa", LocalDateTime.now().plusDays(2)));
        flightsList.add(new Airport("Łódź", "Kraków", LocalDateTime.now().plusDays(3)));
    }

    public List<Airport> getFlightsList() {
        return new ArrayList<>(flightsList);
    }
}
