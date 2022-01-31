package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] array = {34,56,78,94,64,33};
        int target = 323;
        int answer = linearSearch(array,target);
        System.out.println(answer);
    }

    //Search in the Array: Return Element

    //Search in the Array: Return the index if item found. Return -1 is item not found
    static int linearSearch(int[] array, int integer){
        if (array.length == 0){
            return -1;
        }

        for (int index = 0; index < array.length; index++){
            //Check for the element
            int element = array[index];
            if (element == integer){
                return index;
            }
        }

        return -1;
    }
}
