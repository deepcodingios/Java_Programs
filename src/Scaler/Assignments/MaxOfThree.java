package Scaler.Assignments;
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = myScanner.nextInt();

        int[] array = {a,b,c};
        int max = a;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }

        System.out.print(max);

//        if(a > b && a > c){
//            System.out.print(a);
//        }else if(b > a && b > c){
//            System.out.print(b);
//        }else{
//            System.out.print(c);
//        }
    }
}
