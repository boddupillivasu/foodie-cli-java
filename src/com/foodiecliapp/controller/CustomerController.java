package com.foodiecliapp.controller;

import com.foodiecliapp.exception.CustomerExitsException;
import com.foodiecliapp.model.Customer;
import com.foodiecliapp.service.CustomerServiceImpl;

public class CustomerController {

    private CustomerServiceImpl    customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    public Customer save(Customer customer) throws CustomerExitsException{
        return this.customerService.save(customer);
    }
}
