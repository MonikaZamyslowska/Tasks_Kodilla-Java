package com.kodilla.good.patterns.food.company;

public class OrderDto {

    Order order;
    boolean readyToSent;

    public OrderDto(Order order, boolean readyToSent) {
        this.order = order;
        this.readyToSent = readyToSent;
    }
}
