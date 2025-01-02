import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution115
 * 作者：tkj
 * 日期：2024/12/31
 * 描述：
 */
public class Solution115 {
    public int numDistinct(String s, String t) {
        // int[][] dp = new int[t.length()+1][s.length()+1];
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp,1);
        // dp[0][0] = 1;
        // for(int i = 0;i<s.length();i++){
        //     dp[0][i] = 1;
        // }
        for(int i = 1;i<=t.length();i++){
            int prev = dp[0];
            dp[0] = 0;
            for(int j = 1;j<=s.length();j++){
                int cur = prev;
                prev = dp[j];
                // if(t.charAt(i-1) == s.charAt(j-1)){
                //     dp[i][j] += dp[i-1][j-1]+ dp[i][j-1];
                // }else{
                //     dp[i][j] = dp[i][j-1];
                // }
                if(t.charAt(i-1) == s.charAt(j-1)){
                    dp[j] = dp[j-1] + cur;
                }else{
                    dp[j] = dp[j-1];
                }
            }
        }
        return dp[s.length()];
    }
}
