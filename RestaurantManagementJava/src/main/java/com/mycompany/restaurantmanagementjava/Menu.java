package com.mycompany.restaurantmanagementjava;

import java.util.*;

public class Menu {
    private int menuID;
    private String dishName;
    private String description;
    private double price;
    private int preparationTime;
    private Collection<Order> orderedDishes;
    private Collection<Product> usedInDishes;

    public Menu(int menuID, String dishName) {
        this.menuID = menuID;
        this.dishName = dishName;
        this.orderedDishes = new ArrayList<>();
        this.usedInDishes = new ArrayList<>();
    }

    public String getDishInfo() {
        return "Dish: " + dishName + ", Price: " + price;
    }

    public boolean isDishPrepared() {
        return preparationTime == 0;
    }

    public List<Menu> getPendingDishes() {
        return new ArrayList<>();
    }

    // Getters and setters
    // ...
}
