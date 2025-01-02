/**
 * 项目名称：algorithm
 * 类名称：Solution516
 * 作者：tkj
 * 日期：2025/1/2
 * 描述：
 */
public class Solution516 {
    public int longestPalindromeSubseq(String s) {
        int size = s.length();
        int[][] dp = new int[size+1][size+1];
        int max = 0;
        for(int i = size;i>0;i--){
            for(int j = i;j<=size;j++){
                if(i == j) dp[i][j] = 1;
                else{
                    if(s.charAt(i-1) == s.charAt(j-1)){
                        dp[i][j] = dp[i+1][j-1] + 2;
                    }else{
                        dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                    }
                }
                max = Math.max(dp[i][j],max);
            }
        }
        return max;
    }
}
