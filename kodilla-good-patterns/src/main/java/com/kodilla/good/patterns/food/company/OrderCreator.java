package com.kodilla.good.patterns.food.company;

import com.kodilla.good.patterns.challenges.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderCreator {

    public Order createOrder() {
        String providerName = "ExtraFoodShop";

        LocalDateTime dateOrder = LocalDateTime.of(2018, 07, 06, 11, 32);

        Customer customer = new Customer("Lukas", "Goodman", "London SW1P 4DF, 238 King Street",
                24589647);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Ldxe3", "Carrot", 0.5));
        productList.add(new Product("ljwe6", "Plum", 1));
        productList.add(new Product("lj78c", "Apple", 3.5));

        return new Order(providerName, dateOrder, customer, productList);
    }
}
