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

                if (target > letters[middle]){
                    startIndex = middle+1;
                    System.out.println("Start Index Incremented");
                }else{
                    endIndex = middle-1;
                    System.out.println("End Index Decremented");
                }
            }
        return letters[startIndex % letters.length];
    }
}
