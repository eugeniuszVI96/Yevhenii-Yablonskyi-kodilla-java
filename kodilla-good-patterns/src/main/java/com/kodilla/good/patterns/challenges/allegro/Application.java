package com.kodilla.good.patterns.challenges.allegro;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
        OrderRequest orderRequest = orderRequestRetrieve.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(),
                new ProductOrderService(),
                new SellerOrderRepository());
        orderProcessor.processor(orderRequest);
    }
}
