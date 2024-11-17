import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution144a
 * 作者：tkj
 * 日期：2024/11/15
 * 描述：
 */
public class Solution144a {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        preTraversal(root, list);
        return list;
    }

    public void preTraversal(TreeNode root,List<Integer> list) {
        if(null != root){
            list.add(root.val);
            preTraversal(root.left,list);
            preTraversal(root.right,list);
        }
    }
}
