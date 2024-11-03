import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution15b
 * 作者：tkj
 * 日期：2024/11/3
 */
public class Solution15b {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int k = 0; k < nums.length-2; k++) {
            if(nums[k] > 0) break;
            int i = k + 1;
            int j = nums.length - 1;
            if(k>0 && nums[k-1] == nums[k]) continue;
            while(i<j){
                if(i>k+1 && nums[i] == nums[i-1]) {i++;continue;}
                if(j<nums.length-1 && nums[j] == nums[j+1]) {j--;continue;}
                if(nums[i] + nums[j] + nums[k]==0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    i++;
                    j--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    i++;
                }else {
                    j--;
                }
            }
        }
        return res;

    }
}
