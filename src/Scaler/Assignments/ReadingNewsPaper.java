package Scaler.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingNewsPaper {
    public static void main(String[] args) {

        int totalLines = 1000;
        int [] array = {100, 100, 100, 100, 100, 100};

        int weekNumber = solve(totalLines,array);
        System.out.println(weekNumber);
    }

    static int solve(int A, int [] arr) {

        int remainingLines = A;

        int i = 0;

        while (remainingLines > 0){
            if (i == arr.length){
                i = 0;
            }
            remainingLines = remainingLines - arr[i];
            i++;
        }

        return i;
    }
}
