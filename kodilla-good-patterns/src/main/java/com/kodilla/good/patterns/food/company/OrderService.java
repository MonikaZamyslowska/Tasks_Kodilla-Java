package com.kodilla.good.patterns.food.company;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {

    boolean createdOrder(Customer customer, List<Product> products, LocalDateTime dateOrder);
}
