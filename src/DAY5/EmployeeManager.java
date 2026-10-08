package DAY5;


class Employee{
    int empId;
    String empName;
    double salary;
    double yearlySalary;

    Employee(int empId, String empName, double salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    void calculateSalary( ){
        yearlySalary = salary * 12;
        System.out.println("Yearly Salary is: " + yearlySalary);

    }
    void displayEmployeeDetails(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

class Manager extends Employee{
    String department;
    double bonus;
    Manager(int empId, String empName, double salary, String department, double bonus){
        super(empId, empName, salary);
        this.department = department;
        this.bonus = bonus;
    }
    void calculateTotalSalary(){
        super.calculateSalary();
        double newYearly = super.yearlySalary + (bonus * 12);
        System.out.println("Total Salary after bonus is: " + newYearly);
    }
    void  displayManagerDetails(){
        super.displayEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
    }

}
public class EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager(1,"Shinkhal",40000,"Cloud",20000);
        m.displayEmployeeDetails();
        m.calculateTotalSalary();
        m.displayManagerDetails();
    }
}
