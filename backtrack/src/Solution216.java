import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution216
 * 作者：tkj
 * 日期：2025/1/4
 * 描述：
 */
public class Solution216 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<Integer>();
        backTrack(k,n,list,1);
        return res;
    }
    public void backTrack(int k, int n,List<Integer> list,int m){
        if(n<0) return;
        if(n == 0 && k == 0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        // if(k<=0) return;
        for(int i = m;i<=9;i++){
            list.add(i);
            backTrack(k-1,n-i,list,i+1);
            list.remove(list.size()-1);
        }
    }
}
