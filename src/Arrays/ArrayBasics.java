package Arrays;

import java.util.stream.IntStream;

public class ArrayBasics {
    public static void main(String[] args) {

        //Syntax
        //datatype[] variable_name = new datatype[size];
        //Store 5 roll numbers:
        int[] array = new int[5];
        //or directly

        int[] rollNumbers = {1,2,3,4,5};
        System.out.println(rollNumbers.length);

        //Integer Array
        int[] ros;//declaration of array. ros is getting defined in the stack
        ros = new int[5];//Initialisation: Object here is being created in the memory(heap)
//        System.out.println(rollNumbers[2]);

        //String Array
        String[] names = new String[4];
//        String[] names = {};
//        System.out.println(names[1]);

        int indexOfObjectToBeRemoved = 3;

        array = removeTheElement(rollNumbers, indexOfObjectToBeRemoved);

        System.out.print(array.length);

    }

    static int[] removeTheElement(int[] arr, int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // return the resultant array
        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }
}
