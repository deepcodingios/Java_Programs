package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PrefixSumProblems {
    public static void main(String[] args) {

        int [] array = {2, 3, -1, 4, 2, 1};
        int [] array_1 = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        System.out.println(pickFromBothSides(array_1,48));


        System.out.println(Arrays.toString(suffixArray(array)));

        System.out.println(Arrays.toString(prefixSum(array)));

        ArrayList<Integer> arrayList = new ArrayList<>(100);

        //[3,-2,4,6,-3,5]
        arrayList.add(3);
        arrayList.add(-2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(-3);
        arrayList.add(5);
//        arrayList.add(0);
        int prefixEvenSum = getPrefixEvenSumOfAnIndex(2,arrayList);

        System.out.println(prefixEvenSum);
        System.out.println(getPrefixEvenSumArrayfromArray(arrayList));

        System.out.printf("Mad Max");
    }

    static int [] prefixSum(int [] array){
        int [] prefixArray = new int[array.length];

        prefixArray[0] = array[0];
        int sum = prefixArray[0];

        for (int i = 1; i < array.length; i++){
            sum = sum + array[i];
            prefixArray[i] = sum;
        }

        return prefixArray;
    }

    static int prefixSumBetweenIndices(int [] A, int start, int end){
        int [] prefixArray = new int[A.length];

        prefixArray[0] = A[start];
        int sum = prefixArray[0];

        for (int i = start+1; i < end; i++){
            sum = sum + A[i];
            prefixArray[i] = sum;
        }

        return sum;
    }

    static int [] suffixArray(int [] array){
        int [] suffixArray = new int[array.length];

//        suffixArray[array.length-1] = array[array.length-1];
        int sum = 0;

        for (int i = array.length-1; i >= 0; i--){
            sum = sum + array[i];
            suffixArray[i] = sum;
        }

        System.out.println(Arrays.toString(suffixArray));

        return suffixArray;
    }

    static int pickFromBothSides(int [] A, int B){

        int N = A.length;

        int [] prefixArray = new int[A.length];

        prefixArray[0] = A[0];
        int totalSum = prefixArray[0];

        for (int i = 1; i < A.length; i++){
            totalSum = totalSum + A[i];
            prefixArray[i] = totalSum;
        }

        if (N == B){
            return totalSum;
        }

        int [] suffixArray = suffixArray(A);

        int start = B-1;
        int end = N-1;

        int final_answer = Integer.MIN_VALUE;

        while (start >= 0){
            int answer = 0;
            if (start == B-1){
                answer = prefixArray[start];
                start --;
            } else {
                answer = prefixArray[start] + suffixArray[end];
                System.out.println("Answer is "+ answer);
                start --;
                end --;
            }

            final_answer = Math.max(answer,final_answer);
        }

        if (end == N-B) {
            int answer_1 = suffixArray[end];
            final_answer = Math.max(answer_1,final_answer);
        }
        return final_answer;
    }

    static int pickMaxSumFromBothSidesInArray(ArrayList<Integer>list){

        int maxSum = list.get(0);
        //[5,-2,3,1,2]
        int maxElements = 3;

        /*
        5-2+3 = 6, r = 3+1+2 = 6
        5-2+2 = 5, r = 1+2+5 = 8
        5+1+2 = 8, r = 5-2+2 = 5
        */
        for (int left = 0; left < maxElements; left++) {

        }

        return maxSum;

    }

    static int getPrefixEvenSumOfAnIndex(int index, ArrayList<Integer> arrayList){

        int prefixEvenSum = arrayList.get(0);

        if (arrayList.size() == 1){
            prefixEvenSum = arrayList.get(0);
            return prefixEvenSum;
        }

        for (int i = 1; i <= index; i++) {

            if (i % 2 == 0){
                prefixEvenSum = prefixEvenSum + arrayList.get(i);
            }
        }

        return prefixEvenSum;
    }

    static ArrayList<Integer> getPrefixEvenSumArrayfromArray(ArrayList<Integer> arrayList){

        ArrayList<Integer> prefixEvenSumList = new ArrayList<>(arrayList.size());

        int prefixEvenSum = arrayList.get(0);

        prefixEvenSumList.add(0,arrayList.get(0));
//        System.out.println(prefixEvenSumList);

        for (int i = 1; i < arrayList.size(); i++) {

            if(i % 2 == 0){
                    prefixEvenSum = prefixEvenSum + arrayList.get(i);
                    prefixEvenSumList.add(i,prefixEvenSum);
            }else{
                    prefixEvenSumList.add(i,prefixEvenSumList.get(i-1));
            }
            System.out.println(prefixEvenSumList);
        }
        return prefixEvenSumList;
    }
}
