package com.foodiecliapp.controller;

import com.foodiecliapp.exception.CustomerExitsException;
import com.foodiecliapp.exception.DishExitsException;
import com.foodiecliapp.model.Customer;
import com.foodiecliapp.model.Dish;
import com.foodiecliapp.service.CustomerServiceImpl;
import com.foodiecliapp.service.DishServiceImpl;

public class DishController {
    private DishServiceImpl  dishService;


    public DishController(DishServiceImpl dishService) {
        this.dishService = dishService;
    }

    public Dish save(Dish dish) throws DishExitsException {
        return this.dishService.save(dish);
    }
}
