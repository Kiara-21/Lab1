package com.mycompany.restaurantmanagementjava;

public class Position {
    private int positionID;
    private String title;
    private double salary;
    private String responsibilities;
    private String requirements;

    public Position(int positionID, String title, double salary) {
        this.positionID = positionID;
        this.title = title;
        this.salary = salary;
    }

    public String getPositionInfo() {
        return "Position: " + title + ", Salary: " + salary;
    }

    // Getters and setters
    // ...
}
