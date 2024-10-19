package com.foodiecliapp.service;

import com.foodiecliapp.exception.CustomerExitsException;
import com.foodiecliapp.exception.DishExitsException;
import com.foodiecliapp.exception.DishNotFoundException;
import com.foodiecliapp.model.Customer;
import com.foodiecliapp.model.Dish;

import java.util.List;

public interface DishService {

    // interface we used to perform crud operations (create ,read,update,delete)

    public List<Dish> getDishesList();

    public Dish save(Dish dish) throws DishExitsException;
    public Dish getDishById(String id) throws DishNotFoundException;
    public Dish update(Dish dish) throws DishNotFoundException;

    public void delete(String id) throws DishNotFoundException;
}
