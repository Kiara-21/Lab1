#ifndef ORDER_H
#define ORDER_H

#include <string>
#include <vector>

class Employee;
class Menu;
class Product;

class Order {
private:
    int orderID;
    std::string date;
    std::string time;
    int tableNumber;
    std::string status;
    std::vector<Employee*> assignedEmployees;
    std::vector<Menu*> orderedDishes;
    std::vector<Product*> includedProducts;

public:
    Order(int id, int tableNumber);
    void markAsCompleted();
    std::string getOrderDetails() const;
};

#endif
