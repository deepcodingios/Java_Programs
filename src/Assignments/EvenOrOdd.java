package Assignments;

//import com.sun.source.tree.AssignmentTree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        EvenOrOdd obj = new EvenOrOdd();
//        obj.isOddOrEven();
        obj.isPalindrome();

    }

    void isOddOrEven(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int inputNumber = input.nextInt();

        if (inputNumber % 2 == 0){
            System.out.println("This is an Even Number");
        }else {
            System.out.println("This is an ODD Number");
        }
    }

    void isPalindrome(){
//        System.out.println("Palindrome Number");

        Scanner input = new Scanner(System.in);
        // System.out.println("Enter the Number to Reverse: ");
        int numberToReverse = input.nextInt();

        int tempNumber = numberToReverse;

        int reversedNumber = 0;

        while (numberToReverse > 0){
            int reminder = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            System.out.println("ReversedNumber = " + numberToReverse);

            numberToReverse /=10;
            System.out.println(numberToReverse);
        }

        System.out.println("Final Reversed Number is " + reversedNumber);
        System.out.println("Number to reverse is " + numberToReverse);

        if(reversedNumber == tempNumber){
            System.out.print("YES");
        }else{
            System.out.print("No");
        }
    }
}
