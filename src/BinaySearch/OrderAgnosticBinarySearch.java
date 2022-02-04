package BinaySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

    }

    static int orderAgnosticBinarySearch(int[] array, int target){
        int startIndex = 0;
        int endIndex = array.length -1;

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
