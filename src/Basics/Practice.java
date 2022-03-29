package Basics;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n=sc.nextInt();
//        int sum=0;
//        while(n>0)
//        {
//            int r=n%10;
//            sum=(sum*10)+r;
//            n=n/10;
//
//        }
        int count = 0;
//        for (int i = 10; i > 0; i /= 2) {
//            System.out.println("i value is " + i);
//            for (int j = 0; j < i; j++) {
//                count += 1;
//                System.out.print(" " + j);
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i value is " + i);
            for (int j = 10; j > i; j--) {
//                a = a + i + j;
                System.out.print(" " + j);
            }
            System.out.println();
        }

//        System.out.println("Reverse is"+" s"+sum);
    }
}
