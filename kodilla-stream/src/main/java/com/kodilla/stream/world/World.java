package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;


public final class World {
    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return peopleQuantity;
    }

    public List<Continent> getContinents() {
        return continents;
    }


}
