/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurantmanagementjava;

/**
 *
 * @author 41765
 */
public class RestaurantManagementJava {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "John Doe");
        System.out.println(employee.getEmployeeInfo());

        Menu menu = new Menu(1, "Pasta");
        System.out.println(menu.getDishInfo());
    }
}