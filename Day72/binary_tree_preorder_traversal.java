package Day72;

/*Given the root of a binary tree, return the preorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]
Example 2:
Input: root = []
Output: []
Example 3:
Input: root = [1]
Output: [1]
  */
import java.util.ArrayList;
import java.util.List;

import Day71.TreeNode;

public class binary_tree_preorder_traversal {
    public static void main(String[] args) {
        TreeNode right = new TreeNode(3);
        TreeNode rightLeft = new TreeNode(2, null, right);
        TreeNode root = new TreeNode(1, rightLeft, null);
        System.out.println(preorderTraversal(root));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res;
    }

    public static void preOrder(TreeNode t, List<Integer> res) {
        if (t != null) {
            res.add(t.val);
            preOrder(t.left, res);
            preOrder(t.right, res);
        }
    }
}
