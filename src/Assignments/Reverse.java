package Assignments;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to Reverse: ");
        int numberToReverse = input.nextInt();

        int reversedNumber = 0;

        while (numberToReverse > 0){
            int reminder = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + reminder;

            numberToReverse /=10;
        }

        System.out.println(reversedNumber);

    }
}
