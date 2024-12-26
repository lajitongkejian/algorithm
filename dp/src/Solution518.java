import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution518
 * 作者：tkj
 * 日期：2024/12/25
 * 描述：
 */
public class Solution518 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        Arrays.sort(coins);
        dp[0] = 1;
        for(int i = 0;i < coins.length;i++){
            for(int j = coins[i];j < amount+1;j++){
                dp[j] = dp[j] + dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}
