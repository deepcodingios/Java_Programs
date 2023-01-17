package Basics;

import javax.lang.model.util.ElementScanner14;
import javax.xml.stream.events.EndElement;

public class SquareRootOfNumber {
    public static void main(String[] args) {

        // int result = findSquareRootOfNumber(121);
        int result = findSquareRootOfNumberWithBinarySearch(0);
        System.out.println(result);
    }

    static int findSquareRootOfNumber(int number){

        // Base cases
        if (number == 0 || number == 1)
            return number;

        // Starting from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;

        while (result < number) {
            i++;
            result = i * i;
            System.out.println(i + " " + result);
        }

        if (i*i == number){
            return i;
        }
        return -1;
    }

    static int findSquareRootOfNumberWithBinarySearch(int A){

        int startIndex = 1;
        int lastIndex = A/2;

        int answer = 0;

        while(startIndex <= lastIndex){

            int middleIndex = startIndex + (lastIndex - startIndex)/2;

            if(A == middleIndex*middleIndex){
                return middleIndex;
            }
            else if(middleIndex*middleIndex < A){
                answer = middleIndex;
                startIndex = middleIndex+1;

            }else{

                lastIndex = middleIndex -1;
            }

        }        
        return answer;
    }
}
