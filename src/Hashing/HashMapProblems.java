package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapProblems {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(6);

        int answer = findFirstRepeatingElement(list);
        int array [] = {2, 7, 11, 15};
        int array2 [] = {2, 2, 11, 15, 3,4,5};
        int target = 9;
        int [] result = twoSum(array,target);
        System.out.println("Array with Indices is " + result[0] + result[1]);
        System.out.println("Repeating Element is " + answer);

        commonElements(array,array2);

    }

    static ArrayList<Integer> commonElements(int[] A, int[] B) {

        ArrayList<Integer> commonElements = new ArrayList<Integer>();

        HashMap<Integer,Integer> hashMap_1 = new HashMap<>();

        for (int i = 0; i < A.length; i++){
            if (hashMap_1.containsKey(A[i])){
                int value = hashMap_1.get(A[i]);
                hashMap_1.put(A[i],value++);
            }else {
                hashMap_1.put(A[i], 1);
            }
        }

        HashMap<Integer,Integer> hashMap_2 = new HashMap<>();

        for (int i = 0; i < B.length; i++){
            if (hashMap_2.containsKey(B[i])){
                int value = hashMap_2.get(B[i]);
                hashMap_2.replace(B[i],value+1);
            }else {
                hashMap_2.put(B[i], 1);
            }
        }

        for (int i = 0; i < A.length; i++){

            if (hashMap_2.containsKey(A[0])){
                boolean test = false;
                for (int element : A) {
                    if (element == A[0]) {
                        test = true;
                        break;
                    }
                }
                if (!test){

                }
            }

        }

        System.out.println(hashMap_1);
        System.out.println(hashMap_2);

        return commonElements;
    }

    static int[] twoSum( int[] A, int B) {

        int[] indicesArray = new int[2];

        int start = 0; int end = A.length -1;

        while (start < end){

            if(A[start]+A[end] == B){
                indicesArray[0] = start;
                indicesArray[1] = end;

                return indicesArray;
            }

            if (A[start]+A[end] > B){
                end--;
            }else {
                start++;
            }
        }

        return indicesArray;
    }

    static int findFirstRepeatingElement(ArrayList<Integer> arrayList){

        int repeatingElement = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = arrayList.size()-1; i > 0; i--) {

            if (map.containsKey(arrayList.get(i))) {
                repeatingElement = arrayList.get(i);
            }else {
                map.put(arrayList.get(i),1);
            }
        }
        return repeatingElement;
    }
}
