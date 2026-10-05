package DAY3;

import java.util.Scanner;

public class FindDuplicate {
    public static void FindDuplicate(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        FindDuplicate(arr);
    }
}
