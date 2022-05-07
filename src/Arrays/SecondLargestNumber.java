package Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {

        int [] array = {1, 3, 4, 5, -1, 0};

        int length = array.length;

        if(length <= 1){
            System.out.print("NA");
        }

        int maximum = 0;
        //Find Maximum first
        for(int i = 0; i < length; i++){
            int element = array[i];
            if (element > maximum){
                maximum = element;
            }
        }

        System.out.println("Maximum Element is " + maximum);
        int secondMaximum = Integer.MIN_VALUE;

        for(int i = 0; i < length; i++){
            if (array[i] != maximum) {
                secondMaximum = Math.max(secondMaximum, array[i]);
            }
        }
        System.out.print(secondMaximum);
    }
}
