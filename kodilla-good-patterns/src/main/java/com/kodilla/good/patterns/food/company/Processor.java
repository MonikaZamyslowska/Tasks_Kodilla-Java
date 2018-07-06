package com.kodilla.good.patterns.food.company;

public class Processor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderStatus orderStatus;

    public Processor(InformationService informationService) {
        this.informationService = informationService;
    }

    public OrderDTO process(Order order) {

        boolean isOrder = orderService.createdOrder(order.getCustomer(), order.getProductList(), order.getDateOrder());

        if (isOrder) {
            informationService.information(order.getCustomer(), order.getProductList());
            orderStatus.createOrder(order.getCustomer(), order.getProductList(), order.getDateOrder());
            return new OrderDTO(order.getCustomer(), order.getProductList(), true);
        } else {
            return new OrderDTO(order.getCustomer(), order.getProductList(), false);
        }
    }
}
