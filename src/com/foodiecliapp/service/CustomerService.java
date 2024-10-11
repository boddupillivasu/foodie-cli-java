package com.foodiecliapp.service;

import com.foodiecliapp.exception.CustomerExitsException;
import com.foodiecliapp.model.Customer;

public interface CustomerService {

    public  Customer save(Customer customer) throws CustomerExitsException;
}
