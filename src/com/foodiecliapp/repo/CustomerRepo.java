package com.foodiecliapp.repo;

import com.foodiecliapp.model.Customer;
import com.foodiecliapp.utill.CsvReader;

import java.util.List;

public class CustomerRepo {

    private List<Customer> customerList;

    public  CustomerRepo(){

        CsvReader csvReader = new CsvReader();

        this.customerList = csvReader.readCustomersFromCsv();
    }

    public  List<Customer> getAllCustomers(){
        return customerList;
    }
}
