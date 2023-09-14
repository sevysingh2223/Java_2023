package DSA.Array;

import java.util.Scanner;

import java.util.Arrays;

public class KthSmallestElement {
    static int[] findKSmallest(int[] arr, int k) {
        int[] kSmallest = new int[k];
        for (int i = 0; i < k; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            kSmallest[i] = arr[i];
        }
        return kSmallest;
    }

    public static void main(String[] args) {
        int[] array = {12, 3, 7, 4, 9, 2, 8, 15};
        int k = 3;
        
        int[] kSmallest = findKSmallest(array, k);
        System.out.println("The " + k + " smallest elements are: " + Arrays.toString(kSmallest));
    }
}
