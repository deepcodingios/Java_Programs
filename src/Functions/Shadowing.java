package Functions;
/*
Shadowing is a practice to use a variable with a same name in different methods
* */

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        function();
    }

    static void function(){
        System.out.println(x);
    }
}
