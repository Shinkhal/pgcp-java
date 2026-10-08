package DAY1;
import java.util.*;


public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's Marks : ");
        int marks =  sc.nextInt();

        if(marks >= 40 ){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}

