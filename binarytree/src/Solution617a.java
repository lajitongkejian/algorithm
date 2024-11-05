/**
 * 项目名称：algorithm
 * 类名称：Solution617
 * 作者：tkj
 * 日期：2024/11/5
 */
public class Solution617a {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

}
