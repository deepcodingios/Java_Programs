package Strings;

public class isPalindromeString {
    public static void main(String[] args) {
        String string = "abcba";

        int value = isPalindrome(string);
        System.out.println("Is the String Palindrome: " + value);
    }

    static int isPalindrome(String A){
        int lengthOfString = A.length();

        for (int i = 0; i < lengthOfString; i++){

            int currentIndex = i;

            int comparisonIndex = lengthOfString-i-1;

            System.out.println(currentIndex + "   " + comparisonIndex);

            if (currentIndex > comparisonIndex){
                break;
            }

            if (A.charAt(currentIndex) != A.charAt(comparisonIndex)){
                return 0;
            }
        }

        return 1;
    }
}
