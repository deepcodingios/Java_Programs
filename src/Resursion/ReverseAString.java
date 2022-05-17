package Resursion;

public class ReverseAString {
    public static void main(String[] args) {

        String string = "pradeep";
        reverseString(string,0,string.length()-1);
//        System.out.println(reverseString);
    }

    static void reverseString(String string, int startIndex, int endIndex){

        if (startIndex >= string.length()){
            return;
        }

        System.out.println(string.charAt(endIndex));

        reverseString(string,startIndex+1,endIndex-1);
    }

//    static String reverse(String string, String reversedString){
//
//        if (string.length() <= 1){
//            reversedString = reversedString + string.charAt(string.length()-1);
//        }
//        else{
//            reversedString = reversedString + string.charAt(string.length()-1);
//            reverse(string.substring(0,string.length()-1), reversedString);
//        }
//
//        return reversedString;
//    }
}
