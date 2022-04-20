package Basics;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
    public static void main(String[] args) {

        convertDecimalToBinary(25);

    }

    static List<Integer> convertDecimalToBinary(int number){

//        int [] array = new int[8];
        List<Integer> array = new ArrayList<>();

        int index = 0;
        while(number > 0){
            int reminder = number%2;
            number = number/2;
            System.out.println("Number is : " + number + " Reminder is :" + reminder);
            array.add(reminder);
            System.out.println(array.get(index));
            index++;
        }

        for (int i = array.size() -1; i >= 0; i--) {
            System.out.print(array.get(i));
        }

        return array;
    }
}
