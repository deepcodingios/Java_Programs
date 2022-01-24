package Assignments;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find: ");
        int number = input.nextInt();
        Scanner input_2 = new Scanner(System.in);
        int searchNumber = input.nextInt();
        System.out.println("Enter the number to find: ");

        int count = 0;

        while (number > 0){
            int reminder = number % 10;
            if (reminder == searchNumber){
                count ++;
            }
            number = number/10;
        }
        System.out.println("Count is " + count);
    }
}
