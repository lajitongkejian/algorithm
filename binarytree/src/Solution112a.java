/**
 * 项目名称：algorithm
 * 类名称：Solution112a
 * 作者：tkj
 * 日期：2024/11/3
 */
public class Solution112a {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right==null) return targetSum - root.val==0;
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}
