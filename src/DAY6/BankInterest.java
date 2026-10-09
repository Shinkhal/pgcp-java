package DAY6;


import java.util.Scanner;

class BankAccount{
    int accountNumber;
    double balance;
    String name;
    BankAccount(int accountNumber, double balance, String name){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    void calculateInterest(){
        System.out.println("Calculating Interest");
    }
}

class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int accountNumber, double balance, String name, double interestRate){
        super(accountNumber, balance, name);
        this.interestRate = interestRate;
    }
    @Override
    void calculateInterest(){
        double interest = interestRate * balance / 100;
        System.out.println("Savings Account Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount{
    double interestRate;
    CurrentAccount(int accountNumber, double balance, String name, double interestRate){
        super(accountNumber, balance, name);
        this.interestRate = interestRate;
    }
    @Override
    void calculateInterest(){
        double interest = balance * interestRate / 100;
        System.out.println("Current Interest Rate: " + interest);
    }
}
public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountNumber = sc.nextInt();
        double savings = sc.nextDouble();
        String name = sc.next();
        double SAinterestRate = sc.nextDouble();
        SavingsAccount sa = new SavingsAccount(accountNumber, savings, name, SAinterestRate);
        sa.calculateInterest();
        double CAinterestRate = sc.nextDouble();
        CurrentAccount ca = new CurrentAccount(accountNumber, savings, name, CAinterestRate);
        ca.calculateInterest();

        sc.close();
    }
}
