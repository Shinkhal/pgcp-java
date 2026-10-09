package DAY4;

import java.util.Scanner;

class Bill{
    int ConsumerNumber;
    String Name;
    double units;
    double total;

    Bill(int ConsumerNumber, String Name, double units){
        this.ConsumerNumber = ConsumerNumber;
        this.Name = Name;
        this.units = units;
    }
    void display(){
        System.out.println("Consumer Number: " + ConsumerNumber);
        System.out.println("Name: " + Name);
        System.out.println("Units: " + units);
        System.out.println("Total: " + total);
    }
    void calculateBill(){
        if(units <= 100){
            total = units * 2;
        }
        else if(units <= 200){
            total = (100 * 2)+ ((units - 100) * 3);
        }
        else {
            total = (100 * 2) + ( 100 * 3) + ((units - 200) * 5);
        }
    }
}
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ConsumerNumber = sc.nextInt();
        String Name = sc.next();
        double units = sc.nextDouble();

        Bill b = new Bill(ConsumerNumber, Name, units);
        b.calculateBill();
        b.display();
        sc.close();
    }
}
