package com.mycompany.restaurantmanagementjava;

import java.util.*;

public class Order {
    private int orderID;
    private String date;
    private String time;
    private int tableNumber;
    private String status;
    private Collection<Employee> assignedEmployees;
    private Collection<Menu> orderedDishes;
    private Collection<Product> includedInOrders;

    public Order(int orderID, String date, String time, int tableNumber) {
        this.orderID = orderID;
        this.date = date;
        this.time = time;
        this.tableNumber = tableNumber;
        this.status = "Pending";
        this.assignedEmployees = new ArrayList<>();
        this.orderedDishes = new ArrayList<>();
        this.includedInOrders = new ArrayList<>();
    }

    public void markAsCompleted() {
        this.status = "Completed";
    }

    public String getOrderDetails() {
        return "Order ID: " + orderID + ", Status: " + status;
    }

    public List<Order> getCompletedOrders() {
        return new ArrayList<>();
    }

    public List<Order> getOrderByTable(int tableNumber) {
        return new ArrayList<>();
    }

    // Getters and setters
    // ...
}
