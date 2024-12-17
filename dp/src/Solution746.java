/**
 * 项目名称：algorithm
 * 类名称：Solution746
 * 作者：tkj
 * 日期：2024/12/17
 * 描述：
 */
public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int dp0 = 0;
        int dp1 = 0;
        for(int i = 2; i < cost.length+1; i++) {
            int temp = dp1;
            dp1 = Math.min(dp0 + cost[i-2],dp1 + cost[i-1]);
            dp0 = temp;
        }
        return dp1;
    }
}
