#include "Menu.h"

Menu::Menu(int id, const std::string& name, double price)
    : menuID(id), dishName(name), price(price) {}

std::string Menu::getDishInfo() const {
    return dishName + ": " + description;
}

bool Menu::isDishPrepared() const {
    return false; // Placeholder implementation
}
