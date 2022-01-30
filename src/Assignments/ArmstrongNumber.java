package Assignments;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = input.nextInt();
        System.out.println(isArmstrongNumber(n));
//        System.out.println(printThreeArmStrongNumbers(n));
    }

    static boolean isArmstrongNumber(int number){

        int original = number;
        int sum = 0;
        int lengthOfNumber = String.valueOf(number).length();

        while (number > 0){

            int reminder = number % 10;

            //Find the Power of give Number
            int exponent = 1;
            for (int i = 1; i <= lengthOfNumber; i++){
                exponent = reminder * exponent;
            }
            number = number/10;

            sum = sum + exponent;
        }

        return sum == original;
    }

    //Print all three digits Armstrong number
    static boolean printThreeArmStrongNumbers(int number){

        int original = number;
        int sum = 0;

        while (number > 0){

            int reminder = number % 10;
            number = number/10;
            sum = sum + reminder*reminder*reminder;
        }

        return sum == original;
    }
}
