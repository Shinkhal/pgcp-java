import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Principle : ");
        double p = sc.nextDouble();
        System.out.print("Enter The Rate : ");
        double r = sc.nextDouble();
        System.out.print("Enter the Time : ");
        double t = sc.nextDouble();

        double si = (p*r*t)/100;
        double total = p + si;

        System.out.println("SI is : "+si);
        System.out.println("Total Amount is : "+total);
    }
}
