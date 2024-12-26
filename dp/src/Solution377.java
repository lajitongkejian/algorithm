/**
 * 项目名称：algorithm
 * 类名称：Solution377
 * 作者：tkj
 * 日期：2024/12/25
 * 描述：
 */
public class Solution377 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int j = 0;j <= target;j++){
            for(int i = 0;i<nums.length;i++){
                if(j >= nums[i])
                    dp[j] = dp[j] + dp[j-nums[i]];
            }
        }
        return dp[target];
    }
}
