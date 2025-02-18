/**
 * 项目名称：algorithm
 * 类名称：Solution53
 * 作者：tkj
 * 日期：2025/1/21
 * 描述：
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int res = nums[0];
        int sum = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(sum < 0) sum = 0;
            sum+=nums[i];
            res = Math.max(sum,res);
        }
        return res;
    }
}
