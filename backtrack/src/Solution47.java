import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution47
 * 作者：tkj
 * 日期：2025/1/4
 * 描述：
 */
public class Solution47 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        backTrack(list,nums,used);
        return res;
    }
    public void backTrack(List<Integer> list,int[] nums,boolean[] used){
        if(list.size()==nums.length){
            res.add(new ArrayList(list));
            return;
        }
        int prev = -11;
        for(int i = 0;i<nums.length;i++){
            if(prev != nums[i] && !used[i]){
                used[i] = true;
                list.add(nums[i]);
                backTrack(list,nums,used);
                list.remove(list.size()-1);
                used[i] = false;
                prev = nums[i];
            }
        }
    }
}
