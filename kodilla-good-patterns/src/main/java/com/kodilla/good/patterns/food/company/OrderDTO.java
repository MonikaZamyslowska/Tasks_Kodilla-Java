package com.kodilla.good.patterns.food.company;

import java.util.List;

public class OrderDTO {

    public Customer customer;
    public List<Product> list;
    public boolean isSent;

    public OrderDTO(Customer customer, List<Product> list, boolean isSent) {
        this.customer = customer;
        this.list = list;
        this.isSent = isSent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getList() {
        return list;
    }

    public boolean isSent() {
        return isSent;
    }
}
