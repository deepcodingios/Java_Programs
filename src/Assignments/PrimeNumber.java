package Assignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = input.nextInt();
        System.out.println(isPrimeNumber(n));
        printAllPrimesTillTheNumber(-5);
    }

    static boolean isPrimeNumber(int number) {
        int count = 0;

        for(int i = 1; i <= number; i++){
//            System.out.println("Count is " + count + " and i value is " + i);
            if (number % i == 0){
//                System.out.println("i value is " + i);
                count ++;
            }

            if (count >= 3){
//                System.out.println("Exited the loop with count: " + count);
                break;
            }
        }
        if(count == 2){
//            System.out.println("YES");
            return true;
        }else{
//            System.out.println("NO");
            return false;
        }
    }

    static boolean isPrime(int n){

        if (n <= 1){
            return false;
        }

        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    static void printAllPrimesTillTheNumber(int number){

        int count = 0;
        for (int i = 1; i < number; i++) {

            boolean isPrime = isPrimeNumber(i);
            if (isPrime){
                count++;
                System.out.print(i + " ");
            }
        }
        if (count == 0){
            System.out.println("There are no prime numbers less than n");
        }
    }
}
