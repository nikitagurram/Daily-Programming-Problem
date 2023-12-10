package Day73;

import java.util.ArrayList;
import java.util.List;

import Day71.TreeNode;

/*Given the root of a binary tree, return the postorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]
Example 2:
Input: root = []
Output: []
Example 3:
Input: root = [1]
Output: [1] */
public class binary_tree_postorder_traversal {
    public static void main(String[] args) {
        TreeNode right = new TreeNode(3);
        TreeNode rightLeft = new TreeNode(2, null, right);
        TreeNode root = new TreeNode(1, rightLeft, null);
        System.out.println(postorderTraversal(root));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root, res);
        return res;
    }

    public static void postOrder(TreeNode t, List<Integer> res) {
        if (t != null) {
            postOrder(t.left, res);
            postOrder(t.right, res);
            res.add(t.val);
        }
    }
}
