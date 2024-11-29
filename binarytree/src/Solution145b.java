import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 项目名称：algorithm
 * 类名称：Solution145b
 * 作者：tkj
 * 日期：2024/11/18
 * 描述：
 */
public class Solution145b {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        while(null != root || !stack.isEmpty()){
            while(null != root){
                stack.push(root);
                if(root.left != null) root = root.left;
                else root = root.right;
            }
            root = stack.pop();
            res.add(root.val);
            if(!stack.isEmpty() && stack.peek().left == root){
                root = stack.peek().right;
            }else root = null;
        }
        return res;
    }
}
