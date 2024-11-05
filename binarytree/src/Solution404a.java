/**
 * 项目名称：algorithm
 * 类名称：Solution404
 * 作者：tkj
 * 日期：2024/11/5
 */
public class Solution404a {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        leftTraversal(root);
        return sum;
    }
    public void leftTraversal(TreeNode root) {
        if(root == null) return;
        if(root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
            leftTraversal(root.right);
            return;
        }
        leftTraversal(root.left);
        leftTraversal(root.right);
    }
}
