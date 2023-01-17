package Scaler.Assignments.General;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        calculateBankBalance();

    }

    static void calculateBankBalance(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter starting balance: ");
        long balance = scanner.nextLong();

        System.out.println("Please enter no of operations: ");
        int numberOfOperations = scanner.nextInt();

        int finalAmount = 0;

        for(int i = 1; i <= numberOfOperations; i++){

            int operation = scanner.nextInt();
            System.out.println("Please enter operand: ");

            long amount = scanner.nextLong();
            System.out.println("Please enter amount: ");

            if(operation == 1){
                balance = balance + amount;
                System.out.println(balance);
            }else if(operation == 2){
                balance = balance - amount;
                if(balance > 0){
                    System.out.println(balance);
                }else{
                    System.out.println("Insufficient Funds");
                    break;
                }
            }
        }

    }
}
