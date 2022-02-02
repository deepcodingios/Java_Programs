package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {34, 5, 6},
                {56, 7, 8},
                {45, 67, 90},
                {18,1234}
        };
//        int target = 12;

//        int[] answer = searchArray(array,target);

//        System.out.println(Arrays.toString(answer));
        System.out.println(searchArrayForMaximum(array));

    }

    static int searchArrayForMaximum(int[][] array){
        int max = Integer.MIN_VALUE;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    static int[] searchArray(int[][] array, int target){
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                if (array[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
