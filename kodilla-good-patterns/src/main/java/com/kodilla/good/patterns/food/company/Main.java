package com.kodilla.good.patterns.food.company;

public class Main {
    public static void main(String[] arg) {
        OrderCreator orderCreator = new OrderCreator();
        Order order = orderCreator.createOrder();

        Processor processor = new Processor(new MailInformation());
        processor.process(order);

    }
}
