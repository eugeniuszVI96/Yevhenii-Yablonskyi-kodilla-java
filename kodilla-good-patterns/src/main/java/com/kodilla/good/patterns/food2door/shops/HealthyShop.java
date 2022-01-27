package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.*;
import com.kodilla.good.patterns.food2door.interfaces.InformationService;
import com.kodilla.good.patterns.food2door.interfaces.Manufacturer;
import com.kodilla.good.patterns.food2door.interfaces.OrderRepository;
import com.kodilla.good.patterns.food2door.interfaces.OrderService;
import com.kodilla.good.patterns.food2door.simple.classes.Product;
import com.kodilla.good.patterns.food2door.simple.classes.Supplier;

public class HealthyShop implements Manufacturer, InformationService, OrderRepository, OrderService {

    @Override
    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = order(orderRequest.getSupplier(), orderRequest.getProduct());

        if (isOrdered) {
            inform(orderRequest.getSupplier());
            createOrder(orderRequest.getSupplier(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getSupplier(),true);
        } else {
            return new OrderDto(orderRequest.getSupplier(),false);
        }
    }

    @Override
    public void inform(Supplier supplier) {
        System.out.println("Order confirmation has been sent to " + supplier.getName());
    }

    @Override
    public boolean createOrder(Supplier supplier, Product product) {
        return true;
    }

    @Override
    public boolean order(Supplier supplier, Product product) {
        System.out.println("New order has been created.");
        System.out.println("Order details:");
        System.out.println("\tProduct: " + product.getName());
        System.out.println("\tBuyer: " + supplier.getName());
        System.out.println();
        return true;
    }
}