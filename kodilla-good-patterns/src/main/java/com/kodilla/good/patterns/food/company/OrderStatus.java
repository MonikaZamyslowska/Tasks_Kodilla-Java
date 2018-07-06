package com.kodilla.good.patterns.food.company;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderStatus {

    boolean createOrder(Customer customer, List<Product> products, LocalDateTime dateOrder);
}
