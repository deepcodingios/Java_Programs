package BinaySearch;

import java.util.Arrays;

public class FindNumber {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,77,88,99,102,105,115,167};
        int answer = binarySearch(array,105);
        System.out.println(answer);

    }

    static int binarySearch(int[] array, int target){

        int startIndex = 0;
        int endIndex = array.length -1;

        while(startIndex <= endIndex){
            //Find Middle Element
            int middle = (startIndex+endIndex)/2;
            if (target == array[middle]){
                return middle;
            }else {
                if (target > array[middle]){
                    startIndex = middle+1;
                    System.out.println("Start Index Incremented");
                }else{
                    endIndex = middle-1;
                    System.out.println("End Index Decremented");
                }
            }
        }
        return -1;
    }
}
