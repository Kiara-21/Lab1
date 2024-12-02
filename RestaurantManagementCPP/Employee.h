#ifndef EMPLOYEE_H
#define EMPLOYEE_H

#include <string>
#include <vector>

// Прототип класу Order
class Order;

class Employee {
private:
    int employeeID;
    std::string fullName;
    std::string birthDate;
    std::string gender;
    std::string address;
    std::string phone;
    std::string passport;
    std::vector<Order*> assignedOrders; 

public:
    Employee(int id, const std::string& name);
    std::string getEmployeeInfo() const;
    std::vector<Order*> getAssignedOrders() const;
};

#endif
