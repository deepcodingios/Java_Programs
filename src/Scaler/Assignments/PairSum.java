package Scaler.Assignments;

public class PairSum {
    public static void main(String[] args) {
        int [] array = {1,1,1};//{1,2,3,2,1};//
        int sumValue = 2;

        int length = array.length;
        int pairSumCount = 0;

        for (int i = 0; i < length; i++){

            for (int j = i+1; j < length; j++) {

                if (array[i] + array[j] == sumValue){
//                    System.out.println(" SumValue is equal to the pairs");
                    pairSumCount++;
                }
            }
//            System.out.println();
        }
        System.out.println("PairSum count is :" + pairSumCount);
    }
}
