package com.foodiecliapp.service;



import com.foodiecliapp.exception.CustomerExitsException;
import com.foodiecliapp.exception.CustomerNotFoundException;
import com.foodiecliapp.model.Customer;

import java.util.List;

public interface CustomerService {

 // interface we used to perform crud operations (create ,read,update,delete)
 //get all customers method

 public Customer save(Customer customer) throws CustomerExitsException;

 public List<Customer> getAllCustomers();

 public Customer getCustomerById(String id) throws CustomerNotFoundException;

 public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;

 public void deleteCustomer(String id) throws CustomerNotFoundException;

 public Customer validateCustomerLogin(String email, String password) throws CustomerNotFoundException;

 public void setCurrentLoggedInCustomer(Customer customer);
 public Customer getCurrentLoggedInCustomer();
}
