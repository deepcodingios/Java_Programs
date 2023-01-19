package Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {

        // int [] array = {4,6,7,3,5,7,9,5,6,8,9};

        // int lengthOfSubArray = 5;

    }

    static int findSubArraySum(int [] subArray, int start, int end){

        int sum = 0;

        for(int i = start; i <= end; i ++){

            sum = sum + subArray[i];
            
            System.out.println("The sum of SubArray is " + sum);
        }        

        return sum;
    }
    
    static int maxSubArraySumForLength(int [] A, int lengthOfSubArray){

        // int [] A = {4,6,7,3,5,7,9,5,6,8,9};

        // int lengthOfSubArray = 5;

        int maxSum = A[0];

        for(int i = 0; i<A.length; i++){

            if(i+lengthOfSubArray-1 < A.length){

                int answer = findSubArraySum(A, i, i+lengthOfSubArray-1);

                // System.out.println("Total Sum is " + answer);
                if (answer > maxSum){
                    maxSum = answer;
                }
            }           
        }
        return maxSum;
    }
}
