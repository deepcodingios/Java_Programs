package Scaler.Assignments;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();

        for(int i = 1; i <= numberOfTestCases; i++){

            int number = scanner.nextInt();
            int count = 0;
            int sum = 0;

            while(number>0){
                int tempNumber = number%10;
                sum = sum + tempNumber;
                System.out.print(sum);
                number = number/10;
                System.out.println(number);
            }
            System.out.println(sum);
        }
    }
}
