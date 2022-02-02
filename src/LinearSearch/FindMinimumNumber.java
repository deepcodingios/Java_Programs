package LinearSearch;

public class FindMinimumNumber {
    public static void main(String[] args) {

        int[] array = {18, 20,-7,18, 45, 60};
        System.out.println(findMinimumNumber(array));
    }

    static int findMinimumNumber(int [] array){
        int answer = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] < answer){
                answer = array[i];
            }
        }
        return  answer;
    }
}
