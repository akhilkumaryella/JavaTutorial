package datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

    public static void main(String[] args) {


    }

    // recursion
    public static List<Integer> dfs(TreeNode root, List<Integer> list) {

        if(root == null) return list;

        list = dfs(root.left, list);
        list = dfs(root.right, list);
        list.add(root.val);


        return list;
    }

    // iterative approach
    
}
