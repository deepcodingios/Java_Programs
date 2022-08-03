package Arrays;

import java.util.ArrayList;

public class PrefixSumProblems {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(100);

        //[3,-2,4,6,-3,5]
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.add(0);
        int prefixEvenSum = getPrefixEvenSumOfAnIndex(5,arrayList);
        System.out.println(prefixEvenSum);
    }

    static int getPrefixEvenSumOfAnIndex(int index, ArrayList<Integer> arrayList){

        int prefixEvenSum = arrayList.get(0);

        if (arrayList.size() == 1){
            prefixEvenSum = arrayList.get(0);
            return prefixEvenSum;
        }

        for (int i = 1; i < arrayList.size(); i++) {

            if (i % 2 == 0){
                prefixEvenSum = prefixEvenSum + arrayList.get(i);
            }
        }

        return prefixEvenSum;
    }
}
