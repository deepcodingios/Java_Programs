package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[2];
//        array[0] = 234;
//        array[1] = 45;
        System.out.println(array[1]);

        for (int i = 0; i < array.length; i++){
            System.out.print("Please Enter the Number: ");
            array[i] = input.nextInt();
        }

        System.out.println(array);

        for (int num:array) {
            System.out.print(num + " ");
        }

        System.out.println(Arrays.toString(array));

        //Array of Objects
        String[] strings = new String[4];

        for (int i = 0; i < strings.length; i ++){
            strings[i] = input.next();
        }
        System.out.println(Arrays.toString(strings));
    }
}
