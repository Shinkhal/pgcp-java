package com.java;
import java.util.*;

public class Electricity {
	
	public static int calculateBill(int unit) {
		int amount = 0;
		if (unit >=0 && unit <=100) {
			amount = unit*2;
			
		}
		else if(unit >100 && unit <=200) {
			amount = (3* (unit -100))+ (100 *2);
		
		}
		else if(unit >200 && unit <=300) {
			amount = (100*2)+ (100 * 3) + (unit - 200 )*5;
		}
		else if(unit > 300) {
			amount = (100 * 2) + (100 * 3) + (100 * 5)+ ((unit - 300) * 7);
		}
		
		
		return amount;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Units : ");
		int unit = sc.nextInt();
		int ans = calculateBill(unit);
		System.out.println("Total bill is : "+ans);
		
		
	}

}
