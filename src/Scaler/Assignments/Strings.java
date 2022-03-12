package Scaler.Assignments;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String str = solve("aaabbbb");
//        timeValue();
        System.out.println(str);
    }

    static void timeValue(){
        Scanner input = new Scanner(System.in);
        int ananyaStartTime = input.nextInt();
        int ananyaEndTime = input.nextInt();

        int bhavyaStartTime = input.nextInt();
        int bhavyaEndTime = input.nextInt();

        int maxFirstNumber = 0;

        if(bhavyaStartTime >= ananyaStartTime || bhavyaStartTime >= ananyaEndTime || bhavyaEndTime < ananyaStartTime){
            System.out.print(0);
        }else{
            if(bhavyaStartTime>ananyaStartTime && ananyaEndTime<bhavyaEndTime){
                System.out.print(ananyaEndTime-bhavyaStartTime);
            }else{
                if(ananyaEndTime>bhavyaEndTime){
                    System.out.print(bhavyaEndTime-bhavyaStartTime);
                }else{
                    System.out.print(ananyaEndTime-ananyaStartTime);
                }
            }
        }
    }

    static String solve(String A) {

        char comparisonCharacter1 = 'a';
        char comparisonCharacter2 = 'b';

        String returnValue = "No";

        if (A == "ab"){
            return "Yes";
        }

        if(!(A.contains("a") && A.contains("b"))){
            return "No";
        }

        if(A.charAt(0) != 'a' && A.charAt(0) != 'b'){
            return "No";
        }

        for(int i = 0; i < A.length();i ++){

            if(A.charAt(i) != 'a' && A.charAt(i) != 'b'){
                returnValue = "No";
            }

            if(A.length() > i+1){

                if(((A.charAt(i) == comparisonCharacter1) && (A.charAt(i+1) == comparisonCharacter1)) || ((A.charAt(i) == comparisonCharacter2) && (A.charAt(i+1) == comparisonCharacter2))){
                    returnValue = "Yes";
                }else{
                    returnValue = "No";
                }
            }
        }

        return returnValue;
    }
}
