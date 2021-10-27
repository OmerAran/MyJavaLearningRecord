package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int kdv = 18;
        int kdv2 = 8;
        System.out.println("please enter the product's price : ");
        Scanner readPrice = new Scanner(System.in);
        double price = readPrice.nextDouble();
        double totalPrice;
        if (price < 1000) {
            totalPrice = price + kdv * price / 100;
            System.out.println("total price : " + totalPrice);
        } else if (price >= 1000) {
            totalPrice = price + kdv2 * price / 100;
            System.out.println("total price : " + totalPrice);
        } else {
            System.out.println("please enter the actual price.");
        }
    }
}
