#include "Order.h"

Order::Order(int id, int tableNum) 
    : orderID(id), tableNumber(tableNum), status("Pending") {}

void Order::markAsCompleted() {
    status = "Completed";
}

std::string Order::getOrderDetails() const {
    return "Order ID: " + std::to_string(orderID) + ", Status: " + status;
}
