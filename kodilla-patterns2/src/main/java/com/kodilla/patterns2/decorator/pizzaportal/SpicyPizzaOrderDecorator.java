package com.kodilla.patterns2.decorator.pizzaportal;

public class SpicyPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    protected SpicyPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + mozzarella, hot chili peppers, salami, jalapeno, olive";
    }
}
