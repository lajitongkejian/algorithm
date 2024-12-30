/**
 * 项目名称：algorithm
 * 类名称：Solution1143
 * 作者：tkj
 * 日期：2024/12/30
 * 描述：
 */
public class Solution1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        // int[][] dp = new int[text1.length()+1][text2.length()+1];
        int[] dp = new int[text2.length()+1];
        int max = 0;
        for(int i = 1;i <=text1.length();i++){
            int pre = dp[0];
            for(int j = 1;j<=text2.length();j++){
                // if(text1.charAt(i-1)==text2.charAt(j-1)){
                //     dp[i][j] = dp[i-1][j-1]+1;
                // }else{
                //     dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                // }
                // max = Math.max(max,dp[i][j]);
                int cur = dp[j];
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[j] = pre+1;
                }else{
                    dp[j] = Math.max(dp[j],dp[j-1]);
                }
                pre = cur;
                // max = Math.max(max,dp[j]);
            }
        }
        return dp[dp.length-1];
    }
}
