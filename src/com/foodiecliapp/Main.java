package com.foodiecliapp;

import com.foodiecliapp.utill.CsvReader;

public class Main {

    public static void main(String[] args) {

        CsvReader csvReader = new CsvReader();
        System.out.println(csvReader.readCustomersFromCsv());
    }
}
