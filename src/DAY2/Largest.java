package com.java;

import java.util.Scanner;

public class Largest {
    public static int findLargest(int n1,int n2){
        if(n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter both the Numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int largest = findLargest(n1,n2);
        System.out.println(largest);

        sc.close();
    }
}
