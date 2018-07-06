package com.kodilla.good.patterns.food.company;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    LocalDateTime dateOrder;
    Customer customer;
    List<Product> productList;

    public Order(final LocalDateTime dateOrder, final Customer customer, final List<Product> productList) {
        this.dateOrder = dateOrder;
        this.customer = customer;
        this.productList = productList;
    }
}
