package Basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        //Input (Build a Scanner)
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the First Number");
        long firstNumber = myScanner.nextLong();
//        System.out.println("Please enter the Second Number");
//        int b = myScanner.nextInt();
//        System.out.println("Please enter the First Number");
//        int c = myScanner.nextInt();
        long sum = 0;


        sum = (firstNumber*(firstNumber+1))/2;

        // for(int i = 0; i <= A; i++){
        //     sum = (long) sum + i;
        // }

        System.out.print(sum);

//        if (firstNumber > b){
//            System.out.println("The Biggest number is " + firstNumber);
//        }else {
//            System.out.println("The Biggest number is " + b);
//        }

    }
}
