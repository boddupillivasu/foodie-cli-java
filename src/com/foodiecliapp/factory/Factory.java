package com.foodiecliapp.factory;


import com.foodiecliapp.controller.CustomerController;
import com.foodiecliapp.controller.DishController;
import com.foodiecliapp.controller.OrderController;
import com.foodiecliapp.controller.RestaurantController;
import com.foodiecliapp.repo.CustomerRepository;
import com.foodiecliapp.repo.DishRepository;
import com.foodiecliapp.repo.OrderRepository;
import com.foodiecliapp.repo.RestaurantRepository;
import com.foodiecliapp.service.CustomerServiceImpl;
import com.foodiecliapp.service.DishServiceImpl;
import com.foodiecliapp.service.OrderServiceImpl;
import com.foodiecliapp.service.RestaurantServiceImpl;
import com.foodiecliapp.utill.CsvReader;

public class Factory {

    public static CsvReader getCsvReader() {
        return Holder.CSV_READER;
    }

    public static CustomerRepository getCustomerRepository() {
        return Holder.CUSTOMER_REPOSITORY;
    }

    public static CustomerServiceImpl getCustomerService() {
        return Holder.CUSTOMER_SERVICE;
    }

    public static CustomerController getCustomerController() {
        return Holder.CUSTOMER_CONTROLLER;
    }

    public static DishRepository getDishRepository() {
        return Holder.DISH_REPOSITORY;
    }

    public static DishServiceImpl getDishService() {
        return Holder.DISH_SERVICE;
    }

    public static DishController getDishController() {
        return Holder.DISH_CONTROLLER;
    }

    public static RestaurantRepository getRestaurantRepository() {
        return Holder.RESTAURANT_REPOSITORY;
    }

    public static RestaurantServiceImpl getRestaurantService() {
        return Holder.RESTAURANT_SERVICE;
    }

    public static RestaurantController getRestaurantController() {
        return Holder.RESTAURANT_CONTROLLER;
    }

    public static OrderRepository getOrderRepository() {
        return Holder.ORDER_REPOSITORY;
    }

    public static OrderServiceImpl getOrderService() {
        return Holder.ORDER_SERVICE;
    }

    public static OrderController getOrderController() {
        return Holder.ORDER_CONTROLLER;
    }

    private static class Holder {

        private static final CsvReader CSV_READER = new CsvReader();

        private static final CustomerRepository CUSTOMER_REPOSITORY = new CustomerRepository();
        private static final CustomerServiceImpl CUSTOMER_SERVICE = new CustomerServiceImpl(CUSTOMER_REPOSITORY);
        private static final CustomerController CUSTOMER_CONTROLLER = new CustomerController(CUSTOMER_SERVICE);

        private static final DishRepository DISH_REPOSITORY = new DishRepository();
        private static final DishServiceImpl DISH_SERVICE = new DishServiceImpl(DISH_REPOSITORY);
        private static final DishController DISH_CONTROLLER = new DishController(DISH_SERVICE);

        private static final RestaurantRepository RESTAURANT_REPOSITORY = new RestaurantRepository();
        private static final RestaurantServiceImpl RESTAURANT_SERVICE = new RestaurantServiceImpl(RESTAURANT_REPOSITORY);
        private static final RestaurantController RESTAURANT_CONTROLLER = new RestaurantController(RESTAURANT_SERVICE);

        private static final OrderRepository ORDER_REPOSITORY = new OrderRepository();
        private static final OrderServiceImpl ORDER_SERVICE = new OrderServiceImpl(ORDER_REPOSITORY);
        private static final OrderController ORDER_CONTROLLER = new OrderController(ORDER_SERVICE);

    }


}