package Scaler.Assignments.General;

public class FindUniqueElement {
    public static void main(String[] args) {

        int element = findUniqueElement();

        System.out.println(element);

    }

    static int findUniqueElement(){

        int [] array = {3,2,7,2,3,7};

        for (int i = 0; i < array.length; i++){

            int frequencyOfNumber = findFrequencyOfaNumberInAnArray(array,array[i]);

            if (frequencyOfNumber == 1){
                return array[i];
            }
        }

        return 0;
    }

    static int findFrequencyOfaNumberInAnArray(int [] array, int number){

        int count = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] == number){
                count++;
            }
        }
        return count;
    }
}
