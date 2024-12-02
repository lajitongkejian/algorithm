/**
 * 项目名称：algorithm
 * 类名称：TreeNode
 * 作者：tkj
 * 日期：2024/11/1
 * 注：a解法为递归，b解法为迭代
 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
