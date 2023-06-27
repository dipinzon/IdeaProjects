package org.example;

import org.example.model.Product;

public class Main {
    public static void main(String[] args) {

        printMessage("Test message");

        Product product = new Product("Kayboard");
        printMessage(product.getName());
    }

    private static void printMessage(String x) {
        System.out.println(x);
    }
}