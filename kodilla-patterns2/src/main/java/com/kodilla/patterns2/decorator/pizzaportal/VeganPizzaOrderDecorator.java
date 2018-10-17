package com.kodilla.patterns2.decorator.pizzaportal;

public class VeganPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    protected VeganPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + vegan cheese, mushrooms, spinach, sunflower seeds";
    }
}
