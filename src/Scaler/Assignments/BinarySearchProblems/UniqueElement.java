package Scaler.Assignments.BinarySearchProblems;

public class UniqueElement {
    public static void main(String[] args) {

        int [] array = {3,3,1,1,8,8,10,10,19,6,6,2,2,4,4};
        
        int output = findUniqueElement(array);
        
        System.out.println(output);
        
    }

    static int findUniqueElement(int [] A){

        //Check if first index is different than the second index. Return first index as it is the Unique Element
        if(A[0]!= A[1]){
            return A[0];
        }
        //Check if the last index is different than the previous last index. Return last index as it is the Unique Element
        int lengthOfArray = A.length;

        if(A[lengthOfArray-1]!= A[lengthOfArray-2]){
            return A[lengthOfArray-1];
        }

        int startIndex = 2;
        int lastIndex = lengthOfArray-3;

        while(startIndex <= lastIndex){

            int middleIndex = startIndex + (lastIndex - startIndex)/2;

            if((A[middleIndex]!=A[middleIndex-1]) && (A[middleIndex]!=A[middleIndex+1])){
                return A[middleIndex];
            }

            if(A[middleIndex] == A[middleIndex-1]){
                middleIndex --;
            }

            if(middleIndex %2 == 0){
                startIndex = middleIndex + 2;
            }else{
                lastIndex = middleIndex - 1;
            }
        }
        return 0;
    }
}
