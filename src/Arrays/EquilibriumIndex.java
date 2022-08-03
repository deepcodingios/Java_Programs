package Arrays;

import java.util.ArrayList;

public class EquilibriumIndex {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(100);

        arrayList.add(-7);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(-4);
        arrayList.add(3);
        arrayList.add(0);
//        arrayList.add(-3);
//        arrayList.add(6);
//        arrayList.add(2);
//        arrayList.add(4);
//        arrayList.add(5);
//        arrayList.add(-1);
//        arrayList.add(2);
//        arrayList.add(-3);
//        arrayList.add(6);
//        arrayList.add(2);
//        arrayList.add(4);
//        arrayList.add(5);
//        arrayList.add(-1);
//        arrayList.add(2);

        int index = findEquilibriumIndex(arrayList);

        System.out.println("Equilibrium Index is " + index);
    }

    static int getPrefixSumOfAnIndex(int index, ArrayList<Integer> arrayList){

        int prefixSum = 0;

        for (int i = 0; i <= index; i++) {

            prefixSum = prefixSum + arrayList.get(i);
        }
        System.out.println(prefixSum);

        return prefixSum;
    }



    static int findEquilibriumIndex(ArrayList<Integer> arrayList) {

        ArrayList<Integer> prefixArray = getPrefixSumArrayOfAnArray(arrayList);         

        System.out.println(prefixArray);

        int length = prefixArray.size()-1;

        for (int i = 0; i < length; i++) {

            int left = 0;
            if (i == 0){
                left = 0;
            }else{
                left = prefixArray.get(i -1);
            }
            int right = prefixArray.get(length) - prefixArray.get(i);
            if (left == right){
                return i;
            }
        }

        return -1;
    }

    static ArrayList<Integer> getPrefixSumArrayOfAnArray(ArrayList<Integer> list){

        ArrayList<Integer> prefixArrayList = new ArrayList<>();

        for (int i = 0; i < list.size()-1; i++) {

            prefixArrayList.add(getPrefixSumOfAnIndex(i,list));
        }
        return prefixArrayList;
    }


}
