package com.foodiecliapp;



import com.foodiecliapp.ui.Menu;


public class Main {

    public static void main(String[] args) {


        //in this main method are used to check whether the file read or not
        /*CsvReader csvReader = new CsvReader();

        System.out.println(csvReader.readCustomersFromCsv());
        System.out.println(csvReader.readDishesFromCsv());
        System.out.println(csvReader.readRestaurantsFromCsv());*/

        //create instance for customer repo and display customer details

      //  CustomerRepository customerRepository = new CustomerRepository();
        //System.out.println(customerRepository.getAllCustomers());

        //create instance for dish repo and display dish details
        //DishRepository dishRepository = new DishRepository();
    //    System.out.println(dishRepository.getAllDishes());


        // here the diplay menu is the method for menu class
            Menu menu = new Menu();
            menu.displayMenu();

    }
}
