package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.shops.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.shops.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.shops.HealthyShop;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();

        OrderProcessor orderProcessor = new OrderProcessor(healthyShop);
        orderProcessor.process(orderRequest);
    }
}