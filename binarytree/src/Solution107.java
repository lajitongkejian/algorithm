import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution107
 * 作者：tkj
 * 日期：2024/11/29
 * 描述：
 */
public class Solution107 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        traverse(root, 0);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = res.size() - 1; i >= 0; i--){
            ans.add(res.get(i));
        }
        return ans;
    }
    public void traverse(TreeNode root,int depth) {
        if(root == null) return;
        if(res.size() <= depth) res.add(new ArrayList<>());
        traverse(root.left,depth+1);
        traverse(root.right,depth+1);
        res.get(depth).add(root.val);
    }
}
