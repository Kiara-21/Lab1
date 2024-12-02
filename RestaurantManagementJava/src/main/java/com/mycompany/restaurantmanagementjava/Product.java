package com.mycompany.restaurantmanagementjava;

import java.util.*;

public class Product {
    private int productID;
    private String name;
    private String category;
    private String expirationDate;
    private Collection<Menu> ingredients;
    private Collection<Order> orderedProducts;
    private Collection<Supplier> suppliers;

    public Product(int productID, String name) {
        this.productID = productID;
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.orderedProducts = new ArrayList<>();
        this.suppliers = new ArrayList<>();
    }

    public boolean checkStock() {
        return !orderedProducts.isEmpty();
    }

    public Supplier getSupplierInfo() {
        return suppliers.isEmpty() ? null : suppliers.iterator().next();
    }

    public List<Product> getCurrentStock() {
        return new ArrayList<>();
    }

    public List<Supplier> getSuppliersByProduct(int productID) {
        return new ArrayList<>();
    }

    // Getters and setters
    // ...
}
