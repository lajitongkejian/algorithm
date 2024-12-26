import java.util.LinkedList;

/**
 * 项目名称：algorithm
 * 类名称：Solution337
 * 作者：tkj
 * 日期：2024/12/26
 * 描述：
 */
public class Solution337 {
    public int rob(TreeNode root) {
        int[] res = robTraverse(root);
        return Math.max(res[0],res[1]);
    }
    public int[] robTraverse(TreeNode root){
        int[] res = new int[2];
        if(root==null) return res;
        int[] left = robTraverse(root.left);
        int[] right = robTraverse(root.right);
        res[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        res[1] = root.val + left[0]+right[0];
        return res;
    }

}
