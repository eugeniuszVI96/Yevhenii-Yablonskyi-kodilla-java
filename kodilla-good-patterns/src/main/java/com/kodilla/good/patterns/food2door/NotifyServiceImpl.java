package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.interfaces.NotifyService;

public class NotifyServiceImpl implements NotifyService {

    @Override
    public void notify(OrderDto order) {
        System.out.println(order);
    }
}
