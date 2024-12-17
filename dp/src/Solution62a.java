import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution62a
 * 作者：tkj
 * 日期：2024/12/17
 * 描述：
 */
public class Solution62a {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 1;i < m ;i++){
            int prev = 1;
            for(int j = 1;j < n;j++){
                dp[j] = prev + dp[j];
                prev = dp[j];
            }
        }
        return dp[n-1];
    }
}
