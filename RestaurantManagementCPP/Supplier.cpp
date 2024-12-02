#include "Supplier.h"

Supplier::Supplier(int id, const std::string& name) 
    : supplierID(id), name(name) {}

std::string Supplier::getSupplierDetails() const {
    return name + " - Contact: " + contact;
}
