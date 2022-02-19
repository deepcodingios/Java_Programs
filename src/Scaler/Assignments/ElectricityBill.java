package Scaler.Assignments;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int units = scanner.nextInt();

        int billValue = 0;

        while (units > 0){

            if (units <=  50){
                billValue = calculateUnitRates(units);
                units -= 50;
            }else if(units > 50 && units <= 150){

            }
        }
    }

    static int calculateUnitRates(int unit){
        int bill = 0;
        if (unit > 250){
            bill *= 1.50;
        }else if(unit > 150 && unit <= 250){
            bill *= 1.20;
        }else if(unit > 50 && unit <= 150){
            bill *= 0.75;
        }else{
            bill *= 0.50;
        }

        return bill;
    }
}
