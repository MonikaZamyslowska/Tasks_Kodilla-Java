package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        List<Continent> theWorld = new ArrayList<>();
        List<Country> theAsianCountries = new ArrayList<>();
        List<Country> theAustraliaCountries = new ArrayList<>();
        List<Country> theSouthAmericaCountries = new ArrayList<>();
        // Countries on the continent of Asia
        theAsianCountries.add(new Country("Russia", new BigDecimal("578645348")));
        theAsianCountries.add(new Country("Syria", new BigDecimal("5468452486")));
        theAsianCountries.add(new Country("China", new BigDecimal("985486454164")));
        //Countries on the continent of Australia
        theAustraliaCountries.add(new Country("New Zeleand", new BigDecimal("548643548")));
        theAsianCountries.add(new Country("Samoa", new BigDecimal("32458546")));
        //Countries on the continent of South America
        theSouthAmericaCountries.add(new Country("Chile", new BigDecimal("235646894")));
        theSouthAmericaCountries.add(new Country("Venezuela", new BigDecimal("348547684")));
        //Continents in the World
        theWorld.add(new Continent(theAsianCountries));
        theWorld.add(new Continent(theAustraliaCountries));
        theWorld.add(new Continent(theSouthAmericaCountries));

        //When
        World world = new World(theWorld);
        BigDecimal populations = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulations = new BigDecimal("992698848670");
        Assert.assertEquals(expectedPopulations, populations);
    }
}
