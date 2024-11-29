import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution199
 * 作者：tkj
 * 日期：2024/11/29
 * 描述：
 */
public class Solution199a {
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root, 0);
        return res;
    }
    public void traverse(TreeNode root,int depth) {
        if(root == null) return;
        if(res.size() < depth) res.add(root.val);
        else res.set(depth, root.val);
        traverse(root.left, depth + 1);
        traverse(root.right, depth + 1);
    }
}
