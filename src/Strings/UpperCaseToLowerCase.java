package Strings;

public class UpperCaseToLowerCase {
    public static void main(String[] args) {

        String name = solve("PRADEEP");
        System.out.println(name);
    }

    static String solve(String A) {

        int length = A.length();

        String upperCaseString = "";

        for (int i = 0; i < length; i++) {

            Character character = A.charAt(i);
            upperCaseString = upperCaseString + Character.toLowerCase(character);
        }

        return upperCaseString;
    }
}
