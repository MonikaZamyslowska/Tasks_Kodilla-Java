package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {
    private final Set<Country> countries = new HashSet<>();
    private final BigDecimal populations;

    public BigDecimal getPopulations() {
        return BigDecimal populations = countries.stream()
                .map(country -> country.getPeopleQuantity())
                .forEach();
    }

    public  Set<String> getCountries() {
        return countries.stream()
                .map(country -> country.getNameCountry())
                .collect(Collectors.toSet());
    }

}
