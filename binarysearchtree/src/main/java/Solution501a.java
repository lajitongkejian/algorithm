import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution501
 * 作者：tkj
 * 日期：2024/12/2
 * 描述：
 */
public class Solution501a {
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        traverse(root);
        List<Integer> res = new ArrayList<>();
        int max = 0;
        int cnt = 0;
        int pre = list.get(0);
        res.add(list.get(0));
        for(int i = 1; i < list.size(); i++){
            if(pre == list.get(i)){
                cnt++;
            }else{
                cnt = 0;
            }
            if(cnt == max){
                res.add(list.get(i));
            } else if (cnt > max) {
                res.clear();
                res.add(list.get(i));
                max = cnt;
            }
            pre = list.get(i);
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
    public void traverse(TreeNode root) {
        if(root == null) return;
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }



}
