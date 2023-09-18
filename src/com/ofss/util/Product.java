package com.ofss.util;

public class Product {
    private String name;
    private int cost;
    private int quantity;

    public Product(String name, int cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void makeSale() {
        if (quantity > 0) {
            quantity--;
        }
    }

    public boolean isAvailable() {
        return quantity > 0;
    }
}
