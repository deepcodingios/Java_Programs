package Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {

         int [] array = {1,2,3,4,5,6};
         long resultSum = subArraySum(array);
        System.out.println("Total sum of Sub Arrays is " + resultSum);

        // int lengthOfSubArray = 5;

    }

    static long subArraySum(int [] A){
        long totalSum = 0;
        long length = A.length;

//        for(int i = 0; i < A.length; i++){
//            int tempSum = 0;
//            for(int j = i; j < A.length;j++ ){
//                tempSum = tempSum + A[j];
//                totalSum = totalSum + tempSum;
//            }
//        }

        for (int i = 0;i < A.length;i++){
            totalSum += A[i] * (i+1) * (length-i);
        }
        return totalSum;
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
