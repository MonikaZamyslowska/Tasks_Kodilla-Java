package com.kodilla.good.patterns.food.company;

public class OrderProcess {
    InformationService informationService;
    OrderService orderService;
    OrderRepository orderRepository;

    public OrderProcess(final InformationService informationService, final OrderService orderService,
                    final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(Order order) {
        boolean isCreated = orderService.isCreated(order.getDateOrder(), order.getMaxSentDate(), order.getCustomer(),
                order.getOrderNumber());
        if (isCreated) {
            informationService.information(order);
            orderRepository.createToSent(order, order.getProductList());
            return new OrderDto(order, true);
        } else {
            return new OrderDto(order, false);
        }
    }
}
