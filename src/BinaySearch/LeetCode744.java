package BinaySearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class LeetCode744 {
    public static void main(String[] args) {

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int startIndex = 0;
        int endIndex = letters.length -1;

        while(startIndex <= endIndex){
            //Find Middle Element
            int middle = startIndex + (endIndex - startIndex)/2;

            if (target < letters[middle]){
                endIndex = middle-1;

            }else{
                startIndex = middle+1;
            }
        }
        return letters[startIndex % letters.length];
    }
}
