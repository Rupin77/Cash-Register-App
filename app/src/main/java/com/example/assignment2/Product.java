package com.example.assignment2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    String name;
    int quantity;
    BigDecimal price;

    public Product(String name, int quantity, double price) {
        this.setName(name);
        this.setQuantity(quantity);
        this.setPrice(price);
    }

    public Product() {
        this.setName("Select a product");
        this.setQuantity(0);
        this.setPrice(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decreaseQuantity(int amount) {
        int reducedQuantity = this.quantity - amount;
        if (reducedQuantity >= 0) {
            this.quantity = reducedQuantity;
        }
    }

    public void increaseQuantity(int amount) {
        if (amount > 0) {
            this.quantity = this.quantity + amount;
        }
    }

    public double getPrice() {
        return price.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public void setPrice(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        this.price = bd;
    }

    public double getTotal() {
        return BigDecimal.valueOf(getQuantity() * getPrice()).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}