package Assignments;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Fruit Name: ");
        String fruit = input.next();

        /*Basic Switch Case*/
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits!");
            case "Apple" -> System.out.println("A Red Fruit which keeps Doctor Away!");
            default -> System.out.println("Please enter valid fruit name");
        }

        /*Nested Switch Case*/

        int employeeID = input.nextInt();
        String department = input.next();
        switch (employeeID){
            case 1:
                System.out.println("First Employee");
                break;
            case 2:
                System.out.println("Second Employee");
                break;
            case 3:
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "HR" -> System.out.println("HR Department");
                }
                break;
            default:
                System.out.println("Not a valid Employee Number");
                break;
        }
    }
}
