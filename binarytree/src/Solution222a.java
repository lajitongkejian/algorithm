/**
 * 项目名称：algorithm
 * 类名称：Solution222
 * 作者：tkj
 * 日期：2024/11/3
 */
public class Solution222a {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
