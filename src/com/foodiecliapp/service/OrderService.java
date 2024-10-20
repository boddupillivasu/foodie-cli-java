package com.foodiecliapp.service;

import com.foodiecliapp.exception.OrderExitsException;
import com.foodiecliapp.exception.OrderNotFoundException;
import com.foodiecliapp.model.Order;

import java.util.List;

public interface OrderService {

    public List<Order> getOrdersList();
    public Order getOrderById(String id) throws OrderNotFoundException;
    public Order save(Order order) throws OrderExitsException;

}
