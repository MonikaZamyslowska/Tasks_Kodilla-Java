package com.kodilla.good.patterns.food.company;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private LocalDateTime dateOrder;
    private LocalDateTime maxSentDate;
    private Customer customer;
    private List<Product> productList;
    private int orderNumber;

    public Order(final LocalDateTime dateOrder, final LocalDateTime maxSentDate, final Customer customer,
                 final List<Product> productList, final int orderNumber) {
        this.dateOrder = dateOrder;
        this.maxSentDate = maxSentDate;
        this.customer = customer;
        this.productList = productList;
        this.orderNumber = orderNumber;
    }

    public LocalDateTime getDateOrder() {
        return dateOrder;
    }

    public LocalDateTime getMaxSentDate() {
        return maxSentDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "dateOrder=" + dateOrder +
                ", maxSentDate=" + maxSentDate +
                ", customer=" + customer +
                ", productList=" + productList +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
