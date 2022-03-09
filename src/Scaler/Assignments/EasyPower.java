package Scaler.Assignments;
import java.util.*;

public class EasyPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int powerNumber = scanner.nextInt();

        int result = 1;

        for(int i = 1; i <= powerNumber; i++){
            result = result * number;
        }

        System.out.print(result);
    }
}
