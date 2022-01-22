package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String welcomeMessage = input.nextLine();
        System.out.println("Hello " + welcomeMessage);

    }
}
