package Functions;

public class MethodOverloading {
    public static void main(String[] args) {

        function_1(30);
        function_1("Pradeep");
    }

    static void function_1(int a){
        System.out.println(a);
    }

    static void function_1(String a){
        System.out.println(a);
    }
}
