#include "Employee.h"
#include <iostream>

Employee::Employee(int id, const std::string& name) 
    : employeeID(id), fullName(name) {}

std::string Employee::getEmployeeInfo() const {
    return "ID: " + std::to_string(employeeID) + ", Name: " + fullName;
}

std::vector<Order*> Employee::getAssignedOrders() const {
    return assignedOrders;
}
