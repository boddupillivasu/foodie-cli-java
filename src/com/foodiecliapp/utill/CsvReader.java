package com.foodiecliapp.utill;

import com.foodiecliapp.model.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    //read the data from csv files and create the objects

    public List<Customer> readCustomersFromCsv() {

        List<Customer> customerList = new ArrayList<>();

        String customerCsvFilePath ="D:\\java-cli-app-java\\Data\\customers.csv";
        //try -with -resourse

        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(customerCsvFilePath))) {
            String csvSplit = ",";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] split = line.split(csvSplit);

                Customer customer = new Customer();
                customer.setId(split[0])
                        .setName(split[1])
                        .setEmail(split[2])
                        .setPassword(split[3]);
                customerList.add(customer);
            }
        } catch (IOException e) {
            System.out.println("file not found in the path:" + customerCsvFilePath);
            System.exit(0);
            e.printStackTrace();

        }
        return customerList;
    }

}
