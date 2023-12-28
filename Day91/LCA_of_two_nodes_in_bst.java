package Day91;

import Day71.TreeNode;

/*Sample Input 1 :
3 5
2 1 3 -1 -1 -1 5 -1 -1
Sample Output 1:
3
Explanation for Sample 1:
The BST corresponding will be-
Here, we can clearly see that LCA of node 3 and node 5 is 3.
Sample Input 2 :
1 2
3 2 -1 1 -1 -1 -1
Sample Output 2:
2 */
public class LCA_of_two_nodes_in_bst {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(5);
        TreeNode leftleft = new TreeNode(2, left, null);
        TreeNode root = new TreeNode(4, leftleft, right);
        TreeNode ans = LCAinaBST(root, left, right);
        System.out.println(ans.val);
    }

    public static TreeNode LCAinaBST(TreeNode root, TreeNode p, TreeNode q) {
        // Write your code here.
        if (root == null)
            return null;
        if (p.val > root.val && q.val > root.val)
            return LCAinaBST(root.right, p, q);
        else if (p.val < root.val && q.val < root.val)
            return LCAinaBST(root.left, p, q);
        else
            return root;
    }
}
