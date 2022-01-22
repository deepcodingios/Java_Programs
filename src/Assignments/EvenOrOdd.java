package Assignments;

//import com.sun.source.tree.AssignmentTree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        EvenOrOdd obj = new EvenOrOdd();
        obj.isOddOrEven();
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
        System.out.println("Palindrome Number");
    }
}
