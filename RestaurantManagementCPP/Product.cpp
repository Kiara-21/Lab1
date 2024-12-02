#include "Product.h"

Product::Product(int id, const std::string& name) 
    : productID(id), name(name) {}

bool Product::checkStock() const {
    return true; // Placeholder for stock check
}

Supplier* Product::getSupplierInfo() const {
    return nullptr; // Placeholder for supplier information
}
