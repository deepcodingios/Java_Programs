package Strings;

public class CompareTheStrings {
    public static void main(String[] args) {

        int returnValue = solve("interview","bit");
        System.out.println(returnValue);
    }

    static int solve(String A, String B) {

        int length1 = A.length();
        int length2 = B.length();

        int finalLength = 0;

        if (length1 > length2){
            finalLength = length2;
        }else{
            finalLength = length1;
        }

        for(int i = 0; i <finalLength; i++){
            int value1 = A.charAt(i);
            int value2 = B.charAt(i);

            if (value1 < value2){
                return -1;
            }else if(value1 > value2){
                return 1;
            }
        }

        return 0;

//        System.out.println("String1Value is " + string1Value);
//        System.out.println("String2Value is " + string2Value);
    }
}
