package DAY4;

import java.util.Scanner;

class Employee{
    int empID;
    String empName;
    double basicSalary;
    double hraSalary;
    double dasalary;
    double salary;

    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Employee ID: ");
        empID=sc.nextInt();
        System.out.print("Enter the Employee Name: ");
        empName=sc.next();
        System.out.print("Enter the basic Salary: ");
        basicSalary=sc.nextDouble();
        System.out.print("Enter HRA Salary: ");
        hraSalary=sc.nextDouble();
        System.out.print("Enter DA Salary: ");
        dasalary=sc.nextDouble();
    }
    public void display(){
        System.out.println("Employee ID: "+empID);
        System.out.println("Employee Name: "+empName);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("HRA Salary: "+hraSalary);
        System.out.println("DA Salary: "+dasalary);
        System.out.println("Salary: "+salary);

    }
    public void calculateSalary(){
        System.out.println("Calculating Salary...");
        salary=basicSalary+hraSalary+dasalary;
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.read();
        e.calculateSalary();
        e.display();
    }

}
