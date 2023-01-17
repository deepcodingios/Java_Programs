package Scaler.Assignments.General;
import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++){
            System.out.print(i + " ");
        }
    }

    public Long solve(int A) {

        long sum = 0;

        for(int i = 0; i <= A; i++){
            sum = (Long) sum + i;
        }

        return sum;
    }
}
