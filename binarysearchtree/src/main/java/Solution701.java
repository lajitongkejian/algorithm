/**
 * 项目名称：algorithm
 * 类名称：Solution701
 * 作者：tkj
 * 日期：2024/12/3
 * 描述：
 */
public class Solution701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.val > val) root.left = insertIntoBST(root.left, val);
        if(root.val < val) root.right = insertIntoBST(root.right, val);
        return root;
    }
}
