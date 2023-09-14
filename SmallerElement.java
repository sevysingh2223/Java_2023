package DSA.Array;

import java.util.Scanner;

public class SmallerElement {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() ;
        int arr[] =new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }   
        int min = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Smallest Num" + min);
        scan.close();
    }
}
