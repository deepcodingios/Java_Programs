package BinaySearch;

// Ceiling:- The Smallest Element in an Array which is greater than or equal to the target
public class Ceiling {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,77,88,99,102,105,115,167};
        int answer = ceilingOfANumber(array,85);
        System.out.println(answer);
    }

    static int ceilingOfANumber(int[] array, int target){
        int startIndex = 0;
        int endIndex = array.length -1;

        while(startIndex <= endIndex){
            //Find Middle Element
            int middle = (startIndex+endIndex)/2;
            if (target == array[middle]){
                return array[middle];
            }else {
                if (target > array[middle]){
                    startIndex = middle+1;
                    System.out.println("Start Index Incremented");
                }else{
                    endIndex = middle-1;
                    System.out.println("End Index Decremented");
                }
            }
        }

        return array[startIndex];
    }
}
