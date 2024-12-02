#include <iostream>
#include "Employee.h"
#include "Menu.h"
#include "Order.h"

int main() {
    Employee employee(1, "John Doe");
    std::cout << employee.getEmployeeInfo() << std::endl;

    Menu menu(1, "Pasta", 12.99);
    std::cout << menu.getDishInfo() << std::endl;

    Order order(1, 5);
    order.markAsCompleted();
    std::cout << order.getOrderDetails() << std::endl;

    return 0;
}
