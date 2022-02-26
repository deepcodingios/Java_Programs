package Scaler.Assignments;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //------------------------------------------------------------------------
        /*
         1 2 3 4
         1 2 3
         1 2
         1
         */

        for (int i = 1; i <= number; i++) {

            int internalNumber = number - i + 1;

            for (int j = 1; j <= internalNumber; j++) {
                if(j<internalNumber){System.out.print(j + " ");}
                else{System.out.print(j);}

            }
            System.out.println();
        }

        //------------------------------------------------------------------------


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

        //------------------------------------------------------------------------
        /*
        *___*
        *__*
        *_*

        */
//        for (int i=1; i < number; i++) {
//            System.out.print("*");
//            int spaces = number-i;
//
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }

        //------------------------------------------------------------------------

        //------------------------------------------------------------------------
        /*

        ______*
        _____**
        ____***
        ___****
        __*****
        _******
        *******

         */

//        for (int rows = 1; rows <= number; rows++) {
////            System.out.print(number);
//            int spaces = number-1;
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print("_");
//            }
//            int stars = rows;
//            for (int i = 1; i <= stars; i++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        //------------------------------------------------------------------------

//        for (int i = 1; i <= number; i++) {
//
//            /*Spaces*/
//            for (int spaces = 1; spaces <= i-1; spaces++) {
//                System.out.print("_");
//            }
//            /*Stars*/
//            for (int stars = 1; stars <= number-i; stars++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        //------------------------------------------------------------------------

        /*Pattern 6
        1
        2 3
        4 5 6
        7 8 9 10
        * */

        int value = 1;
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value = value + 1;
            }
            System.out.println();
        }

        //______________________/

        for (int i = 1; i <= number; i++) {

            int leftStars = (number-i+1);
            int rightStars = (number-i+1);
            int spaces = 2*(i-1);

            for (int j = 1; j <= leftStars; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }

            for (int j = 1; j <= rightStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //______________________/

    }
}
