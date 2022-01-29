package Assignments;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = input.nextInt();
        System.out.println(isArmStrongNumber(n));
    }

    //Print all three digits Armstrong number
    static boolean isArmStrongNumber(int number){

        int origianl = number;
        int sum = 0;

        while (number > 0){

            int reminder = number % 10;
            number = number/10;
            sum = sum + reminder*reminder*reminder;
        }

        return sum == origianl;
    }
}
