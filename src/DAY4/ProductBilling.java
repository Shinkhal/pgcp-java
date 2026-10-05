package DAY4;

import java.util.Scanner;

class Product{
    int id;
    String name;
    double price;
    int quantity;
    double total;

    public void read(int ID,String Name,double Price,int Quantity){
        id=ID;
        name=Name;
        price=Price;
        quantity=Quantity;
    }
    public void calculateBill(){
        System.out.println("Calculating Bill...");
        total = price * quantity;
        System.out.println("Your Total is Rs. "+total);
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total: "+total);
    }
}

public class ProductBilling {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Product p = new Product();
        System.out.print("Enter ID:");
        int id =  sc.nextInt();
        System.out.print("Enter Name:");
        String name = sc.next();
        System.out.print("Enter Price:");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity:");
        int quantity = sc.nextInt();

        p.read(id, name, price, quantity);
        p.calculateBill();
        p.display();
    }
}
