package com.pluralsight.productstreams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Product> inventory = getInventory();

        // 1. Filter by category
        String searchCategory = "Electronics";
        System.out.println("--- " + searchCategory + " ---");
        List<Product> electronics = getProductsByCategory(inventory, searchCategory);
        printProducts(electronics);

        // 2. Add up the price of every product
        BigDecimal totalValue = getTotalInventoryValue(inventory);
        System.out.println("\nTotal inventory value: $" + totalValue);

        // 3. Count the products in one category
        String countCategory = "Clothing";
        long clothingCount = countProductsInCategory(inventory, countCategory);
        System.out.println("Number of " + countCategory + " items: " + clothingCount);

        // 4. Just the prices
        List<BigDecimal> prices = getPrices(inventory);

        // 5. The most and least expensive prices
        if (!prices.isEmpty()) {
            System.out.println("\nMost expensive: $" + Collections.max(prices));
            System.out.println("Cheapest: $" + Collections.min(prices));
        }
    }

    // TASK 1: the products in one category
    private static List<Product> getProductsByCategory(List<Product> products, String category) {
        // STEP A (loop): make an empty list, loop through products, and add each one
        //   whose category matches (equalsIgnoreCase). Return the list.
        // STEP B (stream): products.stream(), then .filter(...), then .toList()

        return new ArrayList<>(); // replace this line
    }

    // TASK 2: the total of every product's price
    private static BigDecimal getTotalInventoryValue(List<Product> products) {
        // STEP A (loop): start a total at BigDecimal.ZERO, and add each price with .add()
        // STEP B (stream, after Wednesday's demo): .map(...) each product to its price,
        //   then .reduce(BigDecimal.ZERO, ...) to add them up

        return BigDecimal.ZERO; // replace this line
    }

    // TASK 3: how many products are in one category
    private static long countProductsInCategory(List<Product> products, String category) {
        // STEP A (loop): a count that starts at 0, plus 1 for each match
        // STEP B (stream): .filter(...), then .count()

        return 0; // replace this line
    }

    // TASK 4: a list of just the prices
    private static List<BigDecimal> getPrices(List<Product> products) {
        // STEP A (loop): an empty List<BigDecimal>; add each product's price
        // STEP B (stream, after Wednesday's demo): .map(...) each product to its price,
        //   then .toList()

        return new ArrayList<>(); // replace this line
    }

    // TASK 5: print each product
    private static void printProducts(List<Product> products) {
        // STEP A (loop): a for-each loop that prints each product
        // STEP B: products.forEach(...) with a lambda

    }

    private static List<Product> getInventory() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", new BigDecimal("999.99")));
        products.add(new Product("Smartphone", "Electronics", new BigDecimal("699.99")));
        products.add(new Product("Headphones", "Electronics", new BigDecimal("149.99")));
        products.add(new Product("Coffee Maker", "Home", new BigDecimal("89.99")));
        products.add(new Product("Blender", "Home", new BigDecimal("45.50")));
        products.add(new Product("Desk Chair", "Furniture", new BigDecimal("199.00")));
        products.add(new Product("T-Shirt", "Clothing", new BigDecimal("19.99")));
        products.add(new Product("Jeans", "Clothing", new BigDecimal("49.99")));
        products.add(new Product("Socks", "Clothing", new BigDecimal("9.99")));
        return products;
    }
}
