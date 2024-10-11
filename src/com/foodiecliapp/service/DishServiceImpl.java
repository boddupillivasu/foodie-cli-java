package com.foodiecliapp.service;

import com.foodiecliapp.exception.CustomerExitsException;
import com.foodiecliapp.exception.DishExitsException;
import com.foodiecliapp.model.Customer;
import com.foodiecliapp.model.Dish;
import com.foodiecliapp.repo.CustomerRepo;
import com.foodiecliapp.repo.DishRepo;

import java.util.Optional;


public class DishServiceImpl {
    private DishRepo dishRepo;

    public DishServiceImpl(DishRepo dishRepo) {
        this.dishRepo = dishRepo;
    }
  public Dish save(Dish dish) throws DishExitsException {

        Optional<Dish> customerById;
        customerById = this.dishRepo.findDishById(dish.getId());

        if (customerById.isPresent())
            throw  new DishExitsException("customer already exits this id:"+dish.getId());
        return this.save(dish);
    }

}
