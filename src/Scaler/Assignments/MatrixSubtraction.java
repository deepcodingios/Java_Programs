package Scaler.Assignments;

import java.util.*;

public class MatrixSubtraction {
    public static void main(String[] args) {

        ArrayList <Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        ArrayList <Integer> l2 = new ArrayList<Integer>();
        l2.add(4);
        l2.add(5);
        l2.add(6);

        ArrayList <Integer> l3 = new ArrayList<Integer>();
        l3.add(7);
        l3.add(8);
        l3.add(9);

        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        x.add(l1);
        x.add(l2);
        x.add(l3);

        System.out.println(x);

        ArrayList <Integer> l4 = new ArrayList<Integer>();
        l4.add(9);
        l4.add(8);
        l4.add(7);

        ArrayList <Integer> l5 = new ArrayList<Integer>();
        l5.add(6);
        l5.add(5);
        l5.add(4);

        ArrayList <Integer> l6 = new ArrayList<Integer>();
        l6.add(3);
        l6.add(2);
        l6.add(1);

        ArrayList<ArrayList<Integer>> y = new ArrayList<ArrayList<Integer>>();
        y.add(l4);
        y.add(l5);
        y.add(l6);

        System.out.println(y);

        ArrayList<ArrayList<Integer>> z = subtractTheMatrix(x,y);
        System.out.println("Final ArrayList after Subtraction is " + z);

    }

    static ArrayList<ArrayList<Integer>> subtractTheMatrix(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList <ArrayList <Integer>>  finalArrayList = new ArrayList<ArrayList<Integer>>();

        int sizeOfArrayList = A.size();

        for (int i = 0; i < sizeOfArrayList; i++) {

            ArrayList<Integer> arrayList1 = A.get(i);
            ArrayList<Integer> arrayList2 = B.get(i);

            ArrayList<Integer> temp = new ArrayList<Integer>();

            for (int j = 0; j < arrayList1.size(); j++) {
                int sum = arrayList1.get(j) - arrayList2.get(j);
                temp.add(sum);
            }
            finalArrayList.add(temp);
        }

        return finalArrayList;
    }
}
