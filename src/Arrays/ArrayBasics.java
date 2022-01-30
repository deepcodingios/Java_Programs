package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {

        //Syntax
        //datatype[] variable_name = new datatype[size];
        //Store 5 roll numbers:
        int[] array = new int[5];
        //or directly

        int[] rollNumbers = {1,2,3,4,5};

        //Integer Array
        int[] ros;//declaration of array. ros is getting defined in the stack
        ros = new int[5];//Initialisation: Object here is being created in the memory(heap)
        System.out.println(rollNumbers[2]);

        //String Array
        String[] names = new String[4];
//        String[] names = {};
        System.out.println(names[1]);

    }
}
