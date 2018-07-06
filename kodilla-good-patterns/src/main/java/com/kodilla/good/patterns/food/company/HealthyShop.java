package com.kodilla.good.patterns.food.company;

public class HealthyShop extends Processor {
    InformationService informationService;
    OrderService orderService;
    OrderStatus orderStatus;

    public HealthyShop(InformationService informationService) {
        super(informationService);
    }

    @Override
    public OrderDTO process(Order order) {

        boolean isOrder = orderService.createdOrder(order.getCustomer(), order.getProductList(), order.getDateOrder());

        if (isOrder) {
            System.out.println("-10%");
            informationService.information(order.getCustomer(), order.getProductList());
            orderStatus.createOrder(order.getCustomer(), order.getProductList(), order.getDateOrder());
            return new OrderDTO(order.getCustomer(), order.getProductList(), true);
        } else {
            return new OrderDTO(order.getCustomer(), order.getProductList(), false);
        }
    }
}
