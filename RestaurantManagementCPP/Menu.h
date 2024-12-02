#ifndef MENU_H
#define MENU_H

#include <string>
#include <vector>
#include "Product.h"
#include "Order.h"

class Menu {
private:
    int menuID;
    std::string dishName;
    std::string description;
    double price;
    int preparationTime;
    std::vector<Product*> ingredients;
    std::vector<Order*> orderedDishes;

public:
    Menu(int id, const std::string& name, double price);
    std::string getDishInfo() const;
    bool isDishPrepared() const;
};

#endif
