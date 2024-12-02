#ifndef PRODUCT_H
#define PRODUCT_H

#include <string>
#include <vector>
#include "Supplier.h"

class Menu;
class Order;
class Supplier;

class Product {
private:
    int productID;
    std::string name;
    std::string category;
    std::string expirationDate;
    std::vector<Supplier*> suppliers;

public:
    Product(int id, const std::string& name);
    bool checkStock() const;
    Supplier* getSupplierInfo() const;
};

#endif
