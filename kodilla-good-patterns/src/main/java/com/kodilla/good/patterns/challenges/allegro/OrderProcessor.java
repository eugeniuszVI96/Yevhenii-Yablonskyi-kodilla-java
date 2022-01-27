package com.kodilla.good.patterns.challenges.allegro;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService,
                          OrderService orderService,
                          OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto processor(OrderRequest orderRequest) {
        boolean isSuccessfully = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getTimeOrder());
        if (isSuccessfully) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getTimeOrder());
            return new OrderDto(orderRequest.getProduct(), true);
        }
        else {
            return new OrderDto(orderRequest.getProduct(), false);
        }
    }
}
