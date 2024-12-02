package com.mycompany.restaurantmanagementjava;

import java.util.*;

public class Supplier {
    private int supplierID;
    private String name;
    private String contact;
    private String address;
    private Collection<Product> suppliedProducts;

    public Supplier(int supplierID, String name) {
        this.supplierID = supplierID;
        this.name = name;
        this.suppliedProducts = new ArrayList<>();
    }

    public String getSupplierDetails() {
        return "Supplier: " + name + ", Contact: " + contact;
    }

    // Getters and setters
    // ...
}
