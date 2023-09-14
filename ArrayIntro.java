package DSA.Array;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 20;
        arr[4] = 60;
        // System.out.println("Last Element"  + arr[4]); //60
        // System.out.println("Last Element"  + arr[2]); //0 By Default value is set to be 0 in array
        // System.out.println("First Element"  + arr[0]); //20

        //Store 2's table in an array
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int table[] = new int[10];
        for(int i=0;i<10;i++){
            table[i] = value * (i+1);
        }

        for(int i : table){
            System.out.println(i);
        }

    }
}
