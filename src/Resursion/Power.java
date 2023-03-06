package Resursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(0,0));
        System.out.println(powerModulo(0,0,1));
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
}
