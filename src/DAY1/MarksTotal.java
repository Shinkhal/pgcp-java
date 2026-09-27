package DAY1;

import java.util.*;

public class MarksTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of all 3 subjects To calculate Total And Avg ");
        System.out.print("Enter Subject 1 marks : ");
        int marks1 = sc.nextInt();
        System.out.print("Enter Subject 2 marks : ");
        int marks2 = sc.nextInt();
        System.out.print("Enter Subject 3 marks : ");
        int marks3 = sc.nextInt();

        int total = marks1 + marks2 + marks3;
        System.out.println("Total marks: " + total);

        double avg = (marks1 + marks2 + marks3) / 3.0;
        System.out.println("Average marks: " + avg);

        sc.close();
    }
}