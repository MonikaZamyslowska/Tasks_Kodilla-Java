package com.kodilla.good.patterns.food.company;

import java.util.List;

public class MailInformation implements InformationService{

    @Override
    public void information(Customer customer, List<Product> products) {
        System.out.println(customer + "buy" + products);
    }
}
