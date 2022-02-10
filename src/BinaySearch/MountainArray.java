package BinaySearch;

public class MountainArray {
    public static void main(String[] args) {
        //[1,2,3,1]
        //[1,2,1,3,5,6,4]
        int[] array = {1,2,3,6,5,4,3,2,1};
//        int[] array = {1,2,1,3,5,6,4};
//        int[] array = {1,2,3,1};//[2,1]
//        [6,5,4,3,2,3,2]
//        int[] array = {6,5,4,3,2,3,2};
        System.out.println("Peak Index Value is " + findPeakIndexFromArray(array));
        System.out.println("Peak Number is " + array[findPeakIndexFromArray(array)]);
    }

    static int findPeakIndexFromArray(int[] nums){

        int peakIndex = -1;

        int startIndex = 0;
        int endIndex = nums.length -1;

        while (startIndex <= endIndex){
            //Find Middle Element
            int middle = startIndex + (endIndex - startIndex)/2;
            System.out.println("Middle Value is " + middle);

            if (nums.length == 1){
                return nums[0];
            }else if (nums.length == 2){
                if (nums[0] < nums[1]){
                    return 1;
                }else {
                    return 0;
                }
            }

            if (nums[middle] > nums[middle-1] && nums[middle] > nums[middle +1]){
                System.out.println("Returning Middle Index in if condition is " + middle);
                return middle;
            }
            else if (nums[middle] > nums[middle+1]){
                endIndex = middle;
                System.out.println("End Index Changed to " + middle);
//                    System.out.println("Start Index Incremented");
            }else if(nums[middle] < nums[middle+1]){
                startIndex = middle;
                System.out.println("Start Index Changed to " + middle);
//                    System.out.println("End Index Decremented");
            }else {//if (nums[middle] > nums[middle+1] && nums[middle] < nums[middle-1])
                System.out.println("Returning Middle Index in else condition is " + middle);
                return middle;
            }
        }
        return peakIndex;
    }

    /*
    Solution by Kunal Kushwaha
     */
    static int peakIndexInMountainArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length -1;

        while (startIndex < endIndex){

            int middle = startIndex + (endIndex - startIndex)/2;

            if (arr[middle] > arr[middle+1]){
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

}
