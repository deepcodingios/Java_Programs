package Hashing;

import java.util.HashSet;

public class HashingProblems {
    public static void main(String[] args) {

        int [] array = {1,3,4,5,6};
        System.out.println(subArraySum(array));

    }

    static int subArraySum(int[] A){

//        int answer = 0;

        int [] prefixArray = new int[A.length];
        prefixArray[0] = A[0];
        if (A[0] == 0){
            return 1;
        }
        for (int i = 1;i < A.length; i++){
            prefixArray[i] = prefixArray[i-1] + A[i];
//            System.out.println(prefixArray[i]);
            if (prefixArray[i] == 0){
                return 1;
            }
        }

        HashSet<Long> hashSet = new HashSet<Long>();

        for (int i = 0; i < prefixArray.length; i++) {
            hashSet.add((long) prefixArray[i]);
        }

        if (hashSet.size() < A.length){
            return 1;
        }else {
            return 0;
        }
    }
}
