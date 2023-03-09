package Stacks;

import java.util.Stack;

public class StackProblems {

    public static void main(String[] args) {
        String str = "(()";
        int returnValue = isBalanced(str);
        if (returnValue == 1)
            System.out.println("True");
        else
            System.out.println("False");
    }

    static int isBalanced(String A){

        Stack stack = new Stack();

        for(int i = 0; i < A.length(); i++){

            char character = A.charAt(i);

            if (character == '{' || character == '[' || character == '('){
                stack.push(character);
                continue;
            }

            if (stack.isEmpty()) return 0;

            char check;
            switch (character){
                case '(':
                    check = (char) stack.pop();
                    if (check == '(' || check == '{' || check == '[') return 0;
                    break;
                case ')':
                    check = (char) stack.pop();
                    if (check == '{' || check == '[') return 0;
                    break;
                case'}':
                    check = (char) stack.pop();
                    if (check == '(' || check == '[') return 0;
                    break;
                case']':
                    check = (char) stack.pop();
                    if (check == '{' || check == '(') return 0;
                    break;
            }
        }

        boolean checkStackSize = stack.isEmpty();
        if(checkStackSize == true) return 1;
        else return 0;
    }

    class Node{
        char data;
        Node next;

        Node(char data){
            this.data = data;
            next = null;
        }
    }

    private Node top;
//    static boolean isEmpty(){
//        return top == null;
//
//    }

    void push(char x){
        Node node = new Node(x);
        node.next = top;
    }

}
