/**
 * 项目名称：algorithm
 * 类名称：Solution198
 * 作者：tkj
 * 日期：2024/12/26
 * 描述：
 */
public class Solution198 {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int dp0 = nums[0];
        int dp1 = Math.max(nums[0],nums[1]);
        int max = Math.max(nums[0],nums[1]);
        for(int i = 2;i<nums.length;i++){
            int temp = dp1;
            dp1 = Math.max(dp1,dp0+nums[i]);
            max = Math.max(dp1,max);
            dp0 = temp;
        }
        return max;
    }
}
