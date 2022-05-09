package Resursion;

public class FactorialOfANumber {
    public static void main(String[] args) {

    }
    static int solve(int A) {
        if (A == 1) {
            return 1;
        }
        return solve(A-1) * A;
    }
}
