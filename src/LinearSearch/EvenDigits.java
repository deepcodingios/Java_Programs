package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {

        int[] array = {123, 4567, 78905, 456784,345, 42, 5};
        System.out.println(findNumberOfEvenDigitsInAnArray(array));
    }

    static int findNumberOfEvenDigitsInAnArray(int[] array){
        int count = 0;

        for (int i = 0; i < array.length; i++){
            if (isContainsEvenNumberOfDigits(array[i])){
                count ++;
            }
        }
    return count;
    }

    static boolean isContainsEvenNumberOfDigits(int number){

        int numberOfDigits = getNumberOfDigits(number);
        return (numberOfDigits % 2 == 0);

    }

    static int getNumberOfDigits(int number){

        int count = 0;

        while (number > 0){
            count++;
            number = number/10;
        }
        return count;
    }
}
