package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.BigDecimal;

public class HawaiianPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    protected HawaiianPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + mozzarella, pineapple, ham";
    }
}
