package Scaler.Assignments;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

//        for (int i = number; i > 1; i--) {
//
//            for (int j = 0; j < i+1; j++) {
//                if (j == 0 || j == i){
//                    System.out.print("*");
//                }else {
//                    System.out.print("_");
//                }
//            }
//            System.out.println("");
//        }

        for (int i=1; i < number; i++) {
            System.out.print("*");
            int spaces = number-i;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
