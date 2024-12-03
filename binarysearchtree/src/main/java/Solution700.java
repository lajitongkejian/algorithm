/**
 * 项目名称：algorithm
 * 类名称：Solution700
 * 作者：tkj
 * 日期：2024/12/3
 * 描述：
 */
public class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if(root.val == val) return root;
        if(root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }

}
