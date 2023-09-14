package DSA.Array;

import java.util.Scanner;

public class CountNeg {
    public static void main(String[] args) {
        // int arr[] = {-3,-4,9,-8,4};
        System.out.println("Enter size of array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() ;
        int arr[] =new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }   
        int count =0;
        System.out.println("Negative nums");

        for(int i : arr){
            if(i<0){
                System.out.println(i);                
                count++;
            }
        }
        System.out.println("Negative Number " + count);
    }
}
