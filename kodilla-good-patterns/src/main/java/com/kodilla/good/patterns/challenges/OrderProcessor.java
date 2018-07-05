package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, OrderRepository orderRepository,
                          OrderService orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDTO process (OrderRequest orderRequest) {
        boolean isRented = orderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getOrderDate());

        if (isRented) {
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getOrderDate());
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
