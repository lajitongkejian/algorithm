import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution46
 * 作者：tkj
 * 日期：2025/1/4
 * 描述：
 */
public class Solution46 {


    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        boolean[] used = new boolean[nums.length];
        backTrack(nums,list,used);
        return res;
    }
    public void backTrack(int[] nums,List<Integer> list,boolean[] used){
        if(list.size()==nums.length){
            res.add(new ArrayList(list));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(!used[i]){
                list.add(nums[i]);
                used[i] = true;
                backTrack(nums,list,used);
                list.remove(list.size()-1);
                used[i] = false;
            }
        }
    }
}
