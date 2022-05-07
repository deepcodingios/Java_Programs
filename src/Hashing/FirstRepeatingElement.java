package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(6);

        int answer = findFirstRepeatingElement(list);
        System.out.printf("Repeating Element is " + answer);

    }

    static int findFirstRepeatingElement(ArrayList<Integer> arrayList){

        int repeatingElement = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = arrayList.size()-1; i > 0; i--) {

            if (map.containsKey(arrayList.get(i))) {
                repeatingElement = arrayList.get(i);
            }else {
                map.put(arrayList.get(i),1);
            }
        }
        return repeatingElement;
    }
}
