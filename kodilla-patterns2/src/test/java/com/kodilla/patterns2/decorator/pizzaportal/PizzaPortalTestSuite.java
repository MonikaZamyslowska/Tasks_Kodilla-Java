package com.kodilla.patterns2.decorator.pizzaportal;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaPortalTestSuite {
    @Test
    public void testStandardPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new StandardPizzaOrder();
        //When
        double totalCost = theOrder.getCost();
        //Then
        assertEquals(15, totalCost, 0.1);
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
        double totalCost = theOrder.getCost();
        //Then
        assertEquals(20, totalCost, 0.1);
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
        double totalCost = theOrder.getCost();
        //Then
        assertEquals(25, totalCost, 0.1);
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
        double totalCost = theOrder.getCost();
        //Then
        assertEquals(25, totalCost, 0.1);
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
        double totalCost = theOrder.getCost();
        //Then
        assertEquals(30, totalCost, 0.1);
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
