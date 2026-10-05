package DAY4;

import java.util.Scanner;

class BankAccount{
    int accountNumber;
    String name;
    double balance;

    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the account number: ");
        accountNumber=sc.nextInt();
        System.out.print("Enter the name of the account: ");
        name=sc.next();
        System.out.print("Enter the balance of the account: ");
        balance=sc.nextDouble();
    }
    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
    public void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        int d = sc.nextInt();
        balance+=d;
        System.out.println("Deposited "+d);
        System.out.println("Balance: "+balance);
    }
    public void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the withdraw amount: ");
        int w  = sc.nextInt();
        if(balance>=w) {
            balance-=w;
            System.out.println("Withdrawed "+w);
            System.out.println("Balance: "+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}


public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.read();
        ba.display();
        ba.deposit();
        ba.withdraw();
        ba.display();
    }
}
