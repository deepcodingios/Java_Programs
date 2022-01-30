package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        swap(array,1, 2);
        System.out.println(Arrays.toString(array));

    }

    static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
