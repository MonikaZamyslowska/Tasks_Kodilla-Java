package com.kodilla.good.patterns.food.company;


public class ExtraFoodInformation implements InformationService{
    Order order;

    @Override
    public void information(Order order) {
        System.out.println("You`re order: " + order + ".");
    }
}
