package com.kodilla.good.patterns.food.company;

import java.util.List;

public interface OrderRepository {

    boolean createToSent(Order order, List<Product> productList);
}
