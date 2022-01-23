package Assignments;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import static java.lang.System.*;

public class Problems {

     static Problems problems = new Problems();
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        problems.getCurrencyinDollars();
//        problems.findLargestNumber();
//        problems.calculateSimpleInterest();
//        problems.computeWithFormula();
    }

    void getCurrencyinDollars(){

        Scanner firstInput = new Scanner(in);
        out.println("Enter Rupees: ");
        double indianCurrency = firstInput.nextDouble();

        double dollarCurrency = indianCurrency/74.42;
        out.println("Value in Dollars is "+ df.format (dollarCurrency) + "$");
    }

    void findLargestNumber(){
        Scanner firstInput = new Scanner(in);
        out.println("Enter FirstNumber: ");
        int firstNo = firstInput.nextInt();

        Scanner secondInput = new Scanner(in);
        out.println("Enter SecondNumber: ");
        int secondNo = secondInput.nextInt();

        if (firstNo > secondNo){
            out.println(firstNo+" is the Largest Number");
        }else {
            out.println(secondNo+" is the Largest Number");
        }
    }

    void computeWithFormula(){

        Scanner firstInput = new Scanner(in);
        out.println("Enter FirstNumber: ");
        int firstNumber = firstInput.nextInt();

        Scanner secondInput = new Scanner(in);
        out.println("Enter SecondNumber: ");
        int secondNumber = secondInput.nextInt();

        Scanner symbolInput = new Scanner(in);
        out.println("Enter Formula(Ex:- +,-,*,/): ");
        String symbol = symbolInput.next();

        problems.computeTwoNumbers(firstNumber,secondNumber,symbol);
    }

    void computeTwoNumbers(int firstNumber, int secondNumber, String symbol){

        switch (symbol) {
            case "+", "addition", "add" -> out.println("Addition of Two Numbers is " + (firstNumber + secondNumber));
            case "-", "difference", "minus" -> out.println("Difference of Two Numbers is " + (firstNumber - secondNumber));
            case "*", "multiply" -> out.println("Multiplication of Two Numbers is " + (firstNumber * secondNumber));
            case "/", "divide" -> out.println("Division of Two Numbers is " + (firstNumber / secondNumber));
            default -> out.println("No valid formula Provided!!");
        }

//        out.println("Addition");
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
