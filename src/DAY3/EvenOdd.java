package DAY3;

import java.util.Scanner;

public class EvenOdd {
    public static void CountEvenOdd(int[] arr){
        int odd = 0;
        int even = 0;
        for (int i : arr){
            if (i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even numbers : "+even);
        System.out.println("Odd numbers : "+odd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        CountEvenOdd(arr);
    }
}
