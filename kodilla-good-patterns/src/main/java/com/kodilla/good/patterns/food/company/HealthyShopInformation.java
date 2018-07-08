package com.kodilla.good.patterns.food.company;

public class HealthyShopInformation implements InformationService{

    @Override
    public void information(Order order) {
        System.out.println(order);
        System.out.println("ESPECIALLY for you, ONE GLUTEN FREE bread!!");
    }
}
