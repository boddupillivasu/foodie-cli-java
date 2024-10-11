package com.foodiecliapp.service;

import com.foodiecliapp.exception.CustomerExitsException;
import com.foodiecliapp.exception.RestaurantExitsException;
import com.foodiecliapp.model.Customer;
import com.foodiecliapp.model.Restaurant;

public interface RestaurantService {

    public Restaurant save(Restaurant restaurant) throws RestaurantExitsException;
}
