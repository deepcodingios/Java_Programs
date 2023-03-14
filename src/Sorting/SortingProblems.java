package Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class SortingProblems {
    public static void main(String[] args) {

        int [] salaries = {4000,3000,1000,2000};
        double result1 = average(salaries);
        System.out.println(result1);

//        int [] A = {3, 2, 1, 3};
//        int [] A = {1, 1, 3, 3};
//        int [] A = {0, 1, 2, 0, 1, 2};
//        int [] A = {0};
        int firstArray [] = {8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};

        System.out.println(Arrays.toString(mergeSort(firstArray)));
//                {3,7,8,9,10,1,2,3};

        int secondArray [] = {2,5,6,11,12};
//        int finalArray [] = mergeSortedArrays(firstArray,secondArray);
//        System.out.println(Arrays.toString(finalArray));

//        System.out.println(Arrays.toString(merge(firstArray,0,firstArray.length/2,firstArray.length-1)));
        int [] A = {2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};
        int [] answerArray = sortColors(A);
        System.out.println(Arrays.toString(answerArray));
//        int [] A = {-4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5};
        int result = nobleInteger(A);
        System.out.println(result);
    }

    static double average(int[] salary) {

        Arrays.sort(salary);

        int sum = 0;

        for(int i = 1; i < salary.length-1;i++){
            sum = sum + salary[i];
        }

        int lengthOfArray = salary.length-2;

        double average = sum/lengthOfArray;

        return average;

    }

    static int [] merge(int [] first, int [] second){

        int [] finalArray = new int[first.length + second.length];

        int p1 = 0; int p2 = 0; int p3 = 0;

        while (p1 < first.length && p2 < second.length){
            if (first[p1] < second[p2]){
                finalArray[p3] = first[p1];
                p1++;
                p3++;
            }else {
                finalArray[p3] = second[p2];
                p2++;
                p3++;
            }
        }
        while (p1 < first.length){
            finalArray[p3] = first[p1];
            p1++;
            p3++;
        }
        while (p2 < second.length){
            finalArray[p3] = second[p2];
            p2++;
            p3++;
        }

        return finalArray;
    }

    static int [] mergeSort(int [] A){

        if (A.length == 1) return A;

        int middle = (A.length) /2;

        int left [] = mergeSort(Arrays.copyOfRange(A,0,middle));
        int right [] = mergeSort(Arrays.copyOfRange(A,middle,A.length));

        return merge(left,right);
    }

    static int [] mergeSortedArrays(int [] A, int [] B){

        int p1 = 0; int p2 = 0; int p3 = 0;

        int [] finalArray = new int[A.length+B.length];

        while (p1 < A.length && p2 < B.length){
            if (A[p1] < B[p2]){
                finalArray[p3] = A[p1];
                p1++;
                p3++;
            }else {
                finalArray[p3] = B[p2];
                p2++;
                p3++;
            }
        }
        while (p1 < A.length){
            finalArray[p3] = A[p1];
            p1++;
            p3++;
        }
        while (p2 < B.length){
            finalArray[p3] = B[p2];
            p2++;
            p3++;
        }

        return finalArray;

    }

    static int nobleInteger(int [] A){

        HashMap<Integer,Integer> hashMap_1 = new HashMap<>();

        for (int i = 0; i < A.length; i++){
            if (hashMap_1.containsKey(A[i])){
                int value = hashMap_1.get(A[i]);
                hashMap_1.put(A[i],value + 1);
            }else {
                hashMap_1.put(A[i], 1);
            }
        }

        System.out.println(hashMap_1);

        A = bubbleSort(A);
//        Arrays.sort(A);

//        int elementToCompare = A[0];
        int count = 0;

        for (int i = 0; i < A.length;i++){
            for (int j = i+1; j < A.length;j++){
                if (A[j] > A[i]){
                    count++;
                }
            }


            if (count == A[i]){
                System.out.println(A[i] + " is a Noble Integer");
                return 1;
            }
            count = 0;
        }
        return 0;
    }

    static int [] sortColors(int [] A){

        int numberOfZeros = 0;
        int numberOfOnes = 0;
        int numberOfTwos = 0;

        if (A.length == 1) return A;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) numberOfZeros++;
            if (A[i] == 1) numberOfOnes++;
            if (A[i] == 2) numberOfTwos++;
        }
        int [] finalArray = new int[A.length];

        for (int i = 0; i < numberOfZeros; i++){
            finalArray[i] = 0;
        }

        for (int i = numberOfZeros; i < numberOfZeros+numberOfOnes; i++){
            finalArray[i] = 1;
        }

        for (int i = numberOfZeros+numberOfOnes; i < A.length; i++){
            finalArray[i] = 2;
        }

        return finalArray;
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
