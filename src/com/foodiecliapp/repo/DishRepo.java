package com.foodiecliapp.repo;
import com.foodiecliapp.model.Dish;
import com.foodiecliapp.utill.CsvReader;

import java.util.List;

public class DishRepo {
    private List<Dish> dishList;

    public DishRepo(){

        CsvReader csvReader = new CsvReader();

      this.dishList = csvReader.readDishesFromCsv();
    }

    public  List<Dish> getAllDishes(){
        return  dishList;
    }
}
