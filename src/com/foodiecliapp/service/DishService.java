package com.foodiecliapp.service;

import com.foodiecliapp.exception.CustomerExitsException;
import com.foodiecliapp.exception.DishExitsException;
import com.foodiecliapp.model.Customer;
import com.foodiecliapp.model.Dish;

public interface DishService {
    public Dish save(Dish dish) throws DishExitsException;
}
