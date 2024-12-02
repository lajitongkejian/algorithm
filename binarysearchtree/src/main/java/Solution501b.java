import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution501b
 * 作者：tkj
 * 日期：2024/12/3
 * 描述：
 */
public class Solution501b {
    List<Integer> res = new ArrayList<Integer>();
    int max = 0;
    int cnt = 0;
    Integer prev = null;
    public int[] findMode(TreeNode root) {
        dfs(root);
        return res.stream().mapToInt(i -> i).toArray();
    }
    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if(prev != null){
            if(prev != root.val){
                cnt = 0;
            }else{
                cnt ++;
            }
        }else{
            prev = root.val;
            res.add(root.val);
            dfs(root.right);
            return;
        }
        if(cnt > max){
            max = cnt;
            res.clear();
            res.add(root.val);
        }
        else if(cnt == max){
            res.add(root.val);
        }
        prev = root.val;
        dfs(root.right);
    }
}
