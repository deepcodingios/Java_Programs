package Basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        //Input (Build a Scanner)
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the First Number");
        int firstNumber = myScanner.nextInt();
        System.out.println("Please enter the Second Number");
        int b = myScanner.nextInt();
//        System.out.println("Please enter the First Number");
//        int c = myScanner.nextInt();

        if (firstNumber > b){
            System.out.println("The Biggest number is " + firstNumber);
        }else {
            System.out.println("The Biggest number is " + b);
        }

    }
}
