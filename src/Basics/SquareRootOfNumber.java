package Basics;

public class SquareRootOfNumber {
    public static void main(String[] args) {

        int result = findSquareRootOfNumber(121);
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
}
