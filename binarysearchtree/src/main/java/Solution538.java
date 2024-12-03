/**
 * 项目名称：algorithm
 * 类名称：Solution538
 * 作者：tkj
 * 日期：2024/12/3
 * 描述：
 */
public class Solution538 {
    int prev = 0;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }
    public void traverse(TreeNode root) {
        if(root == null) return;
        traverse(root.right);
        root.val += prev;
        prev = root.val;
        traverse(root.left);
    }
}
