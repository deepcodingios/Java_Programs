package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(345);
        list.add(657);
//        System.out.println(list);

        list.remove(0);
//        System.out.println(list);
        list.add(35);
//        System.out.println(list);

        list.add(2,5);
        System.out.println(list);

        ArrayList<Integer> list1 = solve(list);
        System.out.println(list1);

    }

    static ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = A.size()-1; i >= 0; i--){
            list.add(A.get(i));
            System.out.println(A.get(i));
        }

        return list;
    }
}
