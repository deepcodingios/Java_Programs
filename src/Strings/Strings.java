package Strings;

public class Strings {

    public static void main(String[] args) {

//        learningCharacterArray("Pradeep");
//        reverseString("abcdefg");
        String output = reverseWordsInASentence("My Name is Pradeep");
        System.out.println(output);
    }

    static String reverseWordsInASentence(String S){

        String [] array = S.split(" ");

        int lengthOfString =  array.length;

        String reversedString = "";

        for (int i = lengthOfString-1; i >= 0; i--) {
            if (i == 0){
                reversedString = reversedString + array[i];
            }else {
                reversedString = reversedString + array[i] + " ";
            }
        }

        return reversedString;

    }

    static void reverseString(String S){

        char [] characterArray = S.toCharArray();

        int p1 = 0; int p2 = characterArray.length-1;

        while (p1 < p2){
            char t = characterArray[p1];
            characterArray[p1] = characterArray[p2];
            characterArray[p2] = t;
            p1 = p1 + 1;
            p2 = p2 -1;
        }

        for (int i = 0; i < characterArray.length; i++) {
            System.out.print(characterArray[i]);
        }
    }

    static void learningCharacterArray(String S){
        //.toCharArray can convert your string to a char[]

        char[] ch = S.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }
    }
}
