package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String nameCountry;
    private final BigDecimal peopleQuantity;

    public Country(final String nameCountry, final BigDecimal peopleQuantity) {
        this.nameCountry = nameCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country contry = (Country) o;
        return Objects.equals(getNameCountry(), contry.getNameCountry());
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
