package Arrays;

import java.util.ArrayList;

public class EquilibriumIndex {
    public static void main(String[] args) {

        findEquilibriumIndex();
    }

    static int getPrefixSumOfAnIndex(int index, ArrayList<Integer> arrayList){

        int prefixSum = 0;

        for (int i = 0; i <= index; i++) {

            prefixSum = prefixSum + arrayList.get(i);
        }
        System.out.println(prefixSum);

        return prefixSum;
    }

    static void findEquilibriumIndex() {

        ArrayList<Integer> arrayList = new ArrayList<>(10);

        arrayList.add(-3);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(-1);
        arrayList.add(2);

        int prefixSum = getPrefixSumOfAnIndex(6,arrayList);
        System.out.println("Prefix Sum is " + prefixSum);
    }
}
