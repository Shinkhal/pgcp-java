import java.util.*;

public class VoteEligibility {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Age of Voter : ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
}
