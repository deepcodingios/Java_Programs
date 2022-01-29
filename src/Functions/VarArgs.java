package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        function(10, 20, 30, 40);
        multipleArguments(10, 20, "Pradeep", "SriTalli", "Sahithi", "Nandhan");
    }

    /*Variable length Argument should always be at the last*/
    static void multipleArguments(int a, int b, String...v){
        System.out.println(Arrays.toString(v));
    }

    static void function(int...v){
        System.out.println(Arrays.toString(v));
    }
}
