package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.shops.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.shops.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.shops.HealthyShop;
import com.kodilla.good.patterns.food2door.shops.BakeryShop;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProducerRepository producerRepository = new ProducerRepository();

        OrderService orderService = new OrderService(
                Arrays.asList(new ExtraFoodShop(producerRepository),
                        new GlutenFreeShop(),
                        new HealthyShop(),
                        new BakeryShop()),
                new NotifyServiceImpl());
        orderService.process(orderRequest);
    }
}
