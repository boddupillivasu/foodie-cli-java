package com.foodiecliapp.repo;
import com.foodiecliapp.factory.Factory;
import com.foodiecliapp.model.Dish;
import com.foodiecliapp.utill.CsvReader;

import java.util.List;
import java.util.Optional;

public class DishRepository {
    List<Dish> dishList;

    public DishRepository() {
        this.dishList = Factory.getCsvReader().readDishesFromCsv();
    }

    public List<Dish> getDishList() {
        return this.dishList;
    }

    public Dish saveDish(Dish dish) {
        this.dishList.add(dish);
        return dish;
    }

    public Optional<Dish> findDishById(String id) {
        return this.dishList.stream().filter(dish -> dish.getId().equals(id)).findFirst();
    }

    public Dish updateDish(Dish dishToBeUpdated) {
        Optional<Dish> dishOptional = this.dishList.stream().filter(dish -> dish.getId().equals(dishToBeUpdated.getId()))
                .findFirst()
                .map(dish -> {
                    dish.setName(dishToBeUpdated.getName())
                            .setPrice(dishToBeUpdated.getPrice())
                            .setDescription(dishToBeUpdated.getDescription());
                    return dish;
                });
        return dishOptional.orElse(null);
    }

    public void deleteDish(Dish dish){
        this.dishList.remove(dish);
    }
}
