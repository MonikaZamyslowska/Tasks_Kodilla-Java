package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.BigDecimal;

public class SpicyPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    protected SpicyPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + mozzarella, hot chili peppers, salami, jalapeno, olive";
    }
}
