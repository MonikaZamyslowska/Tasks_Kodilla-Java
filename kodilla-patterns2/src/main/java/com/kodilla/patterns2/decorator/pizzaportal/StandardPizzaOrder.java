package com.kodilla.patterns2.decorator.pizzaportal;

public class StandardPizzaOrder implements PizzaOrder{
    @Override
    public double getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "Pizza with tomato sauce";
    }
}
