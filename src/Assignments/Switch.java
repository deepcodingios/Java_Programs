package Assignments;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Fruit Name: ");
        String fruit = input.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits!");
            case "Apple" -> System.out.println("A Red Fruit which keeps Doctor Away!");
            default -> System.out.println("Please enter valid fruit name");
        }
    }
}
