package DAY3;

import java.util.Scanner;

public class SearchElement {

    public static void SearchElement(int[] arr, int search) {
        int idx = -1;
        for( int i= 0; i<arr.length; i++){
            if (arr[i]==search){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+idx);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array ");

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]  = sc.nextInt();
        }

        System.out.print("Enter the number to search : ");
        int search = sc.nextInt();

        SearchElement(arr, search);
    }
}
