import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution145a
 * 作者：tkj
 * 日期：2024/11/18
 * 描述：
 */
public class Solution145a {
    private List<Integer> result = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return result;
    }
    public void traverse(TreeNode root) {
        if(root == null) return;
        traverse(root.left);
        traverse(root.right);
        result.add(root.val);
    }
}
