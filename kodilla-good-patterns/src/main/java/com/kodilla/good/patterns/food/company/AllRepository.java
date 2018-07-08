package com.kodilla.good.patterns.food.company;

import java.time.LocalDateTime;
import java.util.List;

public class AllRepository implements OrderRepository {

    @Override
    public boolean createToSent(Order order, List<Product> productList) {
        boolean ready = false;
        for (int i = 0; i < productList.size(); i++) {
            if (order.getProductList().get(i) == productList.get(i)) {
                System.out.println("Order is ready to sent...");
                return ready = true;
            }
        }
        return ready;
    }
}
