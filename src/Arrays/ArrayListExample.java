package Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(345);
        list.add(657);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        list.add(35);
        System.out.println(list);

        list.add(2,5);
        System.out.println(list);

    }
}
