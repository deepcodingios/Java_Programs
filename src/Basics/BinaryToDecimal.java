package Basics;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner input = new Scanner(System.in);
        long binaryNumber = input.nextLong();
        int decimal = convertBinaryToDecimal(binaryNumber);
        System.out.print(decimal);
    }

    static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }

        return decimalNumber;
    }
}
