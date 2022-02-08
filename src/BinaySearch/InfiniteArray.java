package BinaySearch;

//Find Position of an element in a Sorted Array of Infinite Numbers.

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 200;
        System.out.println(findingRange(arr,target));
    }

    static int findingRange(int[] array, int target){
        int start = 0;
        int end = 1;

        while (target > array[end]){
            int temp = end + 1;
            end = end + (end-start+1) * 2;

            /*Another possible formula to calculate the next start and next end*/
//            start = end + 1;
//            end = (start * 2) + 1;
        }

        return binarySearch(array,target,start,end);
    }

    static int binarySearch(int[] array, int target, int startIndex, int endIndex){

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
                return middle;
            }
        }
        return -1;
    }
}
