package Scaler.Assignments;

public class FullNumericPyramid {
    public static void main(String[] args) {

        printFullNumericPyramid();

    }

    static void printFullNumericPyramid(){

        int totalRows = 5;

        for (int row = 1; row <= totalRows; row++) {

            int k = row;

            for (int column = row; column <= totalRows-1; column++) {
                System.out.print(0 + " ");
            }

//            System.out.print(row);
            for (int column = 1; column <= row; column++) {
                System.out.print(k + " ");
                k++;
            }

            for (int column = k-2; column >= row; column--) {
                System.out.print(column + " ");
//                k--;
            }

            for (int column = row; column <= totalRows-1; column++) {
                if (column == totalRows){
                    System.out.print(0);
                }else {
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }
    }
}
