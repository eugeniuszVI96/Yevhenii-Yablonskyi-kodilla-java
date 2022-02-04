package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.interfaces.FoodProducer;
import com.kodilla.good.patterns.food2door.interfaces.NotifyService;
import java.util.List;

public class OrderService {

    private final List<FoodProducer> foodProducers;
    private final NotifyService notifyService;

    public OrderService(List<FoodProducer> foodProducers, NotifyService notifyService) {
        this.foodProducers = foodProducers;
        this.notifyService = notifyService;
    }

    public void process(final OrderRequest orderRequest) {
        FoodProducer producer = foodProducers.stream()
                .filter(p -> p.getName().equals(orderRequest.getProducer()))
                .findAny()
                .orElseThrow(() -> new IllegalStateException("Product name " + orderRequest.getProducer() + " is not operated"));
        OrderDto result = producer.process(orderRequest.getProduct());
        notifyService.notify(result);
    }
}
