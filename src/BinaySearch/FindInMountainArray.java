package BinaySearch;

public class FindInMountainArray {
    public static void main(String[] args) {

    }

    static int findInMountainArray(int[] array, int target){

        int peakIndex = peakIndexInMountainArray(array);

        int firstTry = orderAgnosticBinarySearch(array, target, 0,peakIndex);

        if (firstTry != -1){
            return firstTry;
        }

        return orderAgnosticBinarySearch(array,target,peakIndex, array.length -1);


    }

    static int peakIndexInMountainArray(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length -1;

        while (startIndex < endIndex){

            int middle = startIndex + (endIndex - startIndex)/2;

            if (nums[middle] > nums[middle+1]){
                //You are in the Descending Part of the Array
                //This may be the answer but look at Left of the Array
                //This is why end!= mid -1;
                endIndex = middle;
            }else {
                //You are in the Ascending part of the Array
                startIndex = middle +1;
            }
        }

        return startIndex;
    }

    static int orderAgnosticBinarySearch(int[] array, int target, int startIndex, int endIndex){

        //Find whether the Array is sorted in Ascending or Descending
        boolean isAscending = array[startIndex] < array[endIndex];

        while(startIndex <= endIndex){
            //Find Middle Element
            int middle = (startIndex+endIndex)/2;
            if (target == array[middle]){
                return middle;
            }

            if (isAscending){
                if (target > array[middle]){
                    startIndex = middle+1;
                    System.out.println("Start Index Incremented");
                }else{
                    endIndex = middle-1;
                    System.out.println("End Index Decremented");
                }
            }else {
                if (target < array[middle]){
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
