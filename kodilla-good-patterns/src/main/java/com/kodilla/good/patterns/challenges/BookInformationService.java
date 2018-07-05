package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookInformationService implements OrderService {
    @Override
    public boolean order(User user, Product product, LocalDateTime localDateTime) {
        return true;
    }
}
