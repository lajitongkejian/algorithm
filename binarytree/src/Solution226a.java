/**
 * 项目名称：algorithm
 * 类名称：Solution226
 * 作者：tkj
 * 日期：2024/11/3
 */
public class Solution226a {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    public void invert(TreeNode root) {
        if(root == null) return;
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invert(root.left);
        invert(root.right);
    }
}
