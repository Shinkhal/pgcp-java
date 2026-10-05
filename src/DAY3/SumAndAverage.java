package DAY3;

import java.util.Scanner;

public class SumAndAverage {
    public static void Sum(int[] arr){
        int s =0;
        for (int i : arr){
            s += i;
        }
        System.out.println("Sum = "+s);
    }

    public static void Average(int[] arr){
        int s =0;
        for (int i : arr) {
            s += i;
        }
        double avg = (double) s / arr.length;
        System.out.println("Average = "+avg);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length of Array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Sum(arr);
        Average(arr);

        input.close();
    }

}
