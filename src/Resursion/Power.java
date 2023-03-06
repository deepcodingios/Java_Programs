package Resursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(find(5,5));
//        System.out.println(isMagicNumber(83557));
//        System.out.println(sumOfDigits(250));
//        System.out.println(power(0,0));
//        System.out.println(powerModulo(0,0,1));
    }

    static int power(int a, int p){
        if (p == 0) return 1;
        int powerValue = power(a,p/2);
        if (p%2 == 0){
            return powerValue*powerValue;
        }else {
            return powerValue*powerValue*a;
        }
    }

    static long powerModulo(int A, int B, int C){
        /*If the number is negative, Make sure the number is positive.
        Taking a modulo of the negative number and adding the modulo makes a negative number as positive */

        if (A < 0){
            A = (A % C) + C;
        }

        if (A== 0 && B == 0){
            return 1;
        }
        long p = powerModulo(A,B/2,C);
        if (B % 2 == 0){
            return (p*p)%C;
        }else {
            return (((A%C) * ((p*p)%C))%C);
        }
    }

    static int sumOfDigits(int A){
        if (A == 0){
            return 0;
        }
        int division = A/10;
        int reminder = A%10;

        return reminder + sumOfDigits(division);
    }

    static int isMagicNumber(int A){

        if (A == 0){
            return 0;
        }
        int division = A/10;
        int reminder = A%10;

        int result = reminder + sumOfDigits(division);

        while (result > 9){
            result = isMagicNumber(result);
        }

        if (result != 1){
            return 0;
        }else {
            return 1;
        }
    }

    static int find(int A, int B){

        if(B == 0){
            return 0;
        }

        int p = find(A-1,B/2);
        if (B % 2 == 0){
            return p;
        }else {
            return 1-p;
        }
    }
}
