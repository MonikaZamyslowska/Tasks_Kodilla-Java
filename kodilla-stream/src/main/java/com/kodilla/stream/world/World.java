package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class World {
    private final Set<Continent> continents = new HashSet<>();
    private final BigDecimal peopleQuantity;

    public Set<String> getContinents() {
       return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .collect(Collectors.toSet());
    }

    public BigDecimal getPeopleQuantity(Country populations) {
        return BigDecimal peopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries())
                .reduce(BigDecimal.ZERO, )
    }

}
