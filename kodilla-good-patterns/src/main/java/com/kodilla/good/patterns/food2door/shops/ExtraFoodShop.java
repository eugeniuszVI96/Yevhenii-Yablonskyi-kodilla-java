package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.ProducerRepository;
import com.kodilla.good.patterns.food2door.OrderDto;
import com.kodilla.good.patterns.food2door.interfaces.FoodProducer;
import com.kodilla.good.patterns.food2door.simple.Product;
import java.util.Random;

public class ExtraFoodShop implements FoodProducer {

    private final ProducerRepository producerRepository;
    private static final Random RANDOM = new Random();

    public ExtraFoodShop(ProducerRepository producerRepository) {
        this.producerRepository = producerRepository;
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    public OrderDto process(Product product) {
        Double result = producerRepository.getForProducer(getName(), product.getName());
        if (result == null) {
            return new OrderDto(product, false);
        } else {
            if (result >= product.getQuantity()) {
                return new OrderDto(product, RANDOM.nextBoolean());
            } else {
                return new OrderDto(product, false);
            }
        }
    }

}
