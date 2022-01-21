package com.company;

import java.util.Scanner;

public class Inouts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some input: ");
        int rollNo = input.nextInt();
        System.out.println("Your Roll Number is " + rollNo);
    }
}
