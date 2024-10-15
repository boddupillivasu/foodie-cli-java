package com.foodiecliapp.repo;

import com.foodiecliapp.model.Dish;
import com.foodiecliapp.model.Restaurant;
import com.foodiecliapp.utill.CsvReader;

import java.util.List;

public class RestaurantRepo {
    private List<Restaurant> restaurantList;

    public RestaurantRepo(){

        CsvReader csvReader = new CsvReader();

        this.restaurantList = csvReader.readRestaurantsFromCsv();
    }

    public  List<Restaurant> getAllRestaurants(){
        return  restaurantList;
    }
}
