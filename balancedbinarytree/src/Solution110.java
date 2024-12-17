/**
 * 项目名称：algorithm
 * 类名称：Solution110
 * 作者：tkj
 * 日期：2024/12/4
 * 描述：
 */
public class Solution110 {
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return res;
    }
    public int depth(TreeNode root) {
        if(root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        if(Math.abs(left - right) > 1) res = false;
        return Math.max(left, right) + 1;
    }
}
