package DAY1;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if( a > b){
            System.out.println("The largest number is " + a);
        }
        else{
            System.out.println("The largest number is " + b);
        }
    }
}
