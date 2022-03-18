package Basics;

public class PowerOfNumber {

    public static void main(String[] args) {

        int value = power("2");
        System.out.println(value);

    }

    static int power(String A) {

        int number = Integer.parseInt(A);

        if (number == 0){
            return 0;
        }

        while (number > 1){

            if (number % 2 != 0){
                return 0;
            }

            number = number/2;
        }

        return 1;

    }
}


