package com.java;

import java.util.Scanner;

public class EmployeeSalary {
    public static double calculateSalary(double salary) {
        if (salary >= 50000) {
            return (salary + (salary * 0.2));
        }
        else{
            return (salary + (salary * 0.1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Basic Salary : ");
        double salary = sc.nextDouble();

        double finalSalary = calculateSalary(salary);
        System.out.println("Your Final Salary is: " + finalSalary);

        sc.close();
    }
}
