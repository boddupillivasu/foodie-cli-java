package com.foodiecliapp.controller;

import com.foodiecliapp.exception.DishExitsException;
import com.foodiecliapp.exception.RestaurantExitsException;
import com.foodiecliapp.exception.RestaurantNotFoundException;
import com.foodiecliapp.model.Dish;
import com.foodiecliapp.model.Restaurant;
import com.foodiecliapp.service.DishServiceImpl;
import com.foodiecliapp.service.RestaurantServiceImpl;

import java.util.List;

public class RestaurantController {


    private final RestaurantServiceImpl restaurantService;

    public RestaurantController(RestaurantServiceImpl restaurantService) {
        this.restaurantService = restaurantService;
    }

    public List<Restaurant> getRestaurantList(){
        return this.restaurantService.getRestaurantList();
    }

    public Restaurant saveRestaurant(Restaurant restaurant) throws RestaurantExitsException {
        return this.restaurantService.save(restaurant);
    }

    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException{
        return this.restaurantService.getRestaurantById(id);
    }

    public Restaurant updateRestaurant(Restaurant restaurant) throws RestaurantNotFoundException{
        return this.restaurantService.updateRestaurant(restaurant);
    }

    public void deleteRestaurant(String id) throws RestaurantNotFoundException {
        this.restaurantService.deleteRestaurant(id);
    }
}