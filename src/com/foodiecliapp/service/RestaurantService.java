package com.foodiecliapp.service;

import com.foodiecliapp.exception.CustomerExitsException;
import com.foodiecliapp.exception.DishNotFoundExcepton;
import com.foodiecliapp.exception.RestaurantExitsException;
import com.foodiecliapp.exception.RestaurantNotFoundException;
import com.foodiecliapp.model.Customer;
import com.foodiecliapp.model.Dish;
import com.foodiecliapp.model.Restaurant;

import java.util.List;

public interface RestaurantService {

    public Restaurant save(Restaurant restaurant) throws RestaurantExitsException;
    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException;

    public Restaurant updateRestaurant(Restaurant restaurant) throws RestaurantNotFoundException;

    public void deleteRestaurant(String id) throws RestaurantNotFoundException;

    public List<Dish> getDishItems(String id) throws RestaurantNotFoundException, DishNotFoundExcepton;
}

