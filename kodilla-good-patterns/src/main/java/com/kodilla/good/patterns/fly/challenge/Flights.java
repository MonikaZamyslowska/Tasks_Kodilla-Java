package com.kodilla.good.patterns.fly.challenge;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flights {
    private List<Flight> flightsList = new ArrayList<>();

    public Flights() {
        flightsList.add(new Flight("Wrocław", "Kraków", LocalDateTime.now().plusDays(5)));
        flightsList.add(new Flight("Kraków", "Warszawa", LocalDateTime.now().plusDays(1)));
        flightsList.add(new Flight("Gdańsk", "Wrocław", LocalDateTime.now().plusDays(2)));
        flightsList.add(new Flight("Wrocław", "Łódź", LocalDateTime.now().plusDays(5)));
        flightsList.add(new Flight("Poznań", "Warszawa", LocalDateTime.now().plusDays(2)));
        flightsList.add(new Flight("Gdańsk", "Kraków", LocalDateTime.now().plusDays(1)));
        flightsList.add(new Flight("Kraków", "Poznań", LocalDateTime.now().plusDays(1)));
        flightsList.add(new Flight("Kraków", "Łódź", LocalDateTime.now().plusDays(3)));
        flightsList.add(new Flight("Wrocław", "Warszawa", LocalDateTime.now().plusDays(2)));
        flightsList.add(new Flight("Łódź", "Kraków", LocalDateTime.now().plusDays(3)));
    }

    public List<Flight> getFlightsList() {
        return new ArrayList<>(flightsList);
    }
}
