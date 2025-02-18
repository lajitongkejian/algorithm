import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution40
 * 作者：tkj
 * 日期：2025/1/4
 * 描述：
 */
public class Solution40 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(candidates);
        trackBack(list,candidates,target,0);
        return res;
    }
    public void trackBack(List<Integer> list,int[] candidates, int target,int index){
        if(target==0){
            res.add(new ArrayList(list));
            return;
        }
        if(target<0) return;
        int prev = 0;
        for(int i = index;i<candidates.length;i++){
            if(prev!=candidates[i]){
                list.add(candidates[i]);
                trackBack(list,candidates,target-candidates[i],i+1);
                list.remove(list.size()-1);
            }
            prev = candidates[i];
        }
    }
}
