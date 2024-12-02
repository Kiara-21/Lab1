#ifndef SUPPLIER_H
#define SUPPLIER_H

#include <string>
#include <vector>
#include "Product.h"

class Supplier {
private:
    int supplierID;
    std::string name;
    std::string contact;
    std::string address;

public:
    Supplier(int id, const std::string& name);
    std::string getSupplierDetails() const;
};

#endif
