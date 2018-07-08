package com.kodilla.good.patterns.food.company;

import java.time.LocalDateTime;

public class AllService implements OrderService {

    @Override
    public boolean isCreated(LocalDateTime dateOrder, LocalDateTime maxSentDate, Customer customer, int orderNumber) {
        return true;
    }
}
