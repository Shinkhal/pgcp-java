package DAY6;

import java.util.Scanner;

class Vehicle{
    String vehicleNumber;
    String brand;
    double baseRate;

    Vehicle(String vehicleNumber, String brand, double baseRate){
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    void calculateRental(){
        System.out.println("Calculating rental for vehicle " + vehicleNumber);

    }
}

class Car extends Vehicle{
    int numberOfDays;
    double insuranceFee;
    Car(String vehicleNumber, String brand, double baseRate, int numberOfDays, double insuranceFee){
        super(vehicleNumber, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.insuranceFee = insuranceFee;
    }
    @Override
    void calculateRental(){
        double totalFee = insuranceFee + (baseRate * numberOfDays);
        System.out.println("Rental for vehicle " + vehicleNumber + " is: " + totalFee);

    }
}

class Bike extends Vehicle{
    int numberOfDays;
    double helmetCharge;

    Bike(String vehicleNumber, String brand, double baseRate, int numberOfDays, double helmetCharge){
        super(vehicleNumber, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.helmetCharge = helmetCharge;
    }
    @Override
    void calculateRental(){
        double totalFee = helmetCharge + (baseRate * numberOfDays);
        System.out.println("Rental for vehicle " + vehicleNumber + " is: " + totalFee);
    }
}
public class VehicleRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vehicleNumber = sc.next();
        String brand = sc.next();
        double CarBaseRate = sc.nextDouble();
        int numberOfDays = sc.nextInt();
        double insuranceFee = sc.nextDouble();
        Car car = new Car(vehicleNumber, brand, CarBaseRate, numberOfDays, insuranceFee);
        car.calculateRental();
        double BikeBaseRate = sc.nextDouble();
        int numberOfDays2 = sc.nextInt();
        double helmetCharge = sc.nextDouble();
        Bike bike = new Bike(vehicleNumber, brand, BikeBaseRate, numberOfDays2, helmetCharge);
        bike.calculateRental();

        sc.close();
    }
}
