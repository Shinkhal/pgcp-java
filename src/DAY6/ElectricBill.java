package DAY6;

import java.util.Scanner;

class Bill{
    int consumerNo;
    String consumerName;
    double unitsConsumed;
    Bill(int consumerNo, String consumerName, double unitsConsumed){
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    void calculateBill(){
        double bill = unitsConsumed * 8;
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Consumer Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: " + bill);
    }
    void calculateBill(double rate){
        double bill = unitsConsumed * rate;
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Consumer Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: " + bill);
    }
    void calculateBill(double rate, double unitsConsumed){
        double bill = unitsConsumed * rate;
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Consumer Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: " + bill);
    }
}

public class ElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int consumerNo = sc.nextInt();
        String consumerName = sc.next();
        double unitsConsumed = sc.nextDouble();
        Bill bill = new Bill(consumerNo, consumerName, unitsConsumed);
        bill.calculateBill();
        double rate = sc.nextDouble();
        bill.calculateBill(rate);
        bill.calculateBill(rate, unitsConsumed);

        sc.close();
    }
}
