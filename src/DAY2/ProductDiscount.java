package com.java;

import java.util.Scanner;

public class ProductDiscount {

    public static double calculateFinalPrice(double price){
        double f =0;
        if (price >= 10000){
            f = price - (price * 0.2);
        }
        else if (price >= 5000 && price < 10000){
            f = price - (price * 0.1);
        }
        else if(price >= 2000 && price < 5000){
            f = price - (price * 0.05);
        }
        return f;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID of the product: ");
        int productId = sc.nextInt();
        System.out.print("Enter the Name of the product: ");
        String productName = sc.next();
        System.out.print("Enter the Price of the product: ");
        double productPrice = sc.nextDouble();
        double finalPrice = calculateFinalPrice(productPrice);
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Final Price: " + finalPrice);

    }
}
