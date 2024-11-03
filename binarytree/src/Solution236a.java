/**
 * 项目名称：algorithm
 * 类名称：Solution236
 * 作者：tkj
 * 日期：2024/11/3
 */
public class Solution236a {
    //函数定义为在以root为根的树中p与q的最近公共祖先，如果该树中没有p或q则返回null
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }

}
