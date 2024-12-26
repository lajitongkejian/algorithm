/**
 * 项目名称：algorithm
 * 类名称：Solution279
 * 作者：tkj
 * 日期：2024/12/25
 * 描述：
 */
public class Solution279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        // Arrays.fill(dp,Integer.MAX_VALUE);
        for (int j = 0; j <= n; j++) {
            dp[j] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i<n+1;i++){
            for(int j = 1;j * j<=i;j++){
                dp[i] = Math.min(dp[i-j*j] + 1,dp[i]);
            }
        }
        return dp[n];
    }
}
