package com.mycompany.restaurantmanagementjava;

import java.util.*;

public class Employee {
    private int employeeID;
    private String fullName;
    private String birthDate;
    private String gender;
    private String address;
    private String phone;
    private String passport;
    private Position position;
    private Collection<Order> assignedOrders;

    public Employee(int employeeID, String fullName) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.assignedOrders = new ArrayList<>();
    }

    public String getEmployeeInfo() {
        return "Employee ID: " + employeeID + ", Name: " + fullName;
    }

    public List<Order> getAssignedOrders() {
        return new ArrayList<>(assignedOrders);
    }

    public List<Employee> getRestaurantStaff() {
        // Return list of employees - dummy implementation
        return new ArrayList<>();
    }

    // Getters and setters
    // ...
}
