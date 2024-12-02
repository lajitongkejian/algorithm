import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution98
 * 作者：tkj
 * 日期：2024/12/1
 * 描述：
 */
public class Solution98a {

    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        traverse(root);
        for (int i = 1; i < list.size() ; i++) {
            if(list.get(i) <= list.get(i-1)) return false;
        }
        return true;
    }
    public void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }



}
