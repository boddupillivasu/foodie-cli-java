package com.foodiecliapp.model;

import java.util.List;
import java.util.Objects;

public class Restaurant {
     /*
    add the following properties
    --------------------------------------
    Datatype                  variable
    --------------------------------------
    String                      id
    String                      name
    String                      address
    List<String>                menu
     */

    /*
    1. All the fields should be private
    2. Create only no-arg constructor
    3. Create Getters and Setter methods
    4. Override hashCode() and equals() methods
    5. Override toString() methods
     */

    private String id;
    private String name;
    private String address;
    private List<String> menu;

    public String getId() {
        return id;
    }

    public Restaurant setId(String id) {
        this.id = id;
        return  this;
    }

    public String getName() {
        return name;
    }

    public Restaurant setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Restaurant setAddress(String address) {
        this.address = address;
        return  this;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant resturant = (Restaurant) o;
        return Objects.equals(id, resturant.id) && Objects.equals(name, resturant.name) && Objects.equals(address, resturant.address) && Objects.equals(menu, resturant.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, menu);
    }

    // Overriding toString
    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                '}';
    }
}
