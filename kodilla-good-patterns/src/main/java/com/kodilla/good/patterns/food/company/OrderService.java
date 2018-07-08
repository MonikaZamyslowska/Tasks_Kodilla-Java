package com.kodilla.good.patterns.food.company;

import java.time.LocalDateTime;

public interface OrderService {
    boolean isCreated(LocalDateTime dateOrder, LocalDateTime maxSentDate, Customer customer, int orderNumber);
}
