package datastructures.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    public static void main(String[] args) {

    }

    // using recursion
    public List<Integer> dfs(TreeNode root, List<Integer> list) {

        if(root == null) {
            return list;
        }

        list.add(root.val);
        list = dfs(root.left, list);
        return dfs(root.right, list);
    }

    // using iterative approach

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> preorderList = new ArrayList<>();

        if(root == null) return preorderList;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {

            root = stack.pop();
            preorderList.add(root.val);
            if(root.right != null) {
                stack.push(root.right);
            }
            if(root.left != null) {
                stack.push(root.left);
            }
        }

        return preorderList;
    }
}
