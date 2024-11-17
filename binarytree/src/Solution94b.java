import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 项目名称：algorithm
 * 类名称：Solution94b
 * 作者：tkj
 * 日期：2024/11/16
 * 描述：
 */
public class Solution94b {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        while (null != root || stack.isEmpty() == false) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
