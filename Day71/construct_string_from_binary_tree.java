package Day71;

/*Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it.
Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.
Example 1:
Input: root = [1,2,3,4]
Output: "1(2(4))(3)"
Explanation: Originally, it needs to be "1(2(4)())(3()())", but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"
Example 2:
Input: root = [1,2,3,null,4]
Output: "1(2()(4))(3)"
Explanation: Almost the same as the first example, except we cannot omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output. */
public class construct_string_from_binary_tree {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(3);
        TreeNode leftleft = new TreeNode(2, left, null);
        TreeNode root = new TreeNode(1, leftleft, right);
        System.out.println(tree2str(root));
    }

    public static String tree2str(TreeNode root) {
        StringBuilder res = new StringBuilder();
        dfs(root, res);
        return res.toString();
    }

    public static void dfs(TreeNode root, StringBuilder res) {
        if (root == null)
            return;
        res.append(String.valueOf(root.val));
        if (root.left == null && root.right == null)
            return;
        res.append('(');
        dfs(root.left, res);
        res.append(')');
        if (root.right != null) {
            res.append('(');
            dfs(root.right, res);
            res.append(')');
        }
    }
}
