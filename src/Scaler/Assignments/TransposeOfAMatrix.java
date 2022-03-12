package Scaler.Assignments;

import java.util.*;

public class TransposeOfAMatrix {
    public static void main(String[] args) {

        /*
        A = [[1, 2, 3],
            [4, 5, 6],
            [7, 8, 9]]
         */

        ArrayList <Integer> l1 = new ArrayList<Integer>();
        l1.add(3);
        l1.add(6);
        l1.add(2);
        l1.add(8);
        l1.add(9);


        ArrayList <Integer> l2 = new ArrayList<Integer>();
        l2.add(11);
        l2.add(3);
        l2.add(7);
        l2.add(4);
        l2.add(2);


        ArrayList <Integer> l3 = new ArrayList<Integer>();
        l3.add(10);
        l3.add(6);
        l3.add(3);
        l3.add(7);
        l3.add(9);

        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        x.add(l1);
        x.add(l2);
        x.add(l3);

        ArrayList<ArrayList<Integer>> z = transposeOfAMatrix(x);
        System.out.println("Final ArrayList after Transpose is " + z);


    }

    static ArrayList<ArrayList<Integer>> transposeOfAMatrix(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> z = new ArrayList<ArrayList<Integer>>();

        int sizeOfMatrix = A.size();

        int columnSize = A.get(0).size();

        for (int k = 0; k < columnSize; k++) {

            ArrayList <Integer> arrayList = new ArrayList<Integer>();

            int columnSum = 0;

            for (int l = 0; l < sizeOfMatrix; l++) {
                arrayList.add(A.get(l).get(k));
            }
            z.add(arrayList);
        }

        System.out.println(z);

        return z;
    }
}
