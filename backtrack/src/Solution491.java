import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution491
 * 作者：tkj
 * 日期：2025/1/5
 * 描述：
 */
public class Solution491 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backTrack(0,new ArrayList<Integer>(),nums,new HashSet<Integer>());
        return res;
    }
    public void backTrack(int index, List<Integer> list, int[] nums, HashSet<Integer> used){
        if(list.size() >1 && list.size() <= nums.length){
            res.add(new ArrayList<Integer>(list));
        }
        // int prev = -101;
        for(int i = index;i<nums.length;i++){
            if(!used.contains(nums[i])){
                if(list.size()==0 || list.get(list.size()-1) <= nums[i]){
                    list.add(nums[i]);
                    backTrack(i+1,list,nums,new HashSet<Integer>());
                    list.remove(list.size()-1);
                    used.add(nums[i]);
                }
            }
        }
    }
}
