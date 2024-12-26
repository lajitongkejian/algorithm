import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution322
 * 作者：tkj
 * 日期：2024/12/11
 * 描述：
 */
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int j = 0;j<amount+1;j++){
            for(int i = 0;i<coins.length;i++){
                if(j-coins[i]>=0 && dp[j-coins[i]]!=Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE ? -1:dp[amount];
    }
}
