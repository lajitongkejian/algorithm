/**
 * 项目名称：algorithm
 * 类名称：Solution322
 * 作者：tkj
 * 日期：2024/12/11
 * 描述：
 */
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for(int i = 1;i<=amount;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<coins.length;j++){
                if(i-coins[j] >= 0 && dp[i-coins[j]]!=-1){
                    int temp = dp[i-coins[j]] + 1;
                    min = Math.min(min, temp);
                }
            }
            if(min == Integer.MAX_VALUE) dp[i] = -1;
            else dp[i] = min;
        }
        return dp[amount];
    }
}
