import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution77
 * 作者：tkj
 * 日期：2025/1/4
 * 描述：
 */
public class Solution77 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        backTrack(list,k,n);
        return res;
    }
    public void backTrack(List<Integer> list,int k,int n){
        if(k==0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = n;i>0;i--){
            list.add(i);
            backTrack(list,k-1,i-1);
            list.remove(list.size()-1);
        }

    }
}
