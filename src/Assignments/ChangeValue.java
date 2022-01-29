package Assignments;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        change(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99; // This is changing the reference of the Array that is sent in the method argument.
        nums [1] = 100;
        nums [2] = 200;
    }
}
