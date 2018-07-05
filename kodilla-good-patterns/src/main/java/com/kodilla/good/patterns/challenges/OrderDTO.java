package com.kodilla.good.patterns.challenges;

public class OrderDTO {
    public User user;
    public Product product;
    public boolean isOrder;

    public OrderDTO(User user, Product product, boolean isOrder) {
        this.user = user;
        this.product = product;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
