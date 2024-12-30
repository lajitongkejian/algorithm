/**
 * 项目名称：algorithm
 * 类名称：Solution309
 * 作者：tkj
 * 日期：2024/12/27
 * 描述：
 */
public class Solution309 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[2][3];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = -prices[0];
        for(int i = 1;i<prices.length;i++){
            dp[1][0] = Math.max(dp[0][0],dp[0][1]);          //0 1 2
            dp[1][1] = dp[0][2]+prices[i];                //1 2 -1
            dp[1][2] = Math.max(dp[0][2],dp[0][0]-prices[i]);//-1 -1 2
            dp[0][0] = dp[1][0];
            dp[0][1] = dp[1][1];
            dp[0][2] = dp[1][2];
        }
        return Math.max(dp[1][0],dp[1][1]);
    }
}
