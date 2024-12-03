/**
 * 项目名称：algorithm
 * 类名称：Solution669
 * 作者：tkj
 * 日期：2024/12/3
 * 描述：
 */
public class Solution669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null;
        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);
        if(root.val > high) return root.left;
        if(root.val < low) return root.right;
        return root;
    }
}
