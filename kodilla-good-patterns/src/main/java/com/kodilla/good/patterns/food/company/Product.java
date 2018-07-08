package com.kodilla.good.patterns.food.company;

public class Product {
    private String tag;
    private String productName;
    private double quantity;

    public Product(final String tag, final String productName, final double quantity) {
        this.tag = tag;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getTag() {
        return tag;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "{" +
                "tag='" + tag + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
