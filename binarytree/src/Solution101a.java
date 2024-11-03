/**
 * 项目名称：algorithm
 * 类名称：Solution101
 * 作者：tkj
 * 日期：2024/11/3
 */
public class Solution101a {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric2(root.left,root.right);
    }
    public boolean isSymmetric2(TreeNode root1, TreeNode root2) {
        if(root1 == null) return root2 == null;
        if(root2 == null) return root1 == null;
        if(root1.val != root2.val) return false;
        return isSymmetric2(root1.left,root2.right) && isSymmetric2(root1.right,root2.left);
    }

}
