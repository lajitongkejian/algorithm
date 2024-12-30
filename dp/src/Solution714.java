/**
 * 项目名称：algorithm
 * 类名称：Solution714
 * 作者：tkj
 * 日期：2024/12/27
 * 描述：
 */
public class Solution714 {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[2][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0] - fee;
        for(int i = 1;i<prices.length;i++){
            dp[1][0] = Math.max(dp[0][0],dp[0][1]+prices[i]);
            dp[1][1] = Math.max(dp[0][1],dp[0][0]-fee-prices[i]);
            dp[0][0] = dp[1][0];
            dp[0][1] = dp[1][1];
        }
        return dp[1][0];
    }
}
