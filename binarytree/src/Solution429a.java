import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution429a
 * 作者：tkj
 * 日期：2024/11/29
 * 描述：
 */
public class Solution429a {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        traverse(root,0);
        return res;
    }

    public void traverse(Node root,int depth) {
        if(root == null) return;
        if(res.size() <= depth) res.add(new ArrayList<>());
        res.get(depth).add(root.val);
        for(Node child : root.children){
            traverse(child,depth+1);
        }
    }
}
