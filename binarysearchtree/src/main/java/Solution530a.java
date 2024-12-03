import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution530
 * 作者：tkj
 * 日期：2024/12/3
 * 描述：
 */
public class Solution530a {
    List<Integer> list = new ArrayList<Integer>();
    public int getMinimumDifference(TreeNode root) {
        travers(root);
        int min = Integer.MAX_VALUE;
        int prev = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) - prev < min){
                min = list.get(i) - prev;
            }
            prev = list.get(i);
        }
        return min;
    }
    public void travers(TreeNode root){
        if(root == null) return;
        travers(root.left);
        list.add(root.val);
        travers(root.right);
    }
}
