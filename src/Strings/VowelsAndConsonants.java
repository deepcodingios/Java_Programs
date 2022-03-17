package Strings;

import java.util.ArrayList;

public class VowelsAndConsonants {
    public static void main(String[] args) {

        ArrayList<Integer> listWithCountOfVowelsAndConsonants = solve("interviewbit");
        System.out.println(listWithCountOfVowelsAndConsonants);

    }

    static ArrayList<Integer> solve(String A) {
        int countOfVowels = 0;
        int countOfConsonants = 0;

        int lengthOfString = A.length();

        ArrayList<Integer> listWithCountOfVowelsAndConsonants = new ArrayList<Integer>();

        for (int i = 0; i < lengthOfString; i++) {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u'){
                countOfVowels++;
            }else{
                countOfConsonants++;
            }
        }
        listWithCountOfVowelsAndConsonants.add(countOfVowels);
//        listWithCountOfVowelsAndConsonants.add(Integer.valueOf(" "));
        listWithCountOfVowelsAndConsonants.add(countOfConsonants);

        return listWithCountOfVowelsAndConsonants;
    }
}
