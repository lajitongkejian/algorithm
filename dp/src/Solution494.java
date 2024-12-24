import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution494
 * 作者：tkj
 * 日期：2024/12/24
 * 描述：
 */
public class Solution494 {
    public int findTargetSumWays(int[] nums, int target) {
        target = Math.abs(target);
        int sum = Arrays.stream(nums).sum();
        if (target > sum || ((sum - target) % 2 != 0)) return 0;
        int goal = (sum - target) / 2;
        int[] dp = new int[goal + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = goal; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[goal];
    }
}
