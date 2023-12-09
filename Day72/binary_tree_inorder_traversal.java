package Day72;

/*Given the root of a binary tree, return the inorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:
Input: root = []
Output: []
Example 3:
Input: root = [1]
Output: [1] */
import java.util.ArrayList;
import java.util.List;

import Day71.TreeNode;

public class binary_tree_inorder_traversal {
    public static void main(String[] args) {
        TreeNode right = new TreeNode(3);
        TreeNode rightLeft = new TreeNode(1, null, right);
        TreeNode root = new TreeNode(2, rightLeft, null);
        System.out.println(inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res;
    }

    public static void preOrder(TreeNode t, List<Integer> res) {
        if (t == null)
            return;
        preOrder(t.left, res);
        res.add(t.val);
        preOrder(t.right, res);
    }
}
