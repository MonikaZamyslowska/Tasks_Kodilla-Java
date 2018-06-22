package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String nameContinent;
    private final Set<Country> countries = new HashSet<>();

    public Continent(final String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public void addCountries(Country country) {
        countries.add(country);
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public Set<Country> getCountries() {
        return countries;
    }
}
