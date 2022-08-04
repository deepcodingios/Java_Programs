package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PrefixSumProblems {
    public static void main(String[] args) {
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

    static void pickFromBothSidesInArray(ArrayList<Integer>list){



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
