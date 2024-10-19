package com.foodiecliapp.service;

import com.foodiecliapp.exception.DishNotFoundException;
import com.foodiecliapp.exception.RestaurantExitsException;
import com.foodiecliapp.exception.RestaurantNotFoundException;
import com.foodiecliapp.factory.Factory;
import com.foodiecliapp.model.Dish;
import com.foodiecliapp.model.Restaurant;
import com.foodiecliapp.repo.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RestaurantServiceImpl implements RestaurantService {


    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Restaurant> getRestaurantList() {
        return this.restaurantRepository.getRestaurantList();
    }

    @Override
    public Restaurant save(Restaurant restaurant) throws RestaurantExitsException {
        Optional<Restaurant> restaurantById = this.restaurantRepository.findRestaurantById(restaurant.getId());
        if (restaurantById.isPresent())
            throw new RestaurantExitsException("Restaurant Already Exists with this Id  :" + restaurant.getId());
        return this.restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException {
        Optional<Restaurant> restaurantById = this.restaurantRepository.findRestaurantById(id);
        if (restaurantById.isEmpty())
            throw new RestaurantNotFoundException("Restaurant Not Found with this Id  :" + id);
        return restaurantById.get();

    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) throws RestaurantNotFoundException {
        Optional<Restaurant> restaurantById = this.restaurantRepository.findRestaurantById(restaurant.getId());
        if (restaurantById.isEmpty())
            throw new RestaurantNotFoundException("Restaurant Not Found with this Id  :" + restaurant.getId());
        return this.restaurantRepository.updateRetaurant(restaurant);
    }


    @Override
    public void deleteRestaurant(String id) throws RestaurantNotFoundException {
        Optional<Restaurant> restaurantById = this.restaurantRepository.findRestaurantById(id);
        if (restaurantById.isEmpty())
            throw new RestaurantNotFoundException("Restaurant Not Found with this Id  :" + id);
        this.restaurantRepository.deleteRestaurant(restaurantById.get());
    }

    @Override
    public List<Dish> getDishItems(String id) throws RestaurantNotFoundException, DishNotFoundException {
        Optional<Restaurant> restaurantById = this.restaurantRepository.findRestaurantById(id);
        if (restaurantById.isEmpty())
            throw new RestaurantNotFoundException("Restaurant Not Found with this Id  :" + id);
        List<Dish> dishList = new ArrayList<>();
        Restaurant restaurant = restaurantById.get();
        List<String> dishIds = restaurant.getMenu();
        DishService dishService = Factory.getDishService();
        for (String dishId : dishIds) {
            Dish dish = dishService.getDishById(dishId);
            dishList.add(dish);
        }
        return dishList;
    }
}