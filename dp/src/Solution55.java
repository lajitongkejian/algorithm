/**
 * 项目名称：algorithm
 * 类名称：Solution55
 * 作者：tkj
 * 日期：2024/12/13
 * 描述：
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        //dp[i]:当你不超过i位置时所能跳到的最远位置
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(dp[i-1] < i) return false;
            dp[i] = Math.max(dp[i-1],i+nums[i]);
            if(dp[i] >= nums.length-1) return true;
        }
        return false;
    }
}
