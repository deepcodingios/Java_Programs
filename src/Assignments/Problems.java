package Assignments;

import java.util.Scanner;

import static java.lang.System.*;

public class Problems {
    public static void main(String[] args) {

        Problems problems = new Problems();
        problems.calculateSimpleInterest();
    }

    void calculateSimpleInterest(){

        Scanner input = new Scanner(in);

        out.println("Please enter the Principal Amount: ");
        int principalAmount = input.nextInt();
        out.println("Your Principal Amount is " + principalAmount);

        out.println("Please enter your Rate Of Interest: ");
        double rateOfInterest = input.nextDouble();
        out.println("Your Rate Of Interest is " + rateOfInterest + "%");

        out.println("Please enter Time: ");
        double timeToCalculate = input.nextDouble();
        out.println("Your Time to calculate the Simple Interest " + timeToCalculate + "%");

        double calculate = rateOfInterest/100;
        out.println(calculate);

        double simpleInterest = principalAmount * (1 + (rateOfInterest/100) * (timeToCalculate));
        out.println("Your Simple Interest is " + simpleInterest);
    }
}
