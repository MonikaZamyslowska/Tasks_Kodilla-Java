package com.kodilla.good.patterns.food.company;

public class GlutenFreeShopInformation implements InformationService{

    Order order;

    @Override
    public void information(Order order) {
        System.out.println("You`re order: " + order + ".");
        System.out.println("ESPECIALLY for you, ONE GLUTEN FREE bread!!");
    }

}
