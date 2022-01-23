package Assignments;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int firstNo = 0;
        int secondNo = 1;

        int count = 2;

        while (count <= number){
            int temp = secondNo;

            secondNo = firstNo + secondNo;
            firstNo = temp;
            count ++;
        }
        System.out.println(secondNo);
        System.out.println(secondNo);
    }
}
