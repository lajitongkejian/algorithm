/**
 * 项目名称：algorithm
 * 类名称：Solution104a
 * 作者：tkj
 * 日期：2024/11/3
 */
public class Solution104a {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return left > right ? left : right;
    }
}
