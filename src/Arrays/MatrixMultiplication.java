package Arrays;

import java.util.ArrayList;

public class MatrixMultiplication {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> result = multiplyMatrix(getMatrix1(),getMatrix2());
        System.out.println(result);

    }

    static ArrayList<ArrayList<Integer>> getMatrix1(){

        ArrayList <Integer> l4 = new ArrayList<Integer>();
        l4.add(3);
        l4.add(0);
        l4.add(6);

        ArrayList <Integer> l5 = new ArrayList<Integer>();
        l5.add(2);
        l5.add(-1);
        l5.add(3);

        ArrayList <Integer> l6 = new ArrayList<Integer>();
        l6.add(6);
        l6.add(3);
        l6.add(7);

        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        x.add(l4);
        x.add(l5);
        x.add(l6);

//        System.out.println(x);

        return x;
    }

    static ArrayList<ArrayList<Integer>> getMatrix2(){
        ArrayList <Integer> l1 = new ArrayList<Integer>();
        l1.add(-2);
        l1.add(3);

        ArrayList <Integer> l2 = new ArrayList<Integer>();
        l2.add(5);
        l2.add(2);

        ArrayList <Integer> l3 = new ArrayList<Integer>();
        l3.add(4);
        l3.add(1);

        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        x.add(l1);
        x.add(l2);
        x.add(l3);

//        System.out.println(x);

        return x;
    }

    static ArrayList<ArrayList<Integer>> multiplyMatrix(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList <ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        int r1 = A.size();
        int c1 = A.get(0).size();

        int r2 = B.size();
        int c2 = B.get(0).size();

        for (int i = 0; i < r1; i++) {

            ArrayList<Integer> resultArrayList = new ArrayList<Integer>();

            for (int j = 0; j < c2; j++) {

                int sumCount = 0;

                for (int k = 0; k < r2; k++) {
                    sumCount = sumCount + A.get(i).get(k)*B.get(k).get(j);
                }
                resultArrayList.add(sumCount);
            }
            matrix.add(resultArrayList);
        }
        return matrix;
    }
}


