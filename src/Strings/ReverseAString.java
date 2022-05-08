package Strings;

public class ReverseAString {
    public static void main(String[] args) {

        String reverseString =  reverseAString("sisljfnlsjneflsijnlfevjnslrjnvslrjntvslkfjnvslekjnvslirjnvlskjndflvskjenflvsjnflvsjnflkvsjndflkjvsnlfekjnvslkfjnvslrkjnvslirjnfvldksjnfklvsjdnflvksjdnflvjksndflkjvsndlfkjnvsldjfnvsljdfnvlsjdfnvsljdfn");
        System.out.printf(reverseString);
    }

    static String reverseAString(String string){
        String reverseString = "";

        char [] characterArray = string.toCharArray();

//        for (int i = string.length() - 1; i >= 0; i--) {
//
//            reverseString = reverseString + characterArray[i];
//        }

        //Optimised Solution

        for (int i = 0; i < string.length()/2; i++) {

            char tempChar = characterArray[i];
            char replacedChar = characterArray[string.length()-1 - i];

            characterArray[(string.length()-1) -i] = tempChar;
            characterArray[i] = replacedChar;
        }

        return new String(characterArray);
    }
}
