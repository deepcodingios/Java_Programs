package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MutiArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialisation
        for (int i = 0; i < 3; i ++){
            list.add(new ArrayList<>());
        }

        //Add Elements
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                int number = input.nextInt();
                list.get(i).add(number);
            }
        }

        System.out.println(list);
    }
}
