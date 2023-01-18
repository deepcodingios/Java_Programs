package Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {

        int [] array = {4,6,7,3,5,7,9,5,6,8,9};

        int lengthOfSubArray = 5;

        for(int i = 0; i<array.length; i++){

            if(i+lengthOfSubArray-1 < array.length){

                int answer = findSubArraySum(array, i, i+lengthOfSubArray-1);

                System.out.println("Total Sum is " + answer);
            }           
        }
    }

    static int findSubArraySum(int [] subArray, int start, int end){

        int sum = 0;

        for(int i = start; i <= end; i ++){

            sum = sum + subArray[i];
            
            System.out.println("The sum of SubArray is " + sum);
        }        

        return sum;
    }
    
    static void MaxSubArraySumForLength(int [] A, int length){

    }
}
