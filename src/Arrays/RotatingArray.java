package Arrays;

import java.util.Arrays;

public class RotatingArray {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};

        rotateArray(array,2);
    }

    static void rotateArray(int [] array, int rotation){

        int lengthOfArray = array.length;

        for (int j = 1; j <= rotation; j++) {

            int temp = array[lengthOfArray -1];

            for (int i = lengthOfArray -2; i >= 0; i--) {
                array[i+1] = array[i];
            }
            array[0] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
