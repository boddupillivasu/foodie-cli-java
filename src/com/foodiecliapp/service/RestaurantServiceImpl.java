package com.foodiecliapp.service;

import com.foodiecliapp.exception.DishNotFoundExcepton;
import com.foodiecliapp.exception.RestaurantExitsException;
import com.foodiecliapp.exception.RestaurantNotFoundException;
import com.foodiecliapp.model.Dish;
import com.foodiecliapp.model.Restaurant;
import com.foodiecliapp.repo.RestaurantRepository;

import java.util.List;
import java.util.Optional;

public class RestaurantServiceImpl implements RestaurantService {

    @Override
    public Restaurant save(Restaurant restaurant) throws RestaurantExitsException {
        return null;
    }

    @Override
    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException {
        return null;
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) throws RestaurantNotFoundException {
        return null;
    }

    @Override
    public void deleteRestaurant(String id) throws RestaurantNotFoundException {

    }

    @Override
    public List<Dish> getDishItems(String id) throws RestaurantNotFoundException, DishNotFoundExcepton {
        return List.of();
    }
}
