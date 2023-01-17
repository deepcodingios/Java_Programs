package Scaler.Assignments.General;
import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
