package com.foodiecliapp.repo;

import com.foodiecliapp.model.Customer;
import com.foodiecliapp.utill.CsvReader;

import java.util.List;
import java.util.Optional;

public class CustomerRepository {
// to get the data from Customer class and store in customerlist
    private List<Customer> customerList;
//method
    public CustomerRepository(){

        // instance for csv reader
        CsvReader csvReader = new CsvReader();

        this.customerList = csvReader.readCustomersFromCsv();
    }

    public  List<Customer> getAllCustomers(){
        return customerList;
    }

    // to save the customer data
    public Customer save(Customer customer){
        this.customerList.add(customer);
        return customer;
    }

    //check the data in optional class
    public Optional<Customer> findCustomerById(String id){
       return this.customerList.stream().filter(customer ->customer.getCustomerId().equals(id)).findFirst();

    }
}
