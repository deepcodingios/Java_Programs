package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        
        int [] A = {3,5,6,2,8};
        A = bubbleSort(A);
        System.out.println(Arrays.toString(A));
    }

    static int [] bubbleSort(int [] A){
        boolean swapped = false;
        for (int i = 0; i < A.length;i++){
            for (int j = 1; j < A.length - i; j++){
                if (A[j] < A[j-1]){
                    int temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return A;
    }
}
