package Trees;

//import javax.swing.tree.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
}

public class Trees {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
    }

    static ArrayList<Integer> inorderTraversal(TreeNode A, ArrayList<Integer> list) {
        if (A == null){
            return list;
        }
        inorderTraversal(A.left,list);
        list.add(A.val);
        inorderTraversal(A.right,list);
        return list;
    }

    static ArrayList<Integer> preorderTraversal(TreeNode A, ArrayList<Integer> list) {
        if (A == null){
            return list;
        }
        list.add(A.val);
        preorderTraversal(A.left,list);
        preorderTraversal(A.right,list);
        return list;
    }

    static ArrayList<Integer> postorderTraversal(TreeNode A, ArrayList<Integer> list) {
        if (A == null){
            return list;
        }
        postorderTraversal(A.left,list);
        postorderTraversal(A.right,list);
        list.add(A.val);

        return list;
    }

    static int isSymmetric(TreeNode A){

        TreeNode invertedTree = mirror(A.left);

        if (isSameTree(invertedTree,A.right) == 1){
            return 1;
        }else {
            return 0;
        }
    }

    static TreeNode mirror(TreeNode A){

        if (A == null){
            return A;
        }

        TreeNode B = A.left;
        A.left = A.right;
        A.right = B;

        mirror(A.left);
        mirror(A.right);

        return A;
    }

    static int isSameTree(TreeNode A, TreeNode B) {

        if (A == null && B == null){return 1;}
        if (A == null || B == null){return 0;}

        if ((A.val == B.val) && (isSameTree(A.left,B.left) == 1) && (isSameTree(A.right,B.right) == 1)){
            return 1;
        }
        return 0;
    }
}
