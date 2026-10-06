package DAY3;

import java.util.Scanner;

public class PositiveNegative {

    public void findPositiveNegative(int[] arr) {
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                neg[negCount] = arr[i];
                negCount++;
            }
            else if (arr[i] > 0) {
                pos[posCount] = arr[i];
                posCount++;
            }
            else {
                zeroCount++;
            }
        }

        System.out.println("Positive Numbers:");
        for (int i = 0; i < posCount; i++) {
            System.out.print(pos[i] + " ");
        }

        System.out.println("\nNegative Numbers:");
        for (int i = 0; i < negCount; i++) {
            System.out.print(neg[i] + " ");
        }

        System.out.println("\nZero Count: " + zeroCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PositiveNegative obj = new PositiveNegative();
        obj.findPositiveNegative(arr);

        sc.close();
    }
}
