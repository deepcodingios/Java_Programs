package BinaySearch;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {

        int[] array = {5,7,7,8,8,10};

        int[] arrayWithAnswers = searchRange(array,6);
        System.out.println(Arrays.toString(arrayWithAnswers));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};

        ans[0] = getIndex(nums, target, true);
        if (ans[-1] != -1){
            ans[1] = getIndex(nums, target, false);
        }

        return ans;
    }

    //This function returns the index of the target number
    static int getIndex(int[] array, int target, boolean findStartIndex){

        int answer = -1;

        int startIndex = 0;
        int endIndex = array.length -1;

        while(startIndex <= endIndex){
            //Find Middle Element
            int middle = startIndex + (endIndex - startIndex)/2;

            if (target < array[middle]){
                endIndex = middle-1;
//                    System.out.println("Start Index Incremented");
            }else if(target > array[middle]){
                startIndex = middle+1;
//                    System.out.println("End Index Decremented");
            }else{
                answer = middle;
                if (findStartIndex){
                    endIndex = middle -1;
                }else {
                    startIndex = middle + 1;
                }
            }
        }

        return answer;
    }
}
