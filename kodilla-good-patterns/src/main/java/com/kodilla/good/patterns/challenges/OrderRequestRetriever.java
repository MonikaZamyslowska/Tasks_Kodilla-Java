package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retriever() {
        User user = new User("Alibaba");
        Product product = new Product("Book, \"ASAP\"", 541785);

        LocalDateTime orderDate = LocalDateTime.of(2018, 07, 05, 12, 22);

        return new OrderRequest(user, product, orderDate);

    }
}
