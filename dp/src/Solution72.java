/**
 * 项目名称：algorithm
 * 类名称：Solution72
 * 作者：tkj
 * 日期：2025/1/2
 * 描述：
 */
public class Solution72 {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int i = 1;i<=word1.length();i++) dp[i][0] = i;
        for(int j = 1;j <= word2.length();j++) dp[0][j] = j;
        for(int i = 1;i<=word1.length();i++){
            for(int j = 1;j <= word2.length();j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]) + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
