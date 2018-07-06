package com.kodilla.good.patterns.food.company;

import java.util.Objects;

public class Product {
    private String tag;
    private String productName;

    public Product(String tag, String productName) {
        this.tag = tag;
        this.productName = productName;
    }

    public String getTag() {
        return tag;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "tag='" + tag + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getTag(), product.getTag()) &&
                Objects.equals(getProductName(), product.getProductName());
    }

}
