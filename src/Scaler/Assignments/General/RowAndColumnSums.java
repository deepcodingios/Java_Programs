package Scaler.Assignments.General;

import java.util.ArrayList;

public class RowAndColumnSums {
    public static void main(String[] args) {

        ArrayList <Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);

        /*
        [[1,2],
        [3,4],
        [5,6]
        ]
        * */

        ArrayList <Integer> l2 = new ArrayList<Integer>();
        l2.add(4);
        l2.add(5);

        ArrayList <Integer> l3 = new ArrayList<Integer>();
        l3.add(8);
        l3.add(9);

        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        x.add(l1);
        x.add(l2);
        x.add(l3);

        ArrayList<Integer> z = calculateRowAndColumnSum(x);
        System.out.println("Arraylist with Row and Column Sum is " + z);

    }

    static ArrayList<Integer> calculateRowAndColumnSum(ArrayList<ArrayList<Integer>> A) {

        ArrayList <Integer> finalArrayList = new ArrayList<Integer>();

        int sizeOfArrayList = A.size();

        int columnSize = A.get(0).size();


        for (int i = 0; i < sizeOfArrayList; i++) {
            int rowSum = 0;

            ArrayList<Integer> rowList = A.get(i);

            for (int j = 0; j < rowList.size(); j++) {
                rowSum = rowSum + rowList.get(j);
            }
            finalArrayList.add(rowSum);
        }

        /*
        [[1,2],
        [4,5],
        [8,9]
        ]
        * */

        for (int k = 0; k < columnSize; k++) {
            int columnSum = 0;

            for (int l = 0; l < sizeOfArrayList; l++) {
                columnSum = columnSum + A.get(l).get(k);
            }
            System.out.println("columnSum is " + columnSum);
            finalArrayList.add(columnSum);
        }

        return finalArrayList;
    }
}
