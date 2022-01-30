package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
        */

        //It's important to define the number of rows for a 2D Dimensional Array. It's Mandatory.
        int[][] multiDimentionalArray = new int[3][3];

        int [] [] array2D = {
                {1,2,3},//0th index
                {4,5},// 1st index
                {6,7,8,9} // 2nd Index
        };

        //input
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Number:");

        for (int row = 0; row < array2D.length; row++){
//            System.out.print("Please Enter the Number: ");
            for (int column = 0; column < array2D[row].length; column++){
//                System.out.print("Please Enter row " + row + " and" + " Coloumn " + column + " Number ");
                int number = input.nextInt();
                array2D[row][column] = number;
            }
        }
        //Output
        for (int[] ints : array2D) {
//            System.out.print("Please Enter the Number: ");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(" ");
        }

        for (int[] ints : array2D) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
