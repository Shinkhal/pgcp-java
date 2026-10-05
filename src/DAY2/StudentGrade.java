package com.java;
import java.util.*;
public class StudentGrade {

    public static String studentGrade(int marks){

        String grade = "";
        if(marks >= 90 && marks <= 100){
            grade = "A";
        }
        else if(marks >= 75 && marks <= 89){
            grade = "B";

        }
        else if(marks >= 60 && marks <= 74){
            grade = "C";
        }
        else if(marks >= 50 && marks <= 59){
            grade = "D";
        }
        else if(marks < 50 && marks > 0){
            grade = "F";
        }
        else return "Marks can not be negative";
        return grade;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Marks : ");
        int marks = sc.nextInt();
        String res = studentGrade(marks);
        System.out.println(res);
    }

}
