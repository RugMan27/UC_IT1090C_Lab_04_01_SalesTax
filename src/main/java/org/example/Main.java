package org.example;

public class Main {
    public static void main(String[] args) {

        // double declarations
        double itemPrice = 20.3;

        // operation
        double salesTax = itemPrice * 0.05;
        double totalPrice = itemPrice + salesTax;

        // output
        System.out.println("Item Price is  " + itemPrice);
        System.out.println("Total Tax is " + salesTax);
        System.out.println("Total Price is " + totalPrice);
    }
}