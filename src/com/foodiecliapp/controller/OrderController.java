package com.foodiecliapp.controller;

import com.foodiecliapp.exception.OrderExitsException;
import com.foodiecliapp.exception.OrderNotFoundException;
import com.foodiecliapp.model.Order;
import com.foodiecliapp.service.OrderServiceImpl;

import java.util.List;

public class OrderController {

    private OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {

        this.orderService = orderService;
    }

    public List<Order> getOrdersList(){

        return this.orderService.getOrdersList();
    }

    public Order getOrderById(String id) throws OrderNotFoundException {
        return this.orderService.getOrderById(id);
    }

    public Order saveOrder(Order order) throws OrderExitsException{
        return this.orderService.save(order);
    }
}

