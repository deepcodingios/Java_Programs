package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list_1 = new ArrayList<>();
        list_1.add(17);
        list_1.add(28);
        list_1.add(30);

        ArrayList<Integer> list_2 = new ArrayList<>();
        list_2.add(99);
        list_2.add(16);
        list_2.add(8);
        compareTriplets(list_1,list_2);

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

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        // List<Integer> resultList = new List<Integer>();

        List<Integer> list = new ArrayList<Integer>(2);
        list.add(0);
        list.add(0);
        for(int i = 0; i<a.size();i++){
            if(a.get(i) > b.get(i)){
                int count = list.get(0);
                list.set(0, count+1);
            }else if (a.get(i) < b.get(i)){
                int count = list.get(1);
                list.set(1, count+1);
            }
        }

        return list;

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
