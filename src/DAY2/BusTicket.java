package DAY2;

import java.util.Scanner;

public class BusTicket {
    public static int calculateFare(int age){
        int fare = 0;
        if(age < 5){
            fare = 0;
        }
        else if(age >= 5 && age <=12){
            fare = 20;
        }
        else if(age >= 13 && age <= 59){
            fare = 40;
        }
        else if(age >= 60){
            fare = 25;
        }
        return fare;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the passenger : ");
        String name = sc.nextLine();
        System.out.print("Enter the age of the passenger : ");
        int age = sc.nextInt();
        int fare = calculateFare(age);
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger Age: " + age);
        System.out.println("Passenger Fare: " + fare);
        sc.close();

    }
}
