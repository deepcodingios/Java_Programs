package Trees;

//import javax.swing.tree.TreeNode;
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
}
