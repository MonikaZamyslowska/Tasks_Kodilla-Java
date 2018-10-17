package com.kodilla.patterns2.decorator.pizzaportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaPortalTestSuite {
    @Test
    public void testStandardPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        //When
        BigDecimal totalCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), totalCost);
    }

    @Test
    public void testStandardPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce", description);
    }

    @Test
    public void testHawaiianPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        theOrder = new HawaiianPizzaOrderDecorator(theOrder);
        //When
        BigDecimal totalCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), totalCost);
    }

    @Test
    public void testHawaiianPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        theOrder = new HawaiianPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce + mozzarella, pineapple, ham", description);
    }

    @Test
    public void testVeganPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        theOrder = new VeganPizzaOrderDecorator(theOrder);
        //When
        BigDecimal totalCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), totalCost);
    }

    @Test
    public void testVeganPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        theOrder = new VeganPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce + vegan cheese, mushrooms, spinach, sunflower seeds",
                description);
    }

    @Test
    public void testSpicyPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        theOrder = new SpicyPizzaOrderDecorator(theOrder);
        //When
        BigDecimal totalCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), totalCost);
    }

    @Test
    public void testSpicyPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        theOrder = new SpicyPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce + mozzarella, hot chili peppers, salami, jalapeno, olive",
                description);
    }

    @Test
    public void testOrderWithDrinkGetCost() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        theOrder = new SpicyPizzaOrderDecorator(theOrder);
        theOrder = new DrinkOrderDecorator(theOrder);
        //When
        BigDecimal totalCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(30), totalCost);
    }

    @Test
    public void testOrderWithDrinkGetDescription() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        theOrder = new SpicyPizzaOrderDecorator(theOrder);
        theOrder = new DrinkOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce + mozzarella, hot chili peppers, salami, jalapeno, olive + drink",
                description);
    }
}
