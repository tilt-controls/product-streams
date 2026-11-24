package com.pluralsight.productstreams;

import java.math.BigDecimal;

public class Product {
    private String name;
    private String category;
    private BigDecimal price;

    public Product(String name, String category, BigDecimal price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%-14s %-12s $%8.2f", name, category, price);
    }
}