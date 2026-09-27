package DAY1;

import java.util.Scanner;

public class AreaCircle {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle : ");
        double r =  sc.nextDouble();
        double area = Math.PI*r*r;
        double circumference = 2*Math.PI*r;

        System.out.println("The area of the circle is : "+area);
        System.out.println("The circumference of the circle is: "+circumference);



    }
}