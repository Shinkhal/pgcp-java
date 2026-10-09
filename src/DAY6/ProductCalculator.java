package DAY6;

import java.util.Scanner;

class Product{
    int productId;
    String productName;
    double price;
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void calculatePrice(){
        System.out.println("Price of product " + productId + " is " + price);
    }

    void calculatePrice(int quantity){
        double price = quantity * this.price;
        System.out.println("Price for " + productId + " with quantity"+ quantity + " is " + price);
    }
    void calculatePrice(int quantity, double discount){
        double price = quantity * this.price;
        double discountPrice = price - discount;
        System.out.println("Price for " + productId + " with quantity"+ quantity + " is " + discountPrice);
    }
}

public class ProductCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product(sc.nextInt(), sc.next(), sc.nextDouble());
        p.calculatePrice();
        int quantity = sc.nextInt();
        p.calculatePrice(quantity);
        double discount = sc.nextDouble();
        p.calculatePrice(quantity, discount);
        sc.close();
    }
}
