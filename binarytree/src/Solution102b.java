import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution102b
 * 作者：tkj
 * 日期：2024/11/29
 * 描述：
 */
public class Solution102b {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root,0);
        return res;
    }
    public void traverse(TreeNode node,int depth) {
        if(node == null) return;
        if(res.size() <= depth)  res.add(new ArrayList<>());
        res.get(depth).add(node.val);
        traverse(node.left,depth+1);
        traverse(node.right,depth+1);
    }
}
