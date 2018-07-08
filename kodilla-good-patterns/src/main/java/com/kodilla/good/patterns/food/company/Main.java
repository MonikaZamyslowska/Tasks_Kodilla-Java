package com.kodilla.good.patterns.food.company;

public class Main {
    public static void main(String[] arg) {
        OrderCreator orderCreator = new OrderCreator();
        Order order = orderCreator.createOrder();
        OrderProcess orderProcess = new OrderProcess(new HealthyShopInformation(), new AllService(),
                new AllRepository());
        orderProcess.process(order);

        System.out.println();

        OrderCreator orderCreator1 = new OrderCreator();
        Order order1 = orderCreator1.createOrder();
        OrderProcess orderProcess1 = new OrderProcess(new HealthyShopInformation(), new AllService(),
                new AllRepository());
        orderProcess1.process(order1);

        System.out.println();

        OrderCreator orderCreator2 = new OrderCreator();
        Order order2 = orderCreator2.createOrder();
        OrderProcess orderProcess2 = new OrderProcess(new HealthyShopInformation(), new AllService(),
                new AllRepository());
        orderProcess2.process(order2);

    }
}
