package Arrays;

public class MaxValue {
    public static void main(String[] args) {

        int[] array = {1,2,4563,4,5,6};
        System.out.println(getMax(array));
    }

    static int getMax(int[] array) {

        int temp = 0;
        for (int i = 0; i < array.length; i ++){

            int number = array[i];
            if (number > temp){
                temp = number;
            }
        }
        return temp;
    }

}
