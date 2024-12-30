/**
 * 项目名称：algorithm
 * 类名称：Solution188
 * 作者：tkj
 * 日期：2024/12/27
 * 描述：
 */
public class Solution188 {
    public int maxProfit(int k, int[] prices) {
        int size = 2*k+1;
        int[] dp = new int[size];
        for(int i = 0;i<size;i++){
            if(i%2 == 0) dp[i] = 0;
            else dp[i] = -prices[0];
        }
        for(int i = 1; i< prices.length;i++){
            for(int j = 1;j < size;j++){
                if(j%2==0) dp[j] = Math.max(dp[j],dp[j-1]+prices[i]);
                else dp[j] = Math.max(dp[j],dp[j-1]-prices[i]);
            }
        }
        return dp[size-1];
    }
}
