package com.kodilla.good.patterns.food.company;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String providerName;
    LocalDateTime dateOrder;
    Customer customer;
    List<Product> productList;

    public Order(String providerName, final LocalDateTime dateOrder, final Customer customer,
                 final List<Product> productList) {
        this.providerName = providerName;
        this.dateOrder = dateOrder;
        this.customer = customer;
        this.productList = productList;
    }

    public String getProviderName() {
        return providerName;
    }

    public LocalDateTime getDateOrder() {
        return dateOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
