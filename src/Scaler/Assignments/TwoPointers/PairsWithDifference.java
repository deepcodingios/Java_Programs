package Scaler.Assignments.TwoPointers;

public class PairsWithDifference {
    public static void main(String[] args) {

//        int array [] = {-3,0,1,3,6,8,11,14,18,25};
        int array [] = {1, 5, 3, 4, 2};
        int array2 [] = {1,1};
        //1, 5, 3, 4, 2
        //8, 12, 16, 4, 0, 20
        //1, 1, 1, 2, 2

        int count = countPairsWithDifference(array,3);
        int sumCount = countPairsWithSum(array2,2);

        System.out.println("The count of pairs is " + count);
        System.out.println("The count of sum pairs is " + sumCount);
    }

    static int countPairsWithDifference(int [] A,int K){

        int i = 0; int j = 1; int count = 0;

        while (j < A.length){
            if (A[j]-A[i] == K && i!=j){
                count ++;
                j++;
            } else if (A[j]-A[i] > K && i!=j) {
                i++;
            }else {
                j++;
            }
        }
        return count;
    }

    static int countPairsWithSum(int [] A,int K){

        int i = 0; int j = A.length-1; int count = 0;

        int height = Math.min(A[i],A[j]);

        while (i < j){
            if (A[i]+A[j] == K){
                count ++;
//                i++;
            } else if (A[i]+A[i] > K) {
                j--;
            }else {
                i++;
            }
        }
        return count;
    }
}
