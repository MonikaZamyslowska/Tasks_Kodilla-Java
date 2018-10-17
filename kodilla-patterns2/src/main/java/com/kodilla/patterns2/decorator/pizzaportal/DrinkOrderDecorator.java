package com.kodilla.patterns2.decorator.pizzaportal;

public class DrinkOrderDecorator extends AbstractPizzaOrderDecorator {
    protected DrinkOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + drink";
    }
}
