/**
 * 项目名称：algorithm
 * 类名称：Solution111a
 * 作者：tkj
 * 日期：2024/11/3
 */
public class Solution111a {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left == null && root.right == null) return 1;
        if(root.left==null) return minDepth(root.right) + 1;
        if(root.right==null) return minDepth(root.left) + 1;
        int left = minDepth(root.left) + 1;
        int right = minDepth(root.right) + 1;
        return Math.min(left, right);
    }
}
