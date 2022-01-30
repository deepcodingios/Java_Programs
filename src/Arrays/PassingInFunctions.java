package Arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {

        int [] array = {1,2,3,4};
        System.out.println(Arrays.toString(array));
        change(array);
        System.out.println(Arrays.toString(array));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
