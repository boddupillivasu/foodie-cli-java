package com.foodiecliapp.exception;

public class RestaurantNotFoundException extends Exception{
    public RestaurantNotFoundException(String message) {
        super(message);
    }
}
