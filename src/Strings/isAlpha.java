package Strings;

import java.util.ArrayList;

public class isAlpha {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
//        System.out.println(list);
//        isAlpha(list);
        System.out.println(isAlpha(list));

    }

    static int isAlpha(ArrayList<Character> A){

        int returnNumber = 0;

        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i));
            int castAscii = (int) A.get(i);
            System.out.println(castAscii);
            if (castAscii >= 65 || castAscii <= 90 || castAscii >= 97 || castAscii <= 122){
                returnNumber = 1;
            }else{
                returnNumber = 0;
            }
        }
        return returnNumber;
    }
}
