/**
 * 项目名称：algorithm
 * 类名称：Solution343
 * 作者：tkj
 * 日期：2024/12/17
 * 描述：
 */
public class Solution343 {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i <= n ;i++){
            dp[i] = 1;
            for(int j = 1;j<i;j++){
                dp[i] = Math.max(Math.max(dp[i],dp[i-j]*j),(i-j)*j);
            }
        }
        return dp[n];
    }
}
