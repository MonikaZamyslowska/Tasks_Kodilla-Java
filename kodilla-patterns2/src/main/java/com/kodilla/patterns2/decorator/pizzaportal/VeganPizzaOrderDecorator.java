package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.BigDecimal;

public class VeganPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    protected VeganPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + vegan cheese, mushrooms, spinach, sunflower seeds";
    }
}
