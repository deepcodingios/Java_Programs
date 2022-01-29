package Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap numbers code
        int temp = a;
        a = b;
        b = temp;

        swap(10, 20);
        System.out.println(a + "" + b);
        System.out.println(System.in);
        System.out.print("Enter the name?");
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
