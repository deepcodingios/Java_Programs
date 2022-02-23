package Scaler.Assignments;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int units = scanner.nextInt();

        int bill = solve(units);

        System.out.println(bill);

//        int billValue = 0;
//
//        while (units > 0){
//
//            if (units <=  50){
////                billValue = calculateUnitRates(units);
//                units -= 50;
//            }else if(units > 50 && units <= 150){
//
//            }
//        }
    }

    static int solve(int A) {
        Double bill=0.0;
        if(A<=50)
        {
            bill= A*(0.50);
        }
        else if(A<=150)
        {
            bill=50*0.50+(A-50)*0.75;
        }
        else if(A<=250)
        {
            bill=50*0.50+100*0.75+(A-150)*1.20;

        }
        else

        {
            bill=50*0.50+100*0.75+100*1.20+(A-250)*1.50;
        }
        Double total = bill+0.20*bill;
        return ((int)Math.floor(bill+0.2*bill));
    }

//    static int calculateUnitRates(int unit){
//        int bill = 0;
//        if (unit > 250){
//            bill *= 1.50;
//        }else if(unit > 150 && unit <= 250){
//            bill *= 1.20;
//        }else if(unit > 50 && unit <= 150){
//            bill *= 0.75;
//        }else{
//            bill *= 0.50;
//        }
//
//        return bill;
//    }
}
