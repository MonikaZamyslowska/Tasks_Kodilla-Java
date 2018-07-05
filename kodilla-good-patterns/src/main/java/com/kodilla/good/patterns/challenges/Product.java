package com.kodilla.good.patterns.challenges;

public class Product {

    private String productName;
    private int numberAuction;

    public Product(String productName, int numberAuction) {
        this.productName = productName;
        this.numberAuction = numberAuction;
    }

    public String getProductName() {
        return productName;
    }

    public int getNumberAuction() {
        return numberAuction;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", numberAuction=" + numberAuction +
                '}';
    }
}
