import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution78
 * 作者：tkj
 * 日期：2025/1/5
 * 描述：
 */
public class Solution78 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(0,new ArrayList<Integer>(),nums);
        return res;
    }
    public void backTrack(int index, List<Integer> list, int[] nums){
        if(list.size() <= nums.length){
            res.add(new ArrayList<Integer>(list));
        }
        for(int i = index;i<nums.length;i++){
            list.add(nums[i]);
            backTrack(i+1,list,nums);
            list.remove(list.size()-1);
        }
    }
}
