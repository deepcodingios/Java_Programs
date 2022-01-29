package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Anything that is initialised outside the block can be modified inside the block
        //Anything that is initialised inside the block can be initialised again outside the block

        //Block. Values Initialised in this block will remain in this Block.
        int c;
        {
            c = 100;
        }
        System.out.println(c);

        //Scoping in For Loops
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
    }

    static void sum(int marks){
        int num = 60;
        System.out.println(num);
        System.out.println(marks);
    }
}
