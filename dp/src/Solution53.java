/**
 * 项目名称：algorithm
 * 类名称：Solution53
 * 作者：tkj
 * 日期：2024/12/13
 * 描述：
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] + dp[i-1] > nums[i]) {
                dp[i] = nums[i] + dp[i-1];
            }else dp[i] = nums[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > max) max = dp[i];
        }
        return max;
    }
}
