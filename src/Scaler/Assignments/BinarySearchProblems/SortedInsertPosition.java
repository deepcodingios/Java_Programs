package Scaler.Assignments.BinarySearchProblems;

public class SortedInsertPosition {

    public static void main(String[] args) {
        
        int[] array = {4,6,8,10,12};

        int index = searchInsert(array, 5);

        System.out.println(index);

    }

    static int searchInsert(int[] A, int target) {

        // int outputIndex;

        int startIndex = 0;
        int endIndex = A.length-1;

        while (startIndex <= endIndex) {

            int middleIndex = startIndex + (endIndex - startIndex)/2;

            if(target < A[middleIndex]){
                endIndex = middleIndex-1;
            }
            else if(target > A[middleIndex]){
                startIndex = middleIndex + 1;
            }else{
                return middleIndex;
            }                        
        }
        return startIndex;
    }
}
