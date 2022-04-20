package Basics;

import java.math.BigInteger;

public class PowerOfNumber {

    public static void main(String[] args) {

        int value = power("147573952589676412928");
        System.out.println(value);

    }

    static int power(String A) {

//        int number = Integer.parseInt(A);
        long number = Long.parseLong(A);
//        BigInteger number = BigInteger.pa Long.parseLong(A);
        BigInteger bigIntegerStr = new BigInteger(A);


        if (bigIntegerStr.intValue() == 0){
            return 0;
        }

        while (bigIntegerStr.intValue() > 1){

            if (bigIntegerStr.intValue() % 2 != 0){
                return 0;
            }

            number = bigIntegerStr.intValue()/2;
        }

        return 1;

    }
}


