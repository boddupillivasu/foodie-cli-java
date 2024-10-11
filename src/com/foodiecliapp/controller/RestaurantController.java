package com.foodiecliapp.controller;

import com.foodiecliapp.exception.DishExitsException;
import com.foodiecliapp.exception.RestaurantExitsException;
import com.foodiecliapp.model.Dish;
import com.foodiecliapp.model.Restaurant;
import com.foodiecliapp.service.DishServiceImpl;
import com.foodiecliapp.service.RestaurantServiceImpl;

public class RestaurantController {


        private RestaurantServiceImpl restaurantService;


    public RestaurantController(RestaurantServiceImpl restaurantService) {
        this.restaurantService = restaurantService;
    }

    public Restaurant save(Restaurant restaurant) throws RestaurantExitsException {
            return this.restaurantService.save(restaurant);
        }
}
