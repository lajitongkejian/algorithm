/**
 * 项目名称：algorithm
 * 类名称：Solution647
 * 作者：tkj
 * 日期：2025/1/2
 * 描述：
 */
public class Solution647 {
    public int countSubstrings(String s) {
        int size = s.length();
        boolean[][] dp = new boolean[s.length()+1][s.length()+1];
        int count = 0;
        dp[0][0] = true;
        for(int i = size;i>0;i--){
            // dp[i][i] = true;
            for(int j = i;j<=size;j++){
                if(s.charAt(i-1) == s.charAt(j-1)){
                    dp[i][j] = (i+1>=j-1) || dp[i+1][j-1];
                }
                if(dp[i][j]) count++;
            }
        }
        return count;
    }
}
