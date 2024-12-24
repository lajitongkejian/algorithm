/**
 * 项目名称：algorithm
 * 类名称：Solution96
 * 作者：tkj
 * 日期：2024/12/17
 * 描述：
 */
public class Solution96 {
    public int numTrees(int n) {
        if(n==1 || n==2) return n;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=n;i++){
            for(int j = 0;j<i;j++){
                dp[i] += dp[i-1-j]*dp[j];
            }
        }
        return dp[n];
    }
}
