/**
 * 项目名称：algorithm
 * 类名称：Solution213
 * 作者：tkj
 * 日期：2024/12/26
 * 描述：
 */
public class Solution213 {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int[] dp = new int[2];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        int max1 = Math.max(dp[0],dp[1]);
        for(int i = 2;i < nums.length-1;i++){
            int temp = dp[1];
            dp[1] = Math.max(dp[1],dp[0]+nums[i]);
            dp[0] = temp;
            max1 = Math.max(max1,dp[1]);
        }
        dp[0] = nums[1];
        dp[1] = Math.max(nums[2],nums[1]);
        int max2 = Math.max(dp[0],dp[1]);
        for(int i = 3;i < nums.length;i++){
            int temp = dp[1];
            dp[1] = Math.max(dp[1],dp[0]+nums[i]);
            dp[0] = temp;
            max2 = Math.max(max2,dp[1]);
        }
        return Math.max(max1,max2);
    }
}
