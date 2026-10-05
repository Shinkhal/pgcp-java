package DAY3;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallest {
    public static void FindLargestSmallest(int[] arr){
        Arrays.sort(arr);
        int smallest = arr[0];
        int largest = arr[arr.length-1];

        System.out.println("Smallest = "+smallest);
        System.out.println("Largest = "+largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[]  arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        FindLargestSmallest(arr);

    }
}
