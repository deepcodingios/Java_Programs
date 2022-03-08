package Scaler.Assignments;

import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for(int i = 1; i <= testCases;i++){

            int length = scanner.nextInt();

            int [] array = new int[length];

            for (int k = 0; k < array.length; k++)
            {
                array[i] = scanner.nextInt();
            }

            System.out.println(array);

            int searchNumber = scanner.nextInt();

            boolean isNumberFound = false;

            for (int j = 0; j < array.length; j++){
                if (array[j] == searchNumber){
                    isNumberFound = true;
                    break;
                }
            }

            if (isNumberFound){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
