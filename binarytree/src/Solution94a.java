import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution94
 * 作者：tkj
 * 日期：2024/11/16
 * 描述：
 */
public class Solution94a {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traverse(list,root);
        return list;
    }
    public void traverse(List<Integer> list ,TreeNode root){
        if(root == null) return;
        traverse(list,root.left);
        list.add(root.val);
        traverse(list,root.right);
    }
}
